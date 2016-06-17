package dahei.me.designpattern.Structural.AdapterPattern;

/**
 * Created by su on 2016/6/17.
 */

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
 * 适配器模式
 */
public class AdapterActivity extends BaseActivity {
    @BindView(R.id.tvTip)
    TextView tvTip;

    private Charger chinaIPhoneCharger;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
        chinaIPhoneCharger = new ChinaIPhoneCharger();
    }

    @OnClick({R.id.btn110v, R.id.btn220v})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn110v:
                tvTip.setText(chinaIPhoneCharger.chargeOn110v());
                break;
            case R.id.btn220v:
                tvTip.setText(chinaIPhoneCharger.chargeOn220v());
                break;
        }
    }
}
