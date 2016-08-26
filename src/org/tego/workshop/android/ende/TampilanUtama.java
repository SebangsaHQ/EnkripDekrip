package org.tego.workshop.android.ende;

import org.tego.workshop.android.ende.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class TampilanUtama extends Activity implements OnClickListener {
	private Button btnTamEnTek;
	private Button btnTamDeTek;
	private Button btnKeluar;
	private static Intent intent = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tampilan_utama);

		btnTamEnTek = (Button) findViewById(R.id.btnTamEnTek);
		btnTamEnTek.setOnClickListener(this);
		
		btnTamDeTek = (Button) findViewById(R.id.btnTamDeTek);
		btnTamDeTek.setOnClickListener(this);
		
		btnKeluar = (Button) findViewById(R.id.btnKeluar);
		btnKeluar.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btnTamEnTek:
			intent = new Intent(getApplicationContext(), TampilanEnkripsi.class);
			startActivity(intent);
			break;
		case R.id.btnTamDeTek:
			intent = new Intent(getApplicationContext(), TampilanDekripsi.class);
			startActivity(intent);
			break;
		case R.id.btnKeluar:
			this.finish();
			break;
		default:
			break;
		}
	}

}
