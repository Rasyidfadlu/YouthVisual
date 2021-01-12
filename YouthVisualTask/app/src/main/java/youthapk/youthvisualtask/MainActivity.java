package youthapk.youthvisualtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        final Button btnDaftar = (Button) findViewById(R.id.layout2);
//
//        btnDaftar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                btnDaftar = new Intent(MainActivity.this, SecondActivity.class);
//                startActivity(btnDaftar);
//                finish();
//            }
//        });

    }

    public void daftar(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }
}
