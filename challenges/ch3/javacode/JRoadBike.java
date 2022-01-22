package challenges.ch3.javacode;

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

}
