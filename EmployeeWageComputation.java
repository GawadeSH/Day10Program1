package emp.com;

import java.util.Random;
public class EmployeeWageComputation
{
    int Attend1;
    EmployeeWageComputation()
    {
        Random r = new Random();
        Attend1 = r.nextInt(2);
    }
    void attendance()
    {
        if(Attend1==1)
        {
            System.out.println("Employee is present");
        }
        else if (Attend1==0)
        {
            System.out.println("Employee is absent");
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Welcome to Employee Wage Computation Program");
        EmployeeWageComputation e = new EmployeeWageComputation();
        e.attendance();
    }
}