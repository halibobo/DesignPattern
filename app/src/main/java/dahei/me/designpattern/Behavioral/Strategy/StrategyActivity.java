package dahei.me.designpattern.Behavioral.Strategy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dahei.me.designpattern.CreationalPattern.AbstractFactory.IPhone5;
import dahei.me.designpattern.CreationalPattern.AbstractFactory.IPhone6s;
import dahei.me.designpattern.CreationalPattern.AbstractFactory.Nokia1520Phone;
import dahei.me.designpattern.CreationalPattern.AbstractFactory.Nokia920Phone;
import dahei.me.designpattern.BaseActivity;
import dahei.me.designpattern.R;

/**
 * Created by su on 2016/6/16.
 */

/***
 * 策略模式
 */
public class StrategyActivity extends BaseActivity {

    @BindView(R.id.tvPrice)
    TextView tvPrice;
    private IPhone mIphone5,mIphone6s;
    private NokiaPhone mNokia920,mNokia1520;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strategy);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
        mIphone6s = new IPhone6s();
        mIphone5 = new IPhone5();
        mNokia920 = new Nokia920Phone();
        mNokia1520 = new Nokia1520Phone();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    private double getPhonePrice(PriceStrategy priceStrategy) {
        return priceStrategy.getStrategyPrice();
    }

    @OnClick({R.id.btnIPhone, R.id.btnNokia})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnIPhone:
                tvPrice.setText(
                        mIphone5.getName()+"'s price is " + getPhonePrice(mIphone5)+"\n"+
                                mIphone6s.getName()+"'s price is " + getPhonePrice(mIphone6s)

                );
                break;
            case R.id.btnNokia:
                tvPrice.setText(
                        mNokia920.getName() + "'s price is " + getPhonePrice(mNokia920) + "\n" +
                                mNokia1520.getName() + "'s price is " + getPhonePrice(mNokia1520));
                break;
        }
    }
}
