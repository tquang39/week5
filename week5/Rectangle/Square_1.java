package week5.Rectangle;

public class Square_1 extends Rectangle_1 {
    private float size;

    public Square_1(float size) {
        this.size = size;
    }

    public Square_1(float length, float width, String color, float size) {
        super(length, width, color);
        this.size = size;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    @Override
    public double getArea() {
        return size * size;
    }

    @Override
    public double getPerimeter() {
        return 4 * size;
    }

    @Override
    public String toString() {
        return "Square_1 [getLength()=" + getLength() + "; Width=" + getWidth()  
                + "; getColor()=" + getColor()+  "; getArea()=" + getArea() + "; getPerimeter()=" + getPerimeter()  + "]";
    }

    
}
