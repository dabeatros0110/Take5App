package com.wolver.android.take5app;


public class questions {
    // Question
    private String mQuestion;

    //Answer
    private String mAnswer;

    public questions(String question, String answer){
        mQuestion = question;
        mAnswer = answer;
    }

    //get the question
    public String getQuestion() {
        return mQuestion;
    }

    //get the answer
    public String getAnswer() {
        return mAnswer;
    }
}
