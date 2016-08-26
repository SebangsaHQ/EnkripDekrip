package org.tego.workshop.android.ende;

import org.tego.workshop.android.ende.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TampilanEnkripsi extends Activity implements OnClickListener {
	private Button btnEnkripsikan;
	private Button btnEnKem;
	private EditText etMasukanEnkripsi;
	private EditText edKunciEnkripsi;
	private TextView tvHasil;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tampilan_enkripsi);

		btnEnkripsikan = (Button) findViewById(R.id.btnEnkripsikan);
		btnEnkripsikan.setOnClickListener(this);
		btnEnKem = (Button) findViewById(R.id.btnEnkem);
		btnEnKem.setOnClickListener(this);

		etMasukanEnkripsi = (EditText) findViewById(R.id.etMasukanEnkripsi);
		edKunciEnkripsi = (EditText) findViewById(R.id.edKunciEnkripsi);

		tvHasil = (TextView) findViewById(R.id.tvHasil);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btnEnkripsikan:
			this.tombolEnkripsi();
			break;
		case R.id.btnEnkem:
			this.finish();
			break;
		default:
			break;
		}
	}

	private void tombolEnkripsi() {
		if (etMasukanEnkripsi.getText().toString().equals("")
				|| edKunciEnkripsi.getText().toString().equals("")) {
			Toast.makeText(getApplicationContext(),
					"Harap isi terlebih dahulu", Toast.LENGTH_SHORT).show();
		} else {
			String str = etMasukanEnkripsi.getText().toString();
			int kunci = Integer.parseInt(edKunciEnkripsi.getText().toString());
			String hasil = EnkripsiDeskripsi.enkripsiKan(str, kunci);
			tvHasil.setText("Hasil Enkripsi:\n" + hasil);
		}
	}

}
