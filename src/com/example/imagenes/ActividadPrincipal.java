package com.example.imagenes;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class ActividadPrincipal extends Activity implements OnClickListener {
	Button btnCambiar;
	ImageView ivLogo;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.actividad_principal);
		
		btnCambiar=(Button)this.findViewById(R.id.btnCambiar);
		ivLogo=(ImageView)this.findViewById(R.id.ivlogo);
		
		btnCambiar.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.actividad_principal, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	ivLogo.setImageResource(R.drawable.ic_launcher);
		
	}

}
