package com.wolver.android.take5app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Take5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questions_list);

        // create an ArrayList of questions for take5
        ArrayList<questions> questionsAnswers = new ArrayList<questions>();
        questionsAnswers.add(new questions("Question example one", "Answer question one example"));
        questionsAnswers.add(new questions("Question example two", "Answer question two example"));
        questionsAnswers.add(new questions("Question example three", "Answer question three example"));
        questionsAnswers.add(new questions("Question example four", "Answer question four example"));
        questionsAnswers.add(new questions("Question example five", "Answer question five example"));
        questionsAnswers.add(new questions("Question example six", "Answer question six example"));
        questionsAnswers.add(new questions("Question example seven", "Answer question seven example"));

        QuestionsAdapter adapter = new QuestionsAdapter(this, questionsAnswers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}