package com.example.android.fragmentsejemplo.Fragments;


import android.content.Context;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.android.fragmentsejemplo.R;

public class DataFragment extends Fragment {

    private EditText textData;
    private Button btnSend;
    private DataListener callback;




    public DataFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try{
            callback=(DataListener)context;
        }catch (Exception e){
            Log.d("casque","casca onAttach");
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_data, container, false);
        //Lógica para capturar los elementos de la IU
        textData=(EditText)view.findViewById(R.id.editTextData);
        btnSend=(Button)view.findViewById(R.id.buttonSend);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textToSend=textData.getText().toString();
                callback.sendData(textToSend);

            }
        });

        return view;
    }

    public interface DataListener{
        void sendData(String text);
    }

}
