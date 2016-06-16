package dahei.me.designpattern;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

import dahei.me.designpattern.CreationalPattern.AbstractFactory.AbstractFactoryActivity;
import dahei.me.designpattern.CreationalPattern.Builder.BuilderActivity;
import dahei.me.designpattern.CreationalPattern.FactoryMethod.FactoryMethodActivity;
import dahei.me.designpattern.Behavioral.Strategy.StrategyActivity;
import dahei.me.designpattern.adapter.CommonAdapter;
import dahei.me.designpattern.adapter.ViewHolder;

public class MainActivity extends BaseActivity {

    private ListView mListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        mListView = (ListView) findViewById(R.id.listView);
        final List<String[]> list = Arrays.asList(Global.mData);
        mListView.setAdapter(new CommonAdapter<String[]>(getApplicationContext(), list, R.layout.adapter_text) {
            @Override
            public void convert(ViewHolder helper, String[] item, int position) {
                helper.setText(android.R.id.text1, item[0]);
            }
        });

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(MainActivity.this, getInstanceByClassName(list.get(position)[1])));
            }
        });
    }

    public Class getInstanceByClassName(String className){
        try{
            return Class.forName(className);
        }catch(Exception e){
            e.printStackTrace();
            return AbstractFactoryActivity.class;
        }

    }
}
