package com.example.smogathapalli.module_test_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.MyClass_1;
import com.example.MyClass_2;
import com.example.al_1.Aclass_1;
import com.example.al_2.Aclass_2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Aclass_1 ac_1 = new Aclass_1();
        Aclass_2 ac_2 = new Aclass_2();

        MyClass_1 mc_1 = new MyClass_1();
        MyClass_2 mc_2 = new MyClass_2();
    }
}
