/*
* The MrCoxallStack.
*
* @author  Devin Jhu
* @version 1.0
* @since   2022-11-04
*/

/**
*  Airplane speed class.
*/

public class Jet extends Airplane {
    /**
     * Declaring field for jet speed multiplier.
    */
    private static final int MULTIPLIER = 2;

    /**
     * Jet acceleration getter.
    */
    public void acceleration() {
        super.setSpeed(super.getSpeed() * this.MULTIPLIER);
    }

    /**
     * Jet speed setter.
     *
     * @param speed parameter for speed.
    */
    public void setSpeed(int speed) {
        super.setSpeed(speed * this.MULTIPLIER);
    }
}
