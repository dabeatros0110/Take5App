package com.wolver.android.take5app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class HazardReportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questions_list);

        //create an array list for hazard report questions
        ArrayList<questions> hazardQuestions = new ArrayList<questions>();
        hazardQuestions.add(new questions("Hazard question example one", "Answer question one example"));
        hazardQuestions.add(new questions("Hazard question example two", "Answer question two example"));
        hazardQuestions.add(new questions("Hazard question example three", "Answer question three example"));
        hazardQuestions.add(new questions("Hazard question example four", "Answer question four example"));
        hazardQuestions.add(new questions("Hazard question example five", "Answer question five example"));
        hazardQuestions.add(new questions("Hazard question example six", "Answer question six example"));
        hazardQuestions.add(new questions("Hazard question example seven", "Answer question seven example"));
        hazardQuestions.add(new questions("Hazard question example eight", "Answer question eight example"));
        hazardQuestions.add(new questions("Hazard question example nine", "Answer question nine example"));
        hazardQuestions.add(new questions("Hazard question example ten", "Answer question ten example"));
        hazardQuestions.add(new questions("Hazard question example eleven", "Answer question eleven example"));
        QuestionsAdapter adapter = new QuestionsAdapter(this, hazardQuestions);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
