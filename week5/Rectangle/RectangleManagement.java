package week5.Rectangle;

import java.util.ArrayList;
import java.util.Scanner;

public class RectangleManagement {
    public static Scanner input;
    public static ArrayList<Rectangle_1> rectangles = new ArrayList<Rectangle_1>();

    public void inputRectangle() {
        int n = Integer.parseInt(input.nextLine());
        for (int i = 0; i < n; i++) {
            float length = Float.parseFloat(input.nextLine());
            float width = Float.parseFloat(input.nextLine());
            String color = input.nextLine();
            Rectangle_1 rectangle = new Rectangle_1(length, width, color);
            rectangles.add(rectangle);
        }
    }

    public void printRectangle() {
        for (Rectangle_1 rectangle : rectangles) {
            System.out.println(rectangle);
        }
    }

    public void sortByArea(ArrayList<Rectangle_1> rectangles) {
        for (int i = 0; i < rectangles.size() - 1; i++) {
            for (int j = 0; j < rectangles.size() - i -1; j++) {
                if(rectangles.get(j).getArea() > rectangles.get(j+1).getArea()) {
                    Rectangle_1 temp = rectangles.get(j);
                    rectangles.set(j, rectangles.get(j+1));
                    rectangles.set(j+1, temp);
                }
            }
        }
    }

    public ArrayList<Rectangle_1> findSquareMinArea(ArrayList<Rectangle_1> rectangles) {
        ArrayList<Rectangle_1> minSquareList = new ArrayList<>();
        double min = Double.MAX_VALUE;
        for (Rectangle_1 rectangle : rectangles) {
            if (rectangle.getArea() < min) {
                min = rectangle.getArea();
                minSquareList.clear();
                minSquareList.add(rectangle);
            } else if (rectangle.getArea() == min) {
                minSquareList.add(rectangle);
            }
        }
        return minSquareList;
    }

    public ArrayList<Rectangle_1> findKPerimeter(int k) {
        ArrayList<Rectangle_1> results = new ArrayList<>();
        sortByArea(rectangles);
        if (k > 0 && k <= rectangles.size()) {
            results.add(rectangles.get(k-1));
            return results;
        } return null;
    }

    public static void main(String[] args) {
        RectangleManagement rectangleManagement = new RectangleManagement();
        input = new Scanner(System.in);

        rectangleManagement.inputRectangle();
        rectangleManagement.printRectangle();
        System.out.println("-------------");
        rectangleManagement.sortByArea(rectangles);
        rectangleManagement.printRectangle();
        System.out.println("-------------");
        ArrayList<Rectangle_1> minSquareList = rectangleManagement.findSquareMinArea(rectangles);
        for (Rectangle_1 rectangle : minSquareList) {
            System.out.println(rectangle);
        }
        System.out.println("-------------");
        System.out.println("Enter k: ");
        int k = input.nextInt();
        ArrayList<Rectangle_1> results = rectangleManagement.findKPerimeter(k);
        if (results != null) {
            for (Rectangle_1 result : results) {
                System.out.println(result);
            }
        } else {
            System.out.println("null");
        }
    }

}
