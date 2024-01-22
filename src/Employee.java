public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    Employee(String name,double salary,int workHours, int hireYear){

        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        double tax_value = 0;
        if(this.salary>1000){
            tax_value = this.salary * 0.03;
        }
        return tax_value;
    }
    int bonus(){
        int dif;
        int bsalary =0;
        if (this.workHours > 40){
            dif = this.workHours -40;
            bsalary = dif * 30;
        }
        return bsalary;
    }
    double raiseSalary(){
        int year = 2021 -this.hireYear;
        double raise;
        if(year<=9){
            raise = this.salary*0.05;
        } else if (year<=19) {
            raise = this.salary*0.1;
        }else{
            raise = this.salary*0.15;
        }
        return raise;
    }


    void toString1(){
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (this.salary + tax() + bonus()));
        System.out.println("Toplam Maaş : " + (this.salary + tax() + bonus() + raiseSalary()));

    }


}
