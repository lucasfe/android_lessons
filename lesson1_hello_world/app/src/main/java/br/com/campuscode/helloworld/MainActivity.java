package br.com.campuscode.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    //TODO Declarar os componentes de UI: TextView, EditText, Button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO Linkar os componentes declaradas com o componente de layout. Usando o id definido no arquivo de layout

        //TODO adicionar click listener no botao

    }


    //TODO receber evento de click, obter o texto do EditText e enviar para o TextView
}
