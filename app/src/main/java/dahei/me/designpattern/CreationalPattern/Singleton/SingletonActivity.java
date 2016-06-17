package dahei.me.designpattern.CreationalPattern.Singleton;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dahei.me.designpattern.BaseActivity;
import dahei.me.designpattern.R;

/**
 * Created by su on 2016/6/17.
 */
public class SingletonActivity extends BaseActivity {


    @BindView(R.id.tvTip)
    TextView tvTip;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnPhone)
    public void onClick() {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<5;i++) {
            stringBuilder.append(" my own phone " + MyOwnPhone.getInstance().toString() + "  hashcode = " + MyOwnPhone.getInstance().hashCode()+" \n");
        }
        tvTip.setText(stringBuilder.toString());
    }
}
