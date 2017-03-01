package mooc.vandy.java4android.calculator.logic;

/**
 * Created by redna on 2/22/2017.
 */

public class SuperMath {

    int argOne;
    int argTwo;
    public int remainder;
    public int calcResult;
    public String answerOutput;

    public SuperMath(int argOne, int argTwo){

        this.argOne = argOne;
        this.argTwo = argTwo;

    }

    public void mathOperation() {

        calcResult = 0;

    }

    public void setStringAnswer() {

        answerOutput = Integer.toString(calcResult);

    }

    public String getStringAnswer() {

        return answerOutput;

    }

}
