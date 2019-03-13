package weektest.bawei.com.day011;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import weektest.bawei.com.day011.bean1.Ding1;

/**
 * @Author：Lenovo
 * @E-mail：
 * @Date：2019/3/4 9:17
 * @Description：描述信息
 */
public class MyListAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Ding1> list;

    public MyListAdapter(Context context, ArrayList<Ding1> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView==null){
            convertView=View.inflate(context, R.layout.list_item,null);
            holder=new ViewHolder();
            holder.imageView=convertView.findViewById(R.id.imageview);
            holder.textView=convertView.findViewById(R.id.text_name);
            holder.textView1=convertView.findViewById(R.id.text_pric);
            convertView.setTag(holder);
        }else{
            holder= (ViewHolder) convertView.getTag();
        }
        Ding1 da = list.get(position);
        holder.textView.setText(da.getCommodityName());
        holder.textView1.setText(da.getPrice());
        Glide.with(context).load(da.getMasterPic()).into(holder.imageView);
        return convertView;
    }
    class  ViewHolder{
        private ImageView imageView;
        private TextView textView;
        private TextView textView1;
    }
}
