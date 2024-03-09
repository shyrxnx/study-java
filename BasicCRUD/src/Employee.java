class Employee {

    private int employeeNo;
    private String employeeName;
    private double salary;

    Employee(int employeeNo, String employeeName, double salary) {
        this.employeeNo = employeeNo;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public int getEmployeeNo() {
        return employeeNo;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setEmployeeName(String name) {
        this.employeeName = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Employee No: " + employeeNo + "\n" + "Employee Name: " + employeeName + "\n" + "Salary: $" + salary;
    }
}