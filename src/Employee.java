class Employee {
    String name;
    double salary;
    Employee(String n,double s){name=n;salary=s;}
}
class Manager extends Employee {
    double bonus;
    Manager(String n,double s,double b){super(n,s);bonus=b;}
    void show(){
        System.out.println("Total Salary = "+(salary+bonus));
    }
    public static void main(String[] args){
        Manager m=new Manager("A",30000,5000);
        m.show();
    }
}
