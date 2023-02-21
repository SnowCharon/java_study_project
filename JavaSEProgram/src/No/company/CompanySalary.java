package No.company;

abstract class Employee {
    public abstract double earings();
}

class YearWorker extends Employee {
    public double earings() {
        return 12000;
    }
}

class MonthWorker extends Employee {
    public double earings() {
        return 12 * 2300;
    }
}

class WeekWorker extends Employee {
    public double earings() {
        return 52 * 780;
    }
}

class Company {
    Employee[] employee;
    double salaries = 0;

    Company(Employee[] employee) {
        this.employee = employee;
    }

    public double salariesPay() {
        salaries = 0;
        for (int i = 0; i < employee.length; i++) {
            salaries = salaries + employee[i].earings();
        }
        return salaries;
    }
}

public class CompanySalary {
    public static void main(String args[]) {
        Employee[] employee = new Employee[29];
        for (int i = 0; i < employee.length; i++) {
            if (i % 3 == 0)
                employee[i] = new WeekWorker();
            else if (i % 3 == 1)
                employee[i] = new MonthWorker();
            else if (i % 3 == 2)
                employee[i] = new YearWorker();

        }
        Company company = new Company(employee);
        System.out.println("公司薪水总额：" + company.salariesPay() + "元");
    }
}