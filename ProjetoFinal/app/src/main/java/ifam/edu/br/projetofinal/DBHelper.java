//******************************************************
//Instituto Federal de São Paulo - Campus Sertãozinho
//Disciplina......: M4DADM
//Programação de Computadores e Dispositivos Móveis
//Aluno...........: Hamie Queiroz Tomas
//******************************************************

package ifam.edu.br.projetofinal;


import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.support.v7.app.AlertDialog;

import java.util.ArrayList;
import java.util.List;


//classe do banco
public class DBHelper {


    //definindo as variaveis inciais do banco de dados
    private static final String DATABASE_NAME = "bancodedados.db";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_NAME = "contato";

    private Context context;
    private SQLiteDatabase db;

    private SQLiteStatement insert;
    private static final String INSERT = "insert into " + TABLE_NAME + " (nome, cpf, idade , telfone, email) values (?,?,?,?,?)";


    public DBHelper (Context context){
        this.context = context;
        OpenHelper openHelper = new OpenHelper(this.context);

        this.db = openHelper.getWritableDatabase();
        this.insert = this.db.compileStatement(INSERT);


    }

    //metodo insert
    public long insert (String nome,String cpf,String idade,String telfone,String email){

        this.insert.bindString(1,nome);

        this.insert.bindString(2,cpf);

        this.insert.bindString(3,idade);

        this.insert.bindString(4,telfone);

        this.insert.bindString(5,email);

        return this.insert.executeInsert();

    }

    //metodo de criacao da tabela
    private static class OpenHelper extends SQLiteOpenHelper{
        OpenHelper(Context context){
            super (context, DATABASE_NAME,null, DATABASE_VERSION);
        }

        public void onCreate(SQLiteDatabase db){
            //verifica se existe ou nao para poder criar a tabela
            String sql = "CREATE TABLE IF NOT EXISTS = "+ TABLE_NAME + " (id INTEGER PRIMARY KEY AUTOINCREMENT, nome TEXT, cpf TEXT, idade TEXT, telfone TEXT, email TEXT);";

            db.execSQL(sql);

        }

        public void onUpgrade (SQLiteDatabase db, int oldVersion, int NewVersion){
            db.execSQL("DROP TABLE IF EXISTS" + TABLE_NAME);
            onCreate(db);
        }

    }



}
