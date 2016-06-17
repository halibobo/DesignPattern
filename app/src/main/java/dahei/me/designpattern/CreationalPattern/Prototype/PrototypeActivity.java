package dahei.me.designpattern.CreationalPattern.Prototype;

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


public class PrototypeActivity extends BaseActivity {

    @BindView(R.id.tvTip)
    TextView tvTip;
    private PhoneMachine phoneMachine;
    StringBuilder stringBuilder;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prototype);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
    }

    @OnClick({R.id.btnIPhone, R.id.btnNokia})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnIPhone:
                PhoneModel phoneModel = new IPhoneModel();
                phoneMachine = new PhoneMachine(phoneModel);
                stringBuilder = new StringBuilder();
                for (int i=0;i<10;i++) {
                    stringBuilder.append("create a new phone : " + phoneMachine.createPhone().toString()+"\n");
                }
                tvTip.setText("create a new phone : "+stringBuilder.toString());
                break;
            case R.id.btnNokia:
                PhoneModel phoneMode2 = new NokiaPhoneModel();
                phoneMachine = new PhoneMachine(phoneMode2);
                stringBuilder = new StringBuilder();
                for (int i=0;i<10;i++) {
                    stringBuilder.append("create a new phone : " + phoneMachine.createPhone().toString()+"\n");
                }
                tvTip.setText("create a new phone : "+stringBuilder.toString());
                break;
        }
    }
}
