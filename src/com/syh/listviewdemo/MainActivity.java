package com.syh.listviewdemo;

import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

/**
 * @author shenyonghe
 * 
 *         2014-10-9
 */
public class MainActivity extends Activity implements OnItemClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ListView lv = (ListView) findViewById(R.id.lv);
		PersionDao2 persionDao2 = new PersionDao2(this);
		List<Persion> persions = persionDao2.getAll();
		MyAdapter myAdapter = new MyAdapter(this, persions, R.layout.list_item);
		lv.setAdapter(myAdapter);
		lv.setOnItemClickListener(this);
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		Toast.makeText(getBaseContext(), "selected" + position,
				Toast.LENGTH_SHORT).show();
	}
}
