package com.yxf.tempalgorithm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.proton.temp.algorithm.AlgorithmManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String version = AlgorithmManager.getVersion();
        System.out.println("version is : " + version);
    }
}
