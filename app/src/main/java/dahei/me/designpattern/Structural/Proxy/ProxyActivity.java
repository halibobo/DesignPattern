package dahei.me.designpattern.Structural.Proxy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dahei.me.designpattern.BaseActivity;
import dahei.me.designpattern.CreationalPattern.FactoryMethod.IPhone;
import dahei.me.designpattern.R;

/**
 * Created by su on 2016/6/17.
 */
public class ProxyActivity extends BaseActivity {

    @BindView(R.id.tvTip)
    TextView tvTip;

    private IPhoneProductFactory iPhoneProductFactory;
    StringBuilder stringBuilder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proxy);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
        iPhoneProductFactory = new IPhoneProductFactory();
    }

    @OnClick({R.id.btn3IPhone, R.id.btn5IPhone})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn3IPhone:
                createIPhone(3);
                break;
            case R.id.btn5IPhone:
                createIPhone(5);
                break;
        }
    }

    private void createIPhone(int count) {
        if (count <= 0) {
            return;
        }
        stringBuilder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            IPhone iPhone = iPhoneProductFactory.createIPhone();
            stringBuilder.append(iPhone.toString()+"\n");
        }
        tvTip.setText(stringBuilder.toString());
    }
}
