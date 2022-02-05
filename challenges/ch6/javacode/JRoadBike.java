package challenges.ch6.javacode;

public class JRoadBike extends JBicycle {

    // In millimetres
    private int tireWidth;

    public JRoadBike(int cadence,
                     int speed,
                     int gear,
                     int tireWidth) {
        super(cadence, speed, gear);
        this.tireWidth = tireWidth;
    }

    public int getTireWidth() {
        return tireWidth;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("The road bike has a tire widtg of " + tireWidth + " MM");
    }
}
