package com.wolver.android.take5app;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class QuestionsAdapter extends ArrayAdapter<questions> {
    public QuestionsAdapter(Activity context, ArrayList<questions> questionsArrayList) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, questionsArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // get the object at the current position in the list
        questions currentQuestions = getItem(position);
        // find the TextView in the list_item.xml layout with the ID version name
        TextView questionsTextView = (TextView) listItemView.findViewById(R.id.question_text_view);
        // Get the version name from the current object and set this text on the name TextView
        questionsTextView.setText(currentQuestions.getQuestion());

        TextView answerTextView = (TextView) listItemView.findViewById(R.id.answer_text_view);

        answerTextView.setText(currentQuestions.getAnswer());

        return listItemView;
    }
}
