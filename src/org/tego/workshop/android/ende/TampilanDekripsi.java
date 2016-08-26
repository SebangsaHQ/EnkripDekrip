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

public class TampilanDekripsi extends Activity implements OnClickListener {
	private Button btnDekripsikan;
	private Button btnDeKem;
	private EditText etMasukanDekripsi;
	private EditText etMasukanKunci;
	private TextView tvHasilDekripsi;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tampilan_dekripsi);

		btnDekripsikan = (Button) findViewById(R.id.btnDekripsikan);
		btnDekripsikan.setOnClickListener(this);
		btnDeKem = (Button) findViewById(R.id.btnDeKem);
		btnDeKem.setOnClickListener(this);

		etMasukanDekripsi = (EditText) findViewById(R.id.etMasukanDekripsi);
		etMasukanKunci = (EditText) findViewById(R.id.etMasukanKunci);

		tvHasilDekripsi = (TextView) findViewById(R.id.tvHasilDeskripsi);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btnDekripsikan:
			this.tombolDekripsi();
			break;
		case R.id.btnDeKem:
			this.finish();
			break;
		default:
			break;
		}
	}

	private void tombolDekripsi() {
		if (etMasukanDekripsi.getText().toString().equals("")
				|| etMasukanKunci.getText().toString().equals("")) {
			Toast.makeText(getApplicationContext(),
					"Harap isi terlebih dahulu", Toast.LENGTH_SHORT).show();
		} else {
			String str = etMasukanDekripsi.getText().toString();
			int kunci = Integer.parseInt(etMasukanKunci.getText().toString());
			String hasil = EnkripsiDeskripsi.dekripsiKan(str, kunci);
			tvHasilDekripsi.setText("Hasil Dekripsi:\n" + hasil);
		}
	}

}
