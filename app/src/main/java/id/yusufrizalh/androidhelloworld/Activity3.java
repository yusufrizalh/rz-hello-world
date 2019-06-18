package id.yusufrizalh.androidhelloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Activity3 extends AppCompatActivity {
    private Button btnMenujuMainActivity;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_3);

        btnMenujuMainActivity = (Button)findViewById(R.id.btnMenujuActivity1);
        btnMenujuMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Activity3.this,
                        MainActivity.class);
                startActivity(myIntent);
            }
        });
    }
}
