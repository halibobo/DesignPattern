package dahei.me.designpattern.CreationalPattern.Builder;

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
public class BuilderActivity extends BaseActivity {

    ComponentsFactory componentsFactory;
    @BindView(R.id.tvTip)
    TextView tvTip;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulider);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
        componentsFactory = new ComponentsFactory();
    }

    @OnClick({R.id.btnIPhone, R.id.btnXiaomi, R.id.btnHuawei})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnIPhone:
                tvTip.setText(componentsFactory.getIphone4().toString());
                break;
            case R.id.btnXiaomi:
                tvTip.setText(componentsFactory.getXiaoMi5().toString());
                break;
            case R.id.btnHuawei:
                tvTip.setText(componentsFactory.getHuaWeiMate().toString());
                break;
        }
    }
}
