package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;
import mooc.vandy.java4android.calculator.ui.MainActivity;

/**
 * Performs an operation selected by the user.
 */
public class Logic 
       implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out){
        mOut = out;
    }

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(int argumentOne,
                        int argumentTwo,
                        int operation){
        // TODO -- start your code here

        System.out.println("argOne is " + Integer.toString(argumentOne));
        System.out.println("argTwo is " + Integer.toString(argumentTwo)) ;
        System.out.println("operation is " + Integer.toString(operation));

        SuperMath run = null;

        switch(operation) {

            case 1:
                run = new Add(argumentOne, argumentTwo);
                break;

            case 2:
                run = new Subtract(argumentOne, argumentTwo);
                break;

            case 3:
                run = new Multiply(argumentOne, argumentTwo);
                break;

            case 4:
                run = new Divide(argumentOne, argumentTwo);
                break;

        }

        run.mathOperation();
        run.setStringAnswer();
        mOut.print(run.getStringAnswer());

    }
}
