import java.util.Scanner;

/**
 * Activity1PayStub class is part of Lab 3 and
 * creates a simple pay stub.
 * 
 * @author Bryan Zody
 * @version 02-12-2021
 */
public class Activity1PayStub
{
    public static final double OVERTIME_RATE = 1.5;
    public static final double SS_RATE = 0.10;
    public static final double TAX_RATE = 0.20;
    /**
     * It all starts with the main method.
     * 
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args)
    {
        Scanner payStub = new Scanner(System.in);
        
        System.out.print("Enter name:");
        String employee = payStub.nextLine();
        
        System.out.print("Enter SSN(with hyphens):");
        String social = payStub.nextLine(); 
        
        System.out.print("Enter regular hours worked:");
        int regHours = payStub.nextInt();
        
        System.out.print("Enter overtime worked:");
        int overTime = payStub.nextInt();
        
        System.out.print("Enter pay rate:");
        double payRate = payStub.nextDouble();
        
        double regPay = (payRate * regHours);
        double overtimeRate = (payRate * OVERTIME_RATE);
        double overtimePay = (overtimeRate * overTime);
        double grossPay = (overtimePay + regPay);
        double socialTax = (SS_RATE * grossPay);
        double fedTax = (grossPay - socialTax) * TAX_RATE;
        double netPay = grossPay - (socialTax + fedTax);
        
        for (int i = 0; i < 66; i++) 
        {
            System.out.print("_");
        }
        String format = "\nName: %-37s SSN: %-11s\n";
        System.out.printf(format, employee, social);
        
        String format2 = "Regular Hours: %-8d Reg Rate: $%-8.2f Reg Pay: $%-8.2f\n";
        System.out.printf(format2, regHours, payRate, regPay);
        
        String format3 = "Overtime Hours: %-7d OT Rate: $%-9.2f OT Pay: $%-8.2f\n";
        System.out.printf(format3, overTime, overtimeRate, overtimePay);
        
        String format4 = "Gross Pay: $%-8.2f\n";
        System.out.printf(format4, grossPay);
        
        String format5 = "SS Withholding: $%-8.2f\n";
        System.out.printf(format5, socialTax);
        
        String format6 = "Federal Tax: $%-8.2f\n";
        System.out.printf(format6, fedTax);
        
        String format7 = "Net Pay: $%-8.2f\n";
        System.out.printf(format7, netPay);
        
        for (int i = 0; i < 66; i++) 
        {
            System.out.print("_");
        }
    }
}
