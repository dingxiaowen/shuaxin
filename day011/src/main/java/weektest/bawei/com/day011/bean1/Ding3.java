package weektest.bawei.com.day011.bean1;

/**
 * @Author：Lenovo
 * @E-mail：
 * @Date：2019/3/4 9:14
 * @Description：描述信息
 */
public class Ding3 {
    private Ding2 mlss;
    private Ding2 pzsh;
    private Ding2 rxxp;

    public Ding2 getMlss() {
        return mlss;
    }

    public void setMlss(Ding2 mlss) {
        this.mlss = mlss;
    }

    public Ding2 getPzsh() {
        return pzsh;
    }

    public void setPzsh(Ding2 pzsh) {
        this.pzsh = pzsh;
    }

    public Ding2 getRxxp() {
        return rxxp;
    }

    public void setRxxp(Ding2 rxxp) {
        this.rxxp = rxxp;
    }

    @Override
    public String toString() {
        return "Ding3{" +
                "mlss=" + mlss +
                ", pzsh=" + pzsh +
                ", rxxp=" + rxxp +
                '}';
    }
}
