package com.example.aprendepaises;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class resultado_capitales extends Activity {

    Intent i, r;
    Bundle bb;
    int calificaciones=0;
    Button reg;
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultado_capitales);

        reg=(Button)findViewById(R.id.Inicio);
       texto=(TextView)findViewById(R.id.Resultado);
        i=new Intent(this, MainActivity.class);

       /* try{
            r=getIntent();
            bb=r.getExtras();
            calificaciones=bb.getInt("Resultado:");
            texto.setText("calificaciones:"+ calificaciones);
        } catch (Exception e){
            Toast.makeText(this, "Error al recibir datos", Toast.LENGTH_SHORT).show();
        }*/

        i.putExtra("calificaciones", calificaciones);

        reg.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                startActivity(i);
            }

            });
    }


    public void inicio (View inicio){
        Intent i=new Intent(this, MainActivity.class);
        startActivity(i);

    }
    //Desactivamos el botton de volver con el metodo siguiente
    public  void  onBackPressed(){

    }

}
