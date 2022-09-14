//******************************************************
//Instituto Federal de São Paulo - Campus Sertãozinho
//Disciplina......: M4DADM
//Programação de Computadores e Dispositivos Móveis
//Aluno...........: Hamie Queiroz Tomas
//******************************************************


package ifam.edu.br.projetofinal;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    Button btInserir;
    Button btListar;
    Button btVoltar;

    EditText edtNome;
    EditText edtCpf;
    EditText edtIdade;
    EditText edtTelefone;
    EditText edtEmai;

    private DBHelper dh;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //instaciando edits
        edtNome = (EditText) findViewById(R.id.edtNome);
        edtCpf = (EditText) findViewById(R.id.edtCpf);
        edtIdade = (EditText) findViewById(R.id.edtIdade);
        edtTelefone = (EditText) findViewById(R.id.edtTelefone);
        edtEmai = (EditText) findViewById(R.id.edtEmail);


        //instanciando botao boltar
        btVoltar = (Button) findViewById(R.id.btVoltar);

        //metodo on clic do botao voltar
        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //chama medo para boltar para tela inicial
                voltarPrimeiraTela();


            }
        });

        // intanciando boao inserir
        btInserir = (Button) findViewById(R.id.btInserir);

        //metodo oncli do botao inserir
        btInserir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //checa se tem algum campo vazio ou nao
                if (edtNome.getText().length() > 0  && edtCpf.getText().length() > 0 && edtIdade.getText().length() > 0 && edtTelefone.getText().length() > 0 && edtEmai.getText().length() > 0) {

                    //chama metodo insert
                   dh.insert(edtNome.getText().toString(), edtCpf.getText().toString(), edtIdade.getText().toString(), edtTelefone.getText().toString(), edtEmai.getText().toString());

                    //lanca um alerta de mensagem na tela
                    AlertDialog.Builder msg = new AlertDialog.Builder(SecondActivity.this);
                    msg.setTitle("Sucesso");
                    msg.setMessage("Cadastro Realizado");
                    msg.show();


                    //limpa os dados na tela
                    edtNome.setText("");
                    edtCpf.setText("");
                    edtIdade.setText("");
                    edtTelefone.setText("");
                    edtEmai.setText("");

                } else {
                    AlertDialog.Builder msg = new AlertDialog.Builder(SecondActivity.this);
                    msg.setTitle("Erro");
                    msg.setMessage("Todos os Campos devem ser Preenchidos");
                    msg.show();

                }


            }


        });



    }

   void voltarPrimeiraTela(){
       Intent intent2 = new Intent();
       intent2.setClass(SecondActivity.this, MainActivity.class);
       startActivity(intent2);
       finish();



   }
}
