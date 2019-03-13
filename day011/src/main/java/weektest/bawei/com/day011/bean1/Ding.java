package weektest.bawei.com.day011.bean1;

/**
 * @Author：Lenovo
 * @E-mail：
 * @Date：2019/3/4 9:15
 * @Description：描述信息
 */
public class Ding {
    private String message;
    private Ding3 result;
    private String status;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Ding3 getResult() {
        return result;
    }

    public void setResult(Ding3 result) {
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Ding{" +
                "message='" + message + '\'' +
                ", result=" + result +
                ", status='" + status + '\'' +
                '}';
    }
}
