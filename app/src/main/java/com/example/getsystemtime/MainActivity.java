package com.example.getsystemtime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {


    Calendar calander;
    SimpleDateFormat simpledateformat , simpletimeformat;

    TextView DisplayDate;
    TextView DisplayTime;
    Button BTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DisplayDate = (TextView)findViewById(R.id.Date);
        DisplayTime = (TextView)findViewById(R.id.Time);

        BTN = (Button)findViewById(R.id.getTime);




        BTN.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                calander = Calendar.getInstance();
                Date date = new Date();
                simpledateformat = new SimpleDateFormat(" dd-MM-yyyy");

                simpletimeformat = new SimpleDateFormat("HH:mm:ss");
                String GetDataAboutDate=null;
                String GetDataAboutTime=null;
                GetDataAboutDate = simpledateformat.format(date);
                GetDataAboutTime = simpletimeformat.format(calander.getTime());
                String Date="Current Date ::" + GetDataAboutDate;
                DisplayDate.setText(Date);
                String Time="Current Time ::" + GetDataAboutTime;
                DisplayTime.setText(Time);

            }
        });

    }
}
