package com.example.android.fragmentsejemplo.Activities;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.fragmentsejemplo.Fragments.DataFragment;
import com.example.android.fragmentsejemplo.Fragments.DetailFragment;
import com.example.android.fragmentsejemplo.R;

public class MainActivity extends FragmentActivity implements DataFragment.DataListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void sendData(String text) {
        
            //cogeremos el texto y se lo pasamos al detail.En el detail haremos un renderizar texto.
            DetailFragment detailFragment=(DetailFragment)getSupportFragmentManager().findFragmentById(R.id.detailsFragment);
            detailFragment.renderText(text);



    }

}
