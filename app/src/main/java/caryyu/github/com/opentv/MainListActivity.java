package caryyu.github.com.opentv;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainListActivity extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setListAdapter(new SimpleAdapter(this,getInitDatas(),R.layout.listitem_1,
                new String[]{"title"},new int[]{R.id.textview1}));
    }

    private List<Map<String,Object>> getInitDatas(){
        List<Map<String,Object>> list = new ArrayList();
        list.add(create("ExoPlayerMainActivity",new Intent(this,ExoPlayerMainActivity.class)));
        list.add(create("VitamioPlayerActivity",new Intent(this,VitamioPlayerActivity.class)));
        return list;
    }

    private Map<String,Object> create(String text,Object value){
        Map<String,Object> m = new HashMap<>();
        m.put("title",text);
        m.put("value",value);
        return m;
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Map<String,Object> item = (Map<String,Object>)l.getItemAtPosition(position);
        Object value = item.get("value");
        Intent intent = (Intent)value;
        this.startActivity(intent);
        System.out.println(value);
    }
}
