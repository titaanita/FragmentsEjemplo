package com.example.android.fragmentsejemplo.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.fragmentsejemplo.R;

import org.w3c.dom.Text;

public class DetailFragment extends Fragment {

    private TextView details;

    public DetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_detail, container, false);

        details=(TextView)view.findViewById(R.id.textViewDetails);

        return view;
    }


    public void renderText(String text) {
        details.setText(text);
    }
}
