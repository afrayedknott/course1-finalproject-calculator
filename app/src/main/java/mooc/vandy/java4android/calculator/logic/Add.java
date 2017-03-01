package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add
    extends SuperMath {
    // TODO -- start your code here

    public Add(int argOne, int argTwo){

        super(argOne, argTwo);

    }

    @Override
    public void mathOperation(){

        calcResult = argOne + argTwo;

    }

}
