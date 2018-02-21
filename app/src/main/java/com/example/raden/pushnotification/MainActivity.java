package com.example.raden.pushnotification;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.iid.FirebaseInstanceId;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;

        Button btnShowToken = (Button)findViewById(R.id.btn_token);
        btnShowToken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String token = FirebaseInstanceId.getInstance().getToken();
                Log.d(TAG, "token " + token);

                Toast.makeText(context, token , Toast.LENGTH_SHORT).show();

            }
        });
    }
}
