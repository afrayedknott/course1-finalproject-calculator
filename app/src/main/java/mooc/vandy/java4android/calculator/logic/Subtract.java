package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract
    extends SuperMath {
    // TODO -- start your code here

    public Subtract(int argOne, int argTwo){

        super(argOne, argTwo);

    }

    @Override
    public void mathOperation(){

        calcResult = argOne - argTwo;

    }
}
