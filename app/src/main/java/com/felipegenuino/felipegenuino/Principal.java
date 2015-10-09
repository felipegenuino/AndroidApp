package com.felipegenuino.felipegenuino;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Principal extends AppCompatActivity {

    private Button buttonGoToSobre;
    private Button buttonGoToTrabalhos;
    private Button buttonGoToContato;
    private Button buttonGoToAcesso;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);




        buttonGoToSobre = (Button) findViewById(R.id.buttonGoToSobre);
        buttonGoToTrabalhos = (Button) findViewById(R.id.buttonGoToTrabalhos);
        buttonGoToContato = (Button) findViewById(R.id.buttonGoToContato);

        buttonGoToAcesso = (Button) findViewById(R.id.buttonGoToAcesso);

        buttonGoToAcesso.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), Acesso.class);
                startActivity(intent);
            }
        });


        buttonGoToSobre.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), Sobre.class);
                startActivity(intent);
            }
        });

        buttonGoToTrabalhos.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), Trabalhos.class);
                startActivity(intent);
            }
        });

        buttonGoToContato.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), Contato.class);
                startActivity(intent);
            }
        });


        buttonGoToContato.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), Contato.class);
                startActivity(intent);
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_principal, menu);
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
