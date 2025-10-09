package luis.FundamentosPooJava.GetersSeters.Company;

public class Employee {
    private String name;
    private double salary;
    private String position;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        salary = newSalary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String newPosition) {
        position = newPosition;
    }

    public double increaseSalary() {
        salary = salary + (salary * 0.05);
        return salary;
    }

    public double annualSalary() {
        return salary*12;
    }
}
