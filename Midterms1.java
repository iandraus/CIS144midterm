package midterms1;
/**
 *
 * @author iandr
 */

import java.util.Scanner;

public class Midterms1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an instance of the outer class HourlyPay
        HourlyPay hourlyPay = new HourlyPay();

        // Create an instance of the inner class Employee
        HourlyPay.Employee employee = hourlyPay.new Employee();

        // Input employee details
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();
        employee.setName(name);

        System.out.print("Enter hours worked: ");
        double hours = sc.nextDouble();
        employee.setHours(hours);

        System.out.print("Enter hourly pay rate: ");
        double payRate = sc.nextDouble();
        employee.setPayRate(payRate);

        System.out.print("Enter tax or deductions (holdings): ");
        double holdings = sc.nextDouble();
        employee.setHoldings(holdings);

        // Calculate the employee's pay
        employee.CalculatePay();

        // Output employee details
        System.out.println("\n--- employee pay summary ---");
        System.out.println("employee name: " + employee.getName());
        System.out.println("hours worked: " + employee.getHours());
        System.out.println("hourly payrate: $" + employee.getPayRate());
        System.out.println("deductions (holdings): $" + employee.getHoldings());
        System.out.println("net payment: $" + employee.getPayment());
    }
}