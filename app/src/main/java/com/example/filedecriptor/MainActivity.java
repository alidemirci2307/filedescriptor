package com.example.filedecriptor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Process;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.loadLibrary("app_code");

        TextView textView = findViewById(R.id.tv_hello);
        textView.setText("Hello : " +getFdPath("10"));
    }

    private native String getType(String path);

    private String getProcessId() {
        return String.valueOf(Process.myPid());
    }

    private String getFdPath(String fileName) {
        return "/proc/"+getProcessId()+"/fd/"+fileName;
    }
}