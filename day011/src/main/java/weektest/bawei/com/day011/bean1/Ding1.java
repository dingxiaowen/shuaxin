package weektest.bawei.com.day011.bean1;

/**
 * @Author：Lenovo
 * @E-mail：
 * @Date：2019/3/4 9:11
 * @Description：描述信息
 */
public class Ding1 {
      /*"      commodityId": 32,
              "commodityName": "唐狮女鞋冬季女鞋休闲鞋子女士女鞋百搭帆布鞋女士休闲鞋子女款板鞋休闲女鞋帆布鞋",
              "masterPic": "http://172.17.8.100/images/small/commodity/nx/fbx/1/1.jpg",
              "price": 88,
              "saleNum": 0*/
      private  int commodityId;
    private  String commodityName;
    private  String masterPic;
    private  String price;
    private  int saleNum;

    public int getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(int commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getMasterPic() {
        return masterPic;
    }

    public void setMasterPic(String masterPic) {
        this.masterPic = masterPic;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(int saleNum) {
        this.saleNum = saleNum;
    }

    @Override
    public String toString() {
        return "Ding1{" +
                "commodityId=" + commodityId +
                ", commodityName='" + commodityName + '\'' +
                ", masterPic='" + masterPic + '\'' +
                ", price=" + price +
                ", saleNum=" + saleNum +
                '}';
    }
}
