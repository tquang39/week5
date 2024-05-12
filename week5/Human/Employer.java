package week5.Human;

public class Employer implements Human {
    private String name;
    private double baseSalary;
    private double scale;
    
    public Employer() {
    }

    public Employer(String name, double baseSalary, double scale) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.scale = scale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getScale() {
        return scale;
    }

    public void setScale(double scale) {
        this.scale = scale;
    }

    public double getSalary() {
        double salary = baseSalary * (1+scale);
        return salary;
    }

    @Override
    public String toString() {
        return "Employer=[Name=" + name + ", Salary=" + getSalary() + "]";
    }

}
