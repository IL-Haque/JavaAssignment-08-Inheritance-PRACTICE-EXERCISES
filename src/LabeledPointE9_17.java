import java.awt.Point;

public class LabeledPointE9_17 {
    private Point location; 
    private String label;  

    public LabeledPointE9_17(int x, int y, String label) {
        this.location = new Point(x, y); 
        this.label = label;
    }
    @Override
    public String toString() {
        return "LabeledPoint[" + location.toString() + ", label=" + label + "]";
    }
}
