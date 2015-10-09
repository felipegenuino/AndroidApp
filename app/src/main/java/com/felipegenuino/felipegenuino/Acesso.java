package com.felipegenuino.felipegenuino;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Acesso extends Activity {


    //botão voltar para página inicial
    private Button loginButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acesso);

        //Inicio do código
        Button loginButton = (Button) findViewById(R.id.loginButton);
        loginButton.setOnClickListener(onClickLogin()); // o this representa a instancia da classe
    }

    //O método onclickLogin() retorna uma implementacao da View.OnClickLister
    private View.OnClickListener onClickLogin(){
        return new Button.OnClickListener() {
            public void onClick(View v){
                    // tratar o evento de clique aqui
                    TextView loginUsuario = (TextView) findViewById(R.id.loginUsuario);
                    TextView loginSenha = (TextView) findViewById(R.id.loginSenha);

                    String login = loginUsuario.getText().toString();
                    String senha = loginSenha.getText().toString();

                    if("felipe".equals(login) && "123".equals(senha)){
                        alert("Bem-vindo, login realizado com sucesso.");
                        Intent intent = new Intent(getBaseContext(), Principal.class);
                        startActivity(intent);


                    } else{
                        alert("Login ou senha incorretas.");
                    }
            }
        };
    }


    private void alert(String s){
        // A classe tost mostra um alerta temporário muito comum no android
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_acesso, menu);
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
