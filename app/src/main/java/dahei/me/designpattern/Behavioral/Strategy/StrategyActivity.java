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
import dahei.me.designpattern.CreationalPattern.FactoryMethod.IPhone;
import dahei.me.designpattern.CreationalPattern.FactoryMethod.NokiaPhone;
import dahei.me.designpattern.CreationalPattern.FactoryMethod.Phone;
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
    private IPhone mIphone5;
    private NokiaPhone nokiaPhone;

    PriceStrategy priceStrategy = new FirstMember();
    PriceStrategy priceStrategy2 = new SecondMember();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strategy);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
        mIphone5 = new IPhone5();
        nokiaPhone = new Nokia920Phone();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }


    @OnClick({R.id.btnIPhone, R.id.btnNokia})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnIPhone:

                tvPrice.setText(
                        "mIphone5 price is " + mIphone5.getPrice()+"\n"+
                        "FirstMember : iphone price is "+ priceStrategy.getStrategyPrice(mIphone5.getPrice())+"\n"+
                        "SecondMember : iphone price is "+ priceStrategy2.getStrategyPrice(mIphone5.getPrice())
                );
                break;
            case R.id.btnNokia:
                tvPrice.setText(
                        "nokiaPhone price is " + nokiaPhone.getPrice()+"\n"+
                                "FirstMember : nokiaPhone price is "+ priceStrategy.getStrategyPrice(nokiaPhone.getPrice())+"\n"+
                                "SecondMember : nokiaPhone price is "+ priceStrategy2.getStrategyPrice(nokiaPhone.getPrice())
                );
                break;
        }
    }
}
