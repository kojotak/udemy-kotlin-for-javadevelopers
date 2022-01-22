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

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("The mountain bike has a seat height of " + seatHeight + " inches");
    }
}
