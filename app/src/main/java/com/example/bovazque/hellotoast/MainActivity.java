package com.example.bovazque.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.mShowCount = findViewById(R.id.show_count);
        this.mCount = 0;
    }

    public void showToast(View view) {
        Toast t = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        t.show();
    }

    public void countUp(View view) {
        this.mCount++;
        if(this.mShowCount != null){
            this.mShowCount.setText(Integer.toString(this.mCount));
        }
    }
}
