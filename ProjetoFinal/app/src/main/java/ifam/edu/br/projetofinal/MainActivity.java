//******************************************************
//Instituto Federal de São Paulo - Campus Sertãozinho
//Disciplina......: M4DADM
//Programação de Computadores e Dispositivos Móveis
//Aluno...........: Hamie Queiroz Tomas
//******************************************************

package ifam.edu.br.projetofinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btInserirAct;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instaciando butao de ir para proxima tela
        btInserirAct = (Button) findViewById(R.id.btInserirAct);

        //evento on clic do butao de ir para proxima tela
        btInserirAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //funcao de chama segunda tela
                chamaSegundaTela();
            }
        });
    }


     void chamaSegundaTela(){

         //criando intent para chama a segunda activity
         Intent intent = new Intent();
         intent.setClass(MainActivity.this, SecondActivity.class);
         startActivity(intent);
         finish();



     }
}
