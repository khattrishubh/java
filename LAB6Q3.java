class Employee
{
    void work()
    {
        System.out.println("Employee is working");
    }
    double getSalary() {
        return 30000.0;
    }
}

class HRManager extends Employee
{
    void work()
    {
        System.out.println("HR Manager is managing employees");
    }
    void addEmployee()
    {
        System.out.println("New employee added");
    }
}

public class LAB6Q3 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.work();
        System.out.println("Salary: " + e.getSalary());

        HRManager hr = new HRManager();
        hr.work();
        hr.addEmployee();
        System.out.println("Salary: " + hr.getSalary());
    }
}