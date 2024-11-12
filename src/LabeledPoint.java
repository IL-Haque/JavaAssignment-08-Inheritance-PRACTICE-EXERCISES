public class LabeledPoint {
    private int x;
    private int y;
    private String label;

    // Constructor to initialize the coordinates and label
    public LabeledPoint(int x, int y, String label) {
        this.x = x;
        this.y = y;
        this.label = label;
    }

    // toString method to display the x, y coordinates and the label
    @Override
    public String toString() {
        return "LabeledPoint[x=" + x + ", y=" + y + ", label=" + label + "]";
    }
}
