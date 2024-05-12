package week5.Rectangle;

public class Rectangle_1 {
    private float length;
    private float width; 
    private String color;

    public Rectangle_1() {
    }

    public Rectangle_1(float length, float width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double getArea() {
        return width*length;
    }

    public double getPerimeter() {
        return 2*(width + length);
    }

    @Override
    public String toString() {
        return "Rectangle_1[Length=" + length + "; Width=" + width + "; Color=" + color + "; Area=" + getArea() + "; Perimeter=" + getPerimeter() +  "]";
    }

    
}
