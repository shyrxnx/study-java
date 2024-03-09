import java.util.Collection;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        Scanner getStringInput = new Scanner(System.in);
        Collection<Employee> employees = new ArrayList<>();
        int choice;
        do {
            System.out.println("\n=================\nEmployee Manager\n=================");
            System.out.println("1 - Insert");
            System.out.println("2 - Display");
            System.out.println("3 - Search");
            System.out.println("4 - Delete");
            System.out.println("5 - Update");
            System.out.println("6 - Exit");
            System.out.print("\nEnter your choice: ");
            choice = getInput.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("\nEnter employee no: ");
                    int employeeNo = getInput.nextInt();
                    System.out.print("Enter employee name: ");
                    String employeeName = getStringInput.nextLine();
                    System.out.print("Enter salary: ");
                    double salary = getInput.nextDouble();
                    employees.add(new Employee(employeeNo, employeeName, salary));
                }
                case 2 -> {
                    System.out.println("\n=================\nEmployees\n=================");
                    for (Employee emp : employees) {
                        System.out.println(emp + "\n");
                    }
                }
                case 3 -> {
                    System.out.print("\nEnter employee number to search: ");
                    int searchEmployeeNo = getInput.nextInt();
                    boolean found = false;
                    for (Employee emp : employees) {
                        if (emp.getEmployeeNo() == searchEmployeeNo) {
                            System.out.println("\n=================\nEmployee found\n=================\n\n" + emp);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("\nEmployee not found.");
                    }
                }
                case 4 -> {
                    System.out.print("\nEnter employee number to delete: ");
                    int deleteEmployeeNo = getInput.nextInt();
                    Employee toDelete = null;
                    for (Employee emp : employees) {
                        if (emp.getEmployeeNo() == deleteEmployeeNo) {
                            toDelete = emp;
                            break;
                        }
                    }
                    if (toDelete != null) {
                        employees.remove(toDelete);
                        System.out.println("\nEmployee deleted.");
                    } else {
                        System.out.println("\nEmployee not found.");
                    }
                }
                case 5 -> {
                    System.out.print("\nEnter employee number to update: ");
                    int updateEmployeeNo = getInput.nextInt();
                    Employee toUpdate = null;
                    for (Employee emp : employees) {
                        if (emp.getEmployeeNo() == updateEmployeeNo) {
                            toUpdate = emp;
                            break;
                        }
                    }
                    if (toUpdate != null) {
                        System.out.print("\nEnter new employee name: ");
                        String newName = getStringInput.nextLine();
                        System.out.print("Enter new salary: ");
                        double newSalary = getInput.nextDouble();

                        toUpdate.setEmployeeName(newName);
                        toUpdate.setSalary(newSalary);
                        System.out.println("\nEmployee details updated.");
                    } else {
                        System.out.println("\nEmployee not found.");
                    }
                }
                case 6 -> System.out.println("\nExiting...");
                default -> System.out.println("\nInvalid choice. Please enter a number between 1 and 6.");
            }
        } while (choice != 6);
        getInput.close();
        getStringInput.close();
    }
}