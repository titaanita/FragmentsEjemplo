package com.example.android.fragmentsejemplo.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.fragmentsejemplo.Fragments.DetailFragment;
import com.example.android.fragmentsejemplo.R;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String text=null;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        if (getIntent().getExtras()!=null){
            text=getIntent().getStringExtra("text");
        }

        //cogeremos el texto y se lo pasamos al detail.En el detail haremos un renderizar texto.
        DetailFragment detailFragment = (DetailFragment) getSupportFragmentManager().findFragmentById(R.id.detailsFragment);
        detailFragment.renderText(text);


    }
}
