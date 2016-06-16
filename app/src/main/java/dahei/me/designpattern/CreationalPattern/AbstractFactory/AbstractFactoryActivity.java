package dahei.me.designpattern.CreationalPattern.AbstractFactory;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dahei.me.designpattern.BaseActivity;
import dahei.me.designpattern.CreationalPattern.FactoryMethod.Phone;
import dahei.me.designpattern.R;

/**
 * Created by su on 2016/6/16.
 */

/***
 * 抽象工厂类
 */
public class AbstractFactoryActivity extends BaseActivity {

    @BindView(R.id.tvTip)
    TextView tvTip;

    private NokiaCreateFactory nokiaCreateFactory;
    private IPhoneCreateFactory iPhoneCreateFactory;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abstract_factory);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
        nokiaCreateFactory = new NokiaCreateFactory();
        iPhoneCreateFactory = new IPhoneCreateFactory();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @OnClick({R.id.btnIPhone5, R.id.btnIPhone6s, R.id.btnNokia920, R.id.btnNokia1520})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnIPhone5:
                Phone phone1 = iPhoneCreateFactory.createIPhone5();
                tvTip.setText("create a new phone : "+phone1.toString());
                break;
            case R.id.btnIPhone6s:
                Phone phone2 = iPhoneCreateFactory.createIPhone6s();
                tvTip.setText("create a new phone : "+phone2.toString());
                break;
            case R.id.btnNokia920:
                Phone phone3 = nokiaCreateFactory.createNokia920();
                tvTip.setText("create a new phone : "+phone3.toString());
                break;
            case R.id.btnNokia1520:
                Phone phone4 = nokiaCreateFactory.createNokia1520();
                tvTip.setText("create a new phone : "+phone4.toString());
                break;
        }
    }
}
