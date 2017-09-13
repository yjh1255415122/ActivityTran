package com.example.jianhao.activitytran;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn1;
    private EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button)findViewById(R.id.btn1);
        et = (EditText)findViewById(R.id.et);
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String text = et.getText().toString();
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("extra_data",et.getText().toString());
                startActivityForResult(intent,1);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        switch (requestCode){
            case 1:
                if (resultCode==RESULT_OK){
                    String returnedData = data.getStringExtra("data_return");
                    Log.d("MainActivity",returnedData);
                    Toast toast = Toast.makeText(MainActivity.this,returnedData, Toast.LENGTH_LONG);
                    toast.show();
                }
                break;
            default:;
        }
    }
}
