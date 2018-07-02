package com.example.jason.jobdeadline;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AppCompatEditText name;
    AppCompatButton save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        save = findViewById(R.id.save);

        final DabaseHelper helper = new DabaseHelper(getApplicationContext());
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                boolean insert = helper.insertData(name.getText().toString(),"");
                if(insert){
                    Toast.makeText(getApplicationContext(),"saveds",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public boolean isConnected(){
       ConnectivityManager connectivityManager =(ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
       NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
       return (networkInfo !=null && networkInfo.isConnected());
    }
}
