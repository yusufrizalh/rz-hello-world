package id.yusufrizalh.androidhelloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class DaftarNamaActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_nama);

        // membuat sebuah Array daftar nama
        // cara 1
        String[] daftarNama1 = { "Alberto", "Roberto", "Diana",
                                "Mariana", "David", "Mercado",
                                "Suzanna", "Sientha", "Garry",
                                "Fernando", "Victoria", "Adams",
                                "Gilberto", "Moreno", "Angelica" };

        // inisialisasi komponen dalam layout activity_daftar_nama
        Button btnPindahActivity3 = (Button)findViewById(R.id.btnPindahActivity3);
        ListView listDaftarNama = (ListView)findViewById(R.id.list_daftar_nama);

        // event handling untuk list view daftar nama
        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1,
                android.R.id.text1, daftarNama1
        );

        // gunakan adapter tersebut
        listDaftarNama.setAdapter(arrayAdapter1);

        // event handling ketika list view dipilih salah satu
        listDaftarNama.setOnItemClickListener(this);

        // event handling untuk button pindah activity 3
        btnPindahActivity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(DaftarNamaActivity.this,
                        Activity3.class);
                startActivity(myIntent);
            }
        });
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        TextView textView = (TextView) view;
        Toast.makeText(this,
                "Anda mengklik: " + textView.getText(),
                Toast.LENGTH_SHORT).show();
    }
}
