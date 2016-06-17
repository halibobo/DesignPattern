package dahei.me.designpattern.Structural.AdapterPattern;

/**
 * Created by su on 2016/6/17.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;

import butterknife.ButterKnife;
import dahei.me.designpattern.BaseActivity;
import dahei.me.designpattern.R;
import dahei.me.designpattern.Structural.Proxy.IPhoneProductFactory;

/**
 * 适配器模式
 */
public class AdapterActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proxy);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
    }
}
