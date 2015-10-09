package com.felipegenuino.felipegenuino;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Trabalhos extends AppCompatActivity {

    private String[] nomes = {"Nome 1", "Nome 2", "Nome 3", "Nome 4", "Nome 5", "Nome 2", "Nome 3", "Nome 4", "Nome 5"};
    private ListView nossaLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trabalhos);

        nossaLista = (ListView) findViewById(R.id.listViewMeusTrabalhos);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Trabalhos.this, android.R.layout.simple_list_item_1, nomes);
        nossaLista.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_trabalhos, menu);
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
