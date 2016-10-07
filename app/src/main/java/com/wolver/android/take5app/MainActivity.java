package com.wolver.android.take5app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //set content view to use the activity_main with the categories of field leadership
        setContentView(R.layout.activity_main);

        //find a view with the take5 category
        TextView take5 = (TextView) findViewById(R.id.take_5_section);
        //set onClick listener for that view
        take5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent take5Intent = new Intent(MainActivity.this, Take5Activity.class);
                startActivity(take5Intent);
            }
        });

        //find a view with the hazard report category
        TextView hazardReport = (TextView) findViewById(R.id.hazard_report_section);
        //set onClick listener for that view
        hazardReport.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent hazardReportIntent = new Intent(MainActivity.this, HazardReportActivity.class);
                startActivity(hazardReportIntent);
            }
        });
    }
}


// WHAT TO DO NEXT - add a list of questions in an array for the take 5 and then for the hazard report. will have to create custom
// classes similar to words and wordadapter in the miwok app. Just get the questions displayed in each of the sections