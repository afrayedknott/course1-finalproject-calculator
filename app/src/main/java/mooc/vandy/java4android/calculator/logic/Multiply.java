package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply
    extends SuperMath {
    // TODO -- start your code here

    public Multiply(int argOne, int argTwo){

        super(argOne, argTwo);

    }

    @Override
    public void mathOperation(){

        calcResult = argOne * argTwo;

    }
}
