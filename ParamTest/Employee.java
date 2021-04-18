package ParamTest;

class Employee
{
    private String name;
    private double salary;

    public Employee(String n, double s)
    {
        name = n;
        salary = s;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public static void swap(Employee x, Employee y)
    {
        Employee temp = x;
        x = y;
        y = temp;
        System.out.println("End of Method: x = " + x.getName());
        System.out.println("End of Method: y = " + y.getName());
    }
}

class EmployeeWrapper {
    Employee e;

    EmployeeWrapper(Employee e) {
        this.e = e;
    }
}