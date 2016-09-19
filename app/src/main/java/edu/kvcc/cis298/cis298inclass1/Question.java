package edu.kvcc.cis298.cis298inclass1;

/**
 * Created by jkoehler5171 on 9/19/2016.
 */
public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;

    public Question (int textResID, boolean answerTrue){
        mTextResId= textResID;
        mAnswerTrue= answerTrue;
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
