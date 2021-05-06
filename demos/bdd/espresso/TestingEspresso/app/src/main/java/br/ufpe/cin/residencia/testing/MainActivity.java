package br.ufpe.cin.residencia.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    public static final String KEY_NOME = "NOME";
    public static final String KEY_LOGIN = "LOGIN";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.lista);

        //criando o adapter
        ArrayAdapter<Pessoa> adapter = new ArrayAdapter<Pessoa>(
                this,
                android.R.layout.simple_list_item_1,
                Constants.maisPessoas
        );

        //setando o adapter na listview
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(
                (adapterView, view, i, l) -> {
                    ListView lv = (ListView) adapterView;
                    ArrayAdapter<Pessoa> a = (ArrayAdapter<Pessoa>) lv.getAdapter();
                    Pessoa p = a.getItem(i);

                    Intent intent = new Intent(getApplicationContext(), PessoaActivity.class);
                    intent.putExtra(KEY_NOME, p.getNome());
                    intent.putExtra(KEY_LOGIN, p.getLogin());
                    startActivity(intent);

                }
        );
    }
}
