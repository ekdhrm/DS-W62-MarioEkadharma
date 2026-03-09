class Employee{
    String name;
    double baseSalary;
    
    Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }
    
    String getRole(){
        return "";
    }
    
    double calculateSalary(){
        return baseSalary;
    }
    
    void printInfo(){
        System.out.println("Nama : " + name);
        System.out.println("Role : " + getRole());
        System.out.println("Salary : " + calculateSalary());
        System.out.println();
    }
}

class Manager extends Employee{
    Manager(String name, double baseSalary){
        super(name, baseSalary);
    }

    @Override
    String getRole(){
        return "Manager";
    }
    
    @Override
    double calculateSalary(){
        return baseSalary + 2000000;
    }
}
class Programmer extends Employee{
    Programmer(String name, double baseSalary){
        super(name, baseSalary);
    }
    
    @Override
    String getRole(){
        return "Programmer";
    }
    
    @Override
    double calculateSalary(){
        return baseSalary + 1000000;
    }
    
}
class Intern extends Employee{
    Intern(String name, double baseSalary){
        super(name, baseSalary);
    }
    
    @Override
    String getRole(){
        return "Intern";
    }
    
    @Override
    double calculateSalary(){
        return baseSalary + 300000;
    }
    
}

public class Mianheyo{
    public static void main(String[] args) {
        double totalPayroll = 0;
        Employee[] pekerja = new Employee[4];
    
        pekerja [0] = new Manager("Alya",5000000);
        pekerja [1] = new Programmer("Budi",4000000);
        pekerja [2] = new Programmer("Citra",4500000);
        pekerja [3] = new Intern("Dina",2000000);
        
        for (Employee list : pekerja){
            list.printInfo();
            totalPayroll += list.calculateSalary();
        }

        System.out.printf("Total Payroll: %.1f%n", totalPayroll);
    }
}
