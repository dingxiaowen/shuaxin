package weektest.bawei.com.day011.bean1;

import java.util.ArrayList;

/**
 * @Author：Lenovo
 * @E-mail：
 * @Date：2019/3/4 9:13
 * @Description：描述信息
 */
public class Ding2 {
    private ArrayList<Ding1> commodityList;
    private int id;
    private String name;

    public ArrayList<Ding1> getCommodityList() {
        return commodityList;
    }

    public void setCommodityList(ArrayList<Ding1> commodityList) {
        this.commodityList = commodityList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ding2{" +
                "commodityList=" + commodityList +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
