package luis.luis.FundamentosPooJava.GetersSeters.Company;

public class TesteEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Luís Miguel");
        employee.setPosition("Developer JAVA");
        employee.setSalary(6500.0);
        employee.increaseSalary();
        employee.annualSalary();

        System.out.println("Employee: "+employee.getName()+
                "\nPosition: "+employee.getPosition()+
                "\nOriginal Salary: "+employee.getSalary()+
                "\nSalary after increase: "+employee.increaseSalary()+
                "\nAnnual Salary: "+employee.annualSalary());
    }
}
