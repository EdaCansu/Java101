package salary;

import java.util.Date;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }


    int tax(){
        if (this.salary > 1000){
            return (int) (salary * 0.03);
        }
        return 0;
    }

    int bonus(){
        if(this.workHours >= 40){
            int surplus = this.workHours - 40;
            return surplus * 30;
        }
        return 0;
    }

   int raiseSalary(){
        Date thisYear = new Date();
        int workYear = (thisYear.getYear() + 1900) - this.hireYear;
        if(workYear < 10){
            return (this.salary * 5) / 100;
        }
       if(workYear < 20 ){
           return (this.salary * 10) / 100;
       }
       if(workYear > 20){
           return (this.salary * 15) / 100;
       }
       return 0;
    }

    void print(){
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        System.out.println("Vergi miktarı: " + tax() + " TL");
        System.out.println("Bonus: "+ bonus() + " TL");
        System.out.println("Maaş artışı: " + raiseSalary() + " TL");
        int sum = (this.salary + bonus()) - tax();
        System.out.println("Vergi ve Bonuslar ile birlikte maaş :" + sum + " TL");
        int all = sum + raiseSalary();
        System.out.println("Toplam maaş :" + all + " TL");
    }


}
