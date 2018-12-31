public class MountainBike extends BiCycle{

    //Mountain Bike exclusive parameter.
    public int seatHeight;

    public MountainBike(int startCadence, int startGear,
                        int startSpeed, int startSeatHeight) {
        super(startCadence, startGear, startSpeed);
        seatHeight = startSeatHeight;
    }

    /**
     * Sets the value for new seat height.
     * @param newSeatHeight - new value for seatheight
     */
    public void adjustSeatHeight(int newSeatHeight) {
        seatHeight = newSeatHeight;
    }
}
