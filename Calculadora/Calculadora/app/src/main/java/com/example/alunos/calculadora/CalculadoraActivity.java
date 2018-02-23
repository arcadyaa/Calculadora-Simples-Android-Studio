package com.example.alunos.calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.*;
import android.view.*;
import android.app.*;


public class CalculadoraActivity extends Activity {

    EditText ednumero1,ednumero2;
    Button btsomar, btsubtrair,btmultiplicar, btdividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        ednumero1 = (EditText) findViewById(R.id.ednumero1);
        ednumero2 = (EditText) findViewById(R.id.ednumero2);

        btsomar = (Button) findViewById(R.id.btsomar);
        btsubtrair = (Button) findViewById(R.id.btsubtrair);
        btmultiplicar=(Button)findViewById(R.id.btmultiplicar);
        btdividir = (Button) findViewById(R.id.btdividir);

        btsomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(
                        ednumero1.getText().toString());
                double num2 = Double.parseDouble(
                        ednumero2.getText().toString());
                double soma = num1 + num2;
                AlertDialog.Builder dialogo = new
                        AlertDialog.Builder(CalculadoraActivity.this);
                dialogo.setTitle("Resultado soma");
                dialogo.setMessage("A soma é " + soma);
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }
        });

        btsubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                double num1 = Double.parseDouble
                        (ednumero1.getText().toString());
                double num2 = Double.parseDouble
                        (ednumero2.getText().toString());
                double soma = num1 - num2;
                AlertDialog.Builder dialogo = new
                        AlertDialog.Builder(CalculadoraActivity.this);
                dialogo.setTitle("Resultado subtração");
                dialogo.setMessage("A subtração é " + soma);
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }
        });

        btmultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                double num1 = Double.parseDouble
                        (ednumero1.getText().toString());
                double num2 = Double.parseDouble
                        (ednumero2.getText().toString());
                double soma = num1 * num2;
                AlertDialog.Builder dialogo = new
                        AlertDialog.Builder(CalculadoraActivity.this);
                dialogo.setTitle("Resultado multiplicação: ");
                dialogo.setMessage("A multiplicação é: " + soma);
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }
        });

        btdividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                double num1 = Double.parseDouble
                        (ednumero1.getText().toString());
                double num2 = Double.parseDouble
                        (ednumero2.getText().toString());
                double soma = num1 / num2;
                AlertDialog.Builder dialogo = new
                        AlertDialog.Builder(CalculadoraActivity.this);
                dialogo.setTitle("Resultado divisão: ");
                dialogo.setMessage("A divisão é: " + soma);
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            } });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calculadora, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
