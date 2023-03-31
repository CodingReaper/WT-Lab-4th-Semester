package LabAssignment8;
import LabAssignment8.General.employee;
import LabAssignment8.Marketing.sales;


public class implement {
    public static void main(String[] args) {
        sales emp = new sales(1, "John", 50000);
        double total_earnings = emp.earnings() + emp.tallowance();
        int empid = emp.getEmpid();
        System.out.println("Employee Id: " + empid);
        System.out.println("Total Earnings: " + total_earnings);
        System.out.println("Travelling Allowance: " + emp.tallowance());
    }
}
