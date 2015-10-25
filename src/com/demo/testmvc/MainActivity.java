package com.demo.testmvc;

import com.demo.mvcdemo02.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements IEventListener,
		OnClickListener {
	MVCManager MVCManager;
	TextView showrunmode, changerunmode;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main2);
		findViewById();

		changerunmode.setOnClickListener(this);

		MVCManager = new MVCManager(this);
		MVCManager.addListener(this);
		MVCManager.getDefaultRunMode();
	}

	private void findViewById() {
		showrunmode = (TextView) findViewById(R.id.showrunmode);
		changerunmode = (TextView) findViewById(R.id.changerunmode);
	}

	@Override
	public void onEvent(int bean, String msg) {
		switch (bean) {
		case Events.AUTO:
			showrunmode.setText(msg);
			MVCManager.setRunMode(msg);
			Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
			break;
		case Events.HAND:
			showrunmode.setText(msg);
			MVCManager.setRunMode(msg);
			Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
			break;

		default:
			break;
		}
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.changerunmode:
			if (!MVCManager.getRunModeModel().equals(Events.AUTOSTR)) {
				MVCManager.changeRunMode(Events.AUTO, MVCManager.getRunModeModel());
			}else if (!MVCManager.getRunModeModel().equals(Events.HANDSTR))  {
				MVCManager.changeRunMode(Events.HAND, MVCManager.getRunModeModel());
			}
			break;

		default:
			break;
		}
	}
}
