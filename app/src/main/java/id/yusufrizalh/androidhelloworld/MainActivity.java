package id.yusufrizalh.androidhelloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // variable global
    private Button btnPindahActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // inisialisasi komponen yg ada didalam layout
        btnPindahActivity = (Button)findViewById(R.id.btnPindahActivity);

        // event handling untuk button tersebut
        btnPindahActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // proses Intent untuk berpindah activity
                Intent myIntent = new Intent(MainActivity.this,
                        DaftarNamaActivity.class);
                startActivity(myIntent);
            }
        });

        Toast.makeText(MainActivity.this,
                "Stage : onCreate Activity", Toast.LENGTH_SHORT).show();
    }

    // method onStart
    protected void onStart(){
        super.onStart();
        Toast.makeText(MainActivity.this,
                "Stage : onStart Activity", Toast.LENGTH_SHORT).show();
    }

    // method onResume
    protected void onResume(){
        super.onResume();
        Toast.makeText(MainActivity.this,
                "Stage : onResume Activity", Toast.LENGTH_SHORT).show();
    }

    // method onPause
    protected void onPause(){
        super.onPause();
        Toast.makeText(MainActivity.this,
                "Stage : onPause Activity", Toast.LENGTH_SHORT).show();
    }

    // method onStop
    protected void onStop(){
        super.onStop();
        Toast.makeText(MainActivity.this,
                "Stage : onStop Activity", Toast.LENGTH_SHORT).show();
    }

    // method onRestart
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(MainActivity.this,
                "Stage : onRestart Activity", Toast.LENGTH_SHORT).show();
    }

    // method onDestroy
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(MainActivity.this,
                "Stage : onDestroy Activity", Toast.LENGTH_SHORT).show();
    }
}
