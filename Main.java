/*
* The MrCoxallStack.
*
* @author  Devin Jhu
* @version 1.0
* @since   2022-11-04
*/

/**
 * This is a program that runs with Jet.java and Airplane.java
*/

final class Main {
    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException.
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final int numOne = 212;
        final int numTwo = 422;
        final int numThree = 4;
        final int numFour = 5000;
        final int numFive = 2;

        final Airplane biplane = new Airplane();
        biplane.setSpeed(numOne);
        System.out.println(biplane.getSpeed());
        final Jet boeing = new Jet();
        boeing.setSpeed(numTwo);
        System.out.println(boeing.getSpeed());

        int loopCounter = 0;

        while (loopCounter < numThree) {
            boeing.acceleration();
            System.out.println(boeing.getSpeed());
            if (boeing.getSpeed() > numFour) {
                biplane.setSpeed(biplane.getSpeed() * numFive);
            } else {
                boeing.acceleration();
            }
            loopCounter++;
        }
        System.out.println(biplane.getSpeed());
        System.out.println("\nDone.");
    }
}
