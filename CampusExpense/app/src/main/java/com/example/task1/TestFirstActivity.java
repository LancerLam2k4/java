package com.example.task1;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TestFirstActivity extends AppCompatActivity {
    private final String Tag = "TestFirstActivity";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_first);

        findViewById(R.id.btn_start_activity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),TestSecondActivity.class));
            }
        });
        Log.i(Tag, "*************** Oncreate run *************");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Tag, "*************** OnStart run *************");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Tag, "*************** OnResume run *************");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Tag, "*************** OnPause run *************");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Tag, "*************** OnStop run *************");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(Tag, "*************** OnRestart run *************");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Tag, "*************** OnDestroy run *************");
    }
}
