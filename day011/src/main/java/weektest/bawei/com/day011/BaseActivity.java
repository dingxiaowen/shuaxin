package weektest.bawei.com.day011;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;

/**
 * @Author：Lenovo
 * @E-mail：
 * @Date：2019/3/4 8:49
 * @Description：描述信息
 */
public abstract class BaseActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(bindLayout());
        initView();
        initData();
        bindEvent();
    }

    protected abstract int bindLayout();

    protected abstract void initView();

    protected abstract void initData();

    protected abstract void bindEvent();
    protected <T extends View> T bindView(int resid){
        return findViewById(resid);
    }
}
