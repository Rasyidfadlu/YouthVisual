package youthapk.youthvisualtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);


    }

    public void save (View view) {
        Intent intent = new Intent(NextActivity.this, LastActivity.class);
        startActivity(intent);
    }
}

