package com.example.jianhao.activitytran;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    private Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btn2 = (Button)findViewById(R.id.btn2);
        final TextView t = (TextView)findViewById(R.id.tv);
        Intent intent= getIntent();
        String data = intent.getStringExtra("extra_data");
        t.setText(data);
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
    public void onClick(View v){
        Intent intent= getIntent();
        String data = intent.getStringExtra("extra_data");
        intent.putExtra("data_return",data);
        setResult(RESULT_OK,intent);

        finish();
    }
});
        }

}
