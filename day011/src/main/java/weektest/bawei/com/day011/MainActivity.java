package weektest.bawei.com.day011;
import android.widget.ListView;


import com.google.gson.Gson;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;

import java.util.ArrayList;

import weektest.bawei.com.day011.bean1.Ding;
import weektest.bawei.com.day011.bean1.Ding1;
import weektest.bawei.com.day011.bean1.Ding3;


public class MainActivity extends BaseActivity {
   private PullToRefreshListView listView;
    private MyListAdapter adapter;
    private ArrayList<Ding1> list;

    private String url="http://172.17.8.100/small/commodity/v1/commodityList";

    @Override
    protected int bindLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
       listView = bindView(R.id.listview);
    }

    @Override
    protected void initData() {

        listView.setMode(PullToRefreshBase.Mode.BOTH);
        listView.setPullToRefreshOverScrollEnabled(true);
        listView.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener2<ListView>() {
            @Override
            public void onPullDownToRefresh(PullToRefreshBase<ListView> refreshView) {
                HttpUtil.getAsyncTask(url, new HttpUtil.CallBackA() {
                    @Override
                    public void getData(String s) {
                        Gson gson=new Gson();
                        Ding ding = gson.fromJson(s, Ding.class);
                        Ding3 result = ding.getResult();
                        ArrayList<Ding1> commodityList = result.getMlss().getCommodityList();
                        ArrayList<Ding1> commodityList1 = result.getPzsh().getCommodityList();
                        ArrayList<Ding1> commodityList2 = result.getRxxp().getCommodityList();
                        list = new ArrayList<>();
                        list.addAll(commodityList);
                        list.addAll(commodityList1);
                        list.addAll(commodityList2);
                        adapter = new MyListAdapter(MainActivity.this, list);
                        listView.setAdapter(adapter);
                        listView.onRefreshComplete();
                    }
                });
            }

            @Override
            public void onPullUpToRefresh(PullToRefreshBase<ListView> refreshView) {
                HttpUtil.getAsyncTask(url, new HttpUtil.CallBackA() {
                    @Override
                    public void getData(String s) {
                        Gson gson=new Gson();
                        Ding ding = gson.fromJson(s, Ding.class);
                        Ding3 result = ding.getResult();
                        ArrayList<Ding1> commodityList = result.getMlss().getCommodityList();
                        ArrayList<Ding1> commodityList1 = result.getPzsh().getCommodityList();
                        ArrayList<Ding1> commodityList2 = result.getRxxp().getCommodityList();
                        ArrayList<Ding1> list2 = new ArrayList<>();
                        list2.addAll(commodityList);
                        list2.addAll(commodityList1);
                        list2.addAll(commodityList2);
                        list.addAll(list2);
                        adapter.notifyDataSetChanged();
                        listView.onRefreshComplete();
                    }
                });

            }
        });


    }

    @Override
    protected void bindEvent() {
        HttpUtil.getAsyncTask(url, new HttpUtil.CallBackA() {


            @Override
            public void getData(String s) {
                Gson gson=new Gson();
                Ding ding = gson.fromJson(s, Ding.class);
                Ding3 result = ding.getResult();
                ArrayList<Ding1> commodityList = result.getMlss().getCommodityList();
                ArrayList<Ding1> commodityList1 = result.getPzsh().getCommodityList();
                ArrayList<Ding1> commodityList2 = result.getRxxp().getCommodityList();
                list = new ArrayList<>();
                list.addAll(commodityList);
                list.addAll(commodityList1);
                list.addAll(commodityList2);
                adapter = new MyListAdapter(MainActivity.this, list);
                listView.setAdapter(adapter);
            }
        });
    }

}
