package br.com.campuscode.callingactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


//TODO Sua classe deve implementar a interface View.OnClickListener
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO localize o botao na sua view e adicione o evento de click

    }

    //TODO Faca o override do metodo onClick
    //TODO Crie um objeto to tipo intent e atribua a AnotherActivity
    //TODO Faca a chamada para a atividade com o metodo startActivity
}
