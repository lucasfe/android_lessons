package br.com.campuscode.sharedpref;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

//TODO Implemente a interface View.OnClickListener
public class MainActivity extends AppCompatActivity{


    //TODO declare uma variavel de classe do tipo EditText
    //TODO declare uma variavel de classe do tipo TextView
    //TODO declare uma variavel de classe do tipo botao


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO Associe os componentes de layout com os componentes da classe
        //TODO Obtenha as prefenrencias do aplicativo
        //TODO Obtenha a preferencia de mensagem
        //TODO Coloque a messagem no text view do lauout
        //TODO adicione um listener de click no botao

    }


    //TODO No metodo onCLick obtenha as preferencias
    //TODO No metodo onCLick obtenha o texto do edit text
    //TODO Salve os texto do edit text nas preferencias


}
