import java.util.Scanner;

/**
 * Activity2PayStub class is part of Lab 3 and
 * creates a simple pay stub.
 * 
 * @author Bryan Zody
 * @version 02-12-2021
 */
public class Activity2PayStub
{
    public static final double OVERTIME_RATE = 1.5;
    public static final double SS_RATE = 0.10;
    public static final double TAX_RATE = 0.20;
    
    private String employee;
    private String social;
    private int regHours;
    private int overTime;
    private double payRate;
    
    private double regPay;
    private double overtimeRate;
    private double overtimePay;
    private double grossPay;
    private double socialTax;
    private double fedTax;
    private double netPay;
    /**
     * It all starts with the main method.
     * 
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Activity2PayStub a2ps = new Activity2PayStub();
        
        a2ps.getInput(keyboard);
        a2ps.calculate();
        a2ps.printPayStub();
    }
     /**
     * @param keyboard command-line argments (not used)
     */
    public void getInput(Scanner keyboard)
    {
        System.out.print("Enter name:");
        employee = keyboard.nextLine();
    
        System.out.print("Enter SSN(with hyphens):");
        social = keyboard.nextLine(); 
    
        System.out.print("Enter regular hours worked:");
        regHours = keyboard.nextInt();
    
        System.out.print("Enter overtime worked:");
        overTime = keyboard.nextInt();
    
        System.out.print("Enter pay rate:");
        payRate = keyboard.nextDouble();
    }
     /**
     *
     */
    public void calculate()
    {
        regPay = (payRate * regHours);
        overtimeRate = (payRate * OVERTIME_RATE);
        overtimePay = (overtimeRate * overTime);
        grossPay = (overtimePay + regPay);
        socialTax = (SS_RATE * grossPay);
        fedTax = (grossPay - socialTax) * TAX_RATE;
        netPay = grossPay - (socialTax + fedTax);
    }
     /**
      * 
     */
    public void printPayStub()
    {
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
