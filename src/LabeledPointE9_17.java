import java.awt.Point;

public class LabeledPointE9_17 {
    private Point location;  // Using Point to store x and y coordinates
    private String label;    // The label associated with the point

    // Constructor to initialize the location and label
    public LabeledPointE9_17(int x, int y, String label) {
        this.location = new Point(x, y);  // Creating a new Point object
        this.label = label;
    }

    // toString method to display the x, y coordinates and the label
    @Override
    public String toString() {
        return "LabeledPoint[" + location.toString() + ", label=" + label + "]";
    }
}
