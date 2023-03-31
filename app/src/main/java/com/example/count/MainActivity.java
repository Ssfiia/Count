package com.example.count;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.security.Key;

public class MainActivity extends AppCompatActivity {



        private static final String KEY_COUNT = "key";

        private TextView textCount;
        private Button btn;
        private int count = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textCount = findViewById(R.id.textCount);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(listener);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            count++;
            textCount.setText("" + count);
        }
    };
    @Override
    protected void onStart() {Toast toast = Toast.makeText(getApplicationContext(),R.string.start, Toast.LENGTH_SHORT);
        toast.show();
        super.onStart();
    }

    @Override
    protected void onStop() {Toast toast = Toast.makeText(getApplicationContext(),R.string.stop, Toast.LENGTH_SHORT);
        toast.show();
        super.onStop();
    }

    @Override
    protected void onDestroy() {Toast toast = Toast.makeText(getApplicationContext(),R.string.destroy, Toast.LENGTH_SHORT);
        toast.show();
        super.onDestroy();
    }
    @Override
    protected void onPause() {Toast toast = Toast.makeText(getApplicationContext(),R.string.pause, Toast.LENGTH_SHORT);
        toast.show();
        super.onPause();
    }
    @Override
    protected void onResume() {Toast toast = Toast.makeText(getApplicationContext(),R.string.resume, Toast.LENGTH_SHORT);
        toast.show();
        super.onResume();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {

        Toast toast = Toast.makeText(getApplicationContext(),R.string.save, Toast.LENGTH_SHORT);
        toast.show();
        super.onSaveInstanceState(outState);

        outState.putInt(KEY_COUNT, count);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        Toast toast = Toast.makeText(getApplicationContext(),R.string.restore, Toast.LENGTH_SHORT);
        toast.show();
        super.onRestoreInstanceState(savedInstanceState);

        count = savedInstanceState.getInt(KEY_COUNT);
    }

}