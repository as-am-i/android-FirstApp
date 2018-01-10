package com.example.tanii_asami.firstapp;

/**
 * Created by tanii_asami on 2018/01/09.
 */

public class Question {
    private int mTextResId; // question text id for res
    private boolean mAnswerTrue; // answer (true or false)

    public Question(int textResId, boolean answerTrue) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
