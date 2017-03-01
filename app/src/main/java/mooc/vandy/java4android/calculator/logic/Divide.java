package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide
    extends SuperMath{
    // TODO -- start your code here

    public Divide(int argOne, int argTwo){

        super(argOne, argTwo);

    }

    @Override
    public void mathOperation(){

        if(argTwo == 0){
            calcResult = 0;
            remainder = 0;
        } else {
            calcResult = argOne / argTwo;
            remainder = argOne % argTwo;
        }

    }

    public void setStringAnswer() {

        if(argTwo == 0){
            answerOutput = "Cannot divide by zero.";
        } else {
            answerOutput = Integer.toString(calcResult) + " R: " + Integer.toString(remainder);
        }

    }

    public String getStringAnswer() {

        return answerOutput;

    }

}
