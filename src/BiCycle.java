public class BiCycle {

    //Parameters defining bicycle.
    private int cadence;
    protected int gear;
    private int speed;


    /**
     * Constructor for the BiCycle.
     * @param startCadence - Initial Value of cadence.
     * @param startGear - Initial value of gear.
     * @param startSpeed - Initial value of speed.
     */
    public BiCycle(int startCadence, int startGear, int startSpeed) {
        cadence = startCadence;
        gear = startGear;
        speed = startSpeed;
    }


    /**
     * Setter for Cadence.
     * @param newCadence - new cadence value.
     */
    public void setCadence(int newCadence) {
        cadence = newCadence;
    }

    /**
     * Getter for Cadence.
     * @return cadence value.
     */
    public int getCadence() {
        return cadence;
    }

    /**
     * Setter for gear.
     * @param newGear - new gear value.
     */
    public void setGear(int newGear) {
        gear = newGear;
    }

    /**
     * Getter for Gear.
     * @return gear value.
     */
    public int getGear() {
        return gear;
    }

    /**
     * Getter for speed.
     * @return speed value.
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Decrements speed by the decrement value of applied break.
     * @param decrement - speed decrement value for break.
     */
    public void applyBreak(int decrement) {
         speed -= decrement;
         if(speed < 0) {
             speed = 0;
         }
    }

    /**
     * Speed up the bicycle.
     * @param speedUp - value added to speed.
     */
    public void speedUp(int speedUp) {
         speed += speedUp;
    }

}
