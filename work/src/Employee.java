public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax;
    int bonus;
    double raise;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        double tax = 0;
        int bonus = 0;
        double raise = 0;
    }

    void tax() {
        if (this.salary >= 2000) {
            this.tax = this.salary * 0.03;
        }
    }

    void bonus() {
        if (this.workHours >= 30) {
            this.bonus = (this.workHours - 30) * 10;
        }
    }

    double raise() {
        if (2022 - this.hireYear < 10) {
            return this.raise = this.salary * 0.01;
        }
        if (2022 - this.hireYear < 30) {
            return this.raise = this.salary * 0.1;
        }
        return this.raise = this.salary * 0.15;
    }

    void print() {
        tax();
        bonus();
        raise();
        System.out.println("Name:"+this.name);
        System.out.println("Salary:"+this.salary);
        System.out.println("Work Hours:"+this.workHours);
        System.out.println("Hire Year:"+this.hireYear);
        System.out.println("Tax:"+ this.tax);
        System.out.println("Bonus:"+this.bonus);
        System.out.println("Raise Salary:"+this.raise);
        System.out.println("Salary with bonus and tax:"+(this.salary+this.bonus-this.tax));
        System.out.println("Total salary:"+(this.salary + this.raise));
    }
}
