package emp.com;

import java.util.Random;
public class EmployeeWageComputation
{
     int Attend1,Attend2;
     static int Attend3;
    int EmpRatePerHr,EmpHrs,w;
    EmployeeWageComputation()
    {
        Random r = new Random();
        Attend1 = r.nextInt(2);
        Attend2 = r.nextInt(2);
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
    void wage()
    {
        if (Attend1 == 1 && Attend2 == 1) {
            EmpRatePerHr = 20;
            EmpHrs = 8;
            w = EmpRatePerHr * EmpHrs;
            System.out.println("FullTime employee and Employee Wage is :-" + w);
        } else if (Attend1 == 1 && Attend2 == 0) {
            EmpRatePerHr = 20;
            EmpHrs = 4;
            w = EmpRatePerHr * EmpHrs;
            System.out.println("PartTime employee and Employee Wage is :-" + w);
        }
        else if (Attend1 == 0)
        {
            System.out.println("Employee Wage is :-0");
        }
    }
    void switchStatement()
    {
        switch (Attend2)
        {
            case 1:
                EmpHrs = 8;
                break;
            case 0:
                EmpHrs = 4;
                break;
        }
        System.out.println(w = EmpRatePerHr * EmpHrs);
    }
    int totalWorkingDays=20,totalWage=0;
    void monthlyWage()
    {
        Random r = new Random();
        for(int i=1;i<=totalWorkingDays;i++)
        {
            Attend2 = r.nextInt(2);
            switch (Attend2) {
                case 1:
                    EmpHrs = 8;
                    break;
                case 0:
                    EmpHrs = 4;
                    break;
            }
            w = EmpRatePerHr * EmpHrs;
            totalWage=totalWage+w;
        }
        System.out.println("Total wage of month:-"+totalWage);
    }
    void monthlySalary2()
    {
        int  TotalEmpHrs=0;
        int totalWorkingDays=0;
        int  totalWage=0;
        while(TotalEmpHrs < 100 && totalWorkingDays < 20)
        {
            totalWorkingDays++;
            Random r = new Random();
            Attend2 = r.nextInt(2);
            switch (Attend2)
            {
                case 1:
                    EmpHrs = 8;
                case 0:
                    EmpHrs = 4;
            }
            TotalEmpHrs=TotalEmpHrs+EmpHrs;
            totalWage=TotalEmpHrs*EmpRatePerHr;

        }
        System.out.println("manthly salary is:-"+totalWage);

    }

    void ComputeEmpWage(String company,int EmpRatePerHr,int noOfWorkingDays,int maxHrsPerMonth)
    {
        int TotalEmpHrs=0,totalWorkingDays=0,totalWage=0;
        while(TotalEmpHrs<=maxHrsPerMonth &&totalWorkingDays<noOfWorkingDays)
        {
            totalWorkingDays++;

            Random r = new Random();
            Attend3= r.nextInt(2);
            switch(Attend3)
            {
                case 1:
                    EmpHrs = 8;
                case 0:
                    EmpHrs = 4;
                    break;
            }
            TotalEmpHrs=TotalEmpHrs+EmpHrs;
            System.out.println("days"+totalWorkingDays+"hours"+TotalEmpHrs);
        }
        totalWage=TotalEmpHrs*EmpRatePerHr;
        System.out.println(" wage for "+company+" is :-"+totalWage);

    }
        public static void main(String[] args)
        {
        System.out.println("Welcome to Employee Wage Computation Program");
        EmployeeWageComputation e = new EmployeeWageComputation();
        e.attendance();
        e.wage();
        e.switchStatement();
        e.monthlyWage();
        e.monthlySalary2();
        e.ComputeEmpWage("Dmart",20,2,10);
        e.ComputeEmpWage("Tata",25,8,15);
    }
}