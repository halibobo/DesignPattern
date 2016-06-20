package dahei.me.designpattern.CreationalPattern.FactoryMethod;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dahei.me.designpattern.BaseActivity;
import dahei.me.designpattern.R;

/**
 * Created by su on 2016/6/16.
 */

/**
 * 工厂方法模式
 */
public class FactoryMethodActivity extends BaseActivity {

    @BindView(R.id.tvTip)
    TextView tvTip;

    private PhoneFactory iPhoneFactory;
    private PhoneFactory nokiaPhoneFactory;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory_method);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
        iPhoneFactory = new IPhoneFactory();
        nokiaPhoneFactory = new NokiaPhoneFactory();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @OnClick({R.id.btnIPhone, R.id.btnNokia})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnIPhone:
                Phone phone = iPhoneFactory.createPhone();
                tvTip.setText("create a new phone : "+phone.toString());
                break;
            case R.id.btnNokia:
                Phone phone2 = nokiaPhoneFactory.createPhone();
                tvTip.setText("create a new phone : " + phone2.toString());
                break;
        }
    }
}
