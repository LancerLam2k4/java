package com.example.task1;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DemoElementsActivity extends AppCompatActivity {
    private final String FlagTag ="DemoElemementsActivity";
    private CheckBox AgreeYes;
    private CheckBox AgreeNo;
    private Button ClickMe;
    private RadioButton Female;
    private RadioButton Male;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_elements);
        findViewById(R.id.btn_clickme).setEnabled(false);
        findViewById(R.id.btn_gender).setEnabled(false);
        AgreeYes = findViewById(R.id.cb_yes);
        AgreeNo = findViewById(R.id.cb_no);

        AgreeYes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ClickMe = findViewById(R.id.btn_clickme);
                if(isChecked){
                    ClickMe.setEnabled(true);
                    Log.i(FlagTag,"Checkbox is Checked");
                }else {
                    ClickMe.setEnabled(false);
                    Log.i(FlagTag,"Checkbox is not Checked");
                }
            }
        });
        Female=findViewById(R.id.rad_female);
        Female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.btn_gender).setEnabled(true);
                Log.i(FlagTag,"Radio Button Femal is checked");
            }
        });
    }
    public void handleClickMe(View view){
        AgreeNo = findViewById(R.id.cb_no);
        if(AgreeNo.isChecked()){
            Toast.makeText(this,"CheckBox is Checked",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this,"CheckBox is not checked",Toast.LENGTH_LONG).show();
        }
    }
}
