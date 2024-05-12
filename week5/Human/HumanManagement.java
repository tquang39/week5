package week5.Human;

import java.util.Scanner;
import java.util.ArrayList;


public class HumanManagement {
    public static Scanner input;
    public void inputData(ArrayList<Human> humans) {
        String name, position;
        double baseSalary, scale;
        int experience;
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            char type = input.next().charAt(0);
            input.nextLine();
            if (type == 'a') {
                name = input.nextLine();
                position = input.nextLine();
                baseSalary = input.nextDouble();
                experience = input.nextInt();
                input.nextLine();
                Employee employee = new Employee(name, position, baseSalary, experience);
                humans.add(employee);
            } else if (type == 'b') {
                name = input.nextLine();
                baseSalary = input.nextDouble();
                scale = input.nextDouble();
                input.nextLine();
                Employer employer = new Employer(name, baseSalary, scale);
                humans.add(employer);
            }
        }
    }

    public void outputData(ArrayList<Human> humans) {
        for (Human human : humans) {
            System.out.println(human);
        }
    }

    public static void main(String[] args) {
        input = new Scanner(System.in);
        ArrayList<Human> humans = new ArrayList<>();
        HumanManagement humanManagement = new HumanManagement();
        humanManagement.inputData(humans);
        humanManagement.outputData(humans);


    }
}
