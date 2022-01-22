package challenges.ch3.javacode;

public class JMountainBike extends JBicycle {

    private int seatHeight;

    public JMountainBike(int seatHeight,
                         int cadence,
                         int speed,
                         int gear) {
        super(cadence, speed, gear);
        this.seatHeight = seatHeight;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }
}
