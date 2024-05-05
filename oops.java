                                        // class and object
//class base{
//    int a,b,age;
//    String name;
//
//   public void print(){              // print name ka function
//        System.out.println(a+b +" "+name);    // add two num
//    }
//    public void age(){
//        System.out.println(this.age);
//    }
//
//}
//******************************************************************************************

                                      // type of constructor

//class StudentInformation{
//    String name ,id ,blood;
//    int age;
//    StudentInformation(){                                                      // constructor created
//        System.out.println("This is by default constructor");
//    }
//    StudentInformation(String name,String id,String blood,int age){             // parameter constructor
//        this.name=name;
//        this.id=id;
//        this.blood=blood;
//        this.age=age;
//        System.out.println(name);
//        System.out.println(id);
//        System.out.println(blood);
//        System.out.println(age);
//    }
//    StudentInformation(StudentInformation s2){
//        this.name=s2.name;
//        this.id=s2.id;
//        this.blood=s2.blood;
//        this.age=s2.age;
//    }
//}
                    //***********************************************************
                                        //   Polymorphism (Compile time)

//class Employee{
//    // function ka name alg alg hota h but parameter alg alg hota
//    public void EmployeeInformation(){
//        System.out.println("This is Employee Information");
//    }
//    public void EmployeeInformation(String name){
//        System.out.println(name);
//    }
//    public void EmployeeInformation(String name,String mobile){
//        System.out.println(name );
//        System.out.println(mobile);
//    }
//
//}
//*****************************************************************************************************
                                 // Inheritance (Single inheritance,multiLevel,hybrid,hierarchical)

//class Shape{
//    int l=4,b=7,r=9,pi=4;
//}
//class rectangle extends Shape{
//    public void area(){
//        System.out.println(l*b);
//    }
//}
//class circle extends Shape{
//    public void area(){
//        System.out.println(2*pi*r*r);
//    }
//}

                                        //*****************************************************
                                        // Access Modifier  (Default,Public, Protected,Private)

//class Account{
//  public   String name;
//  protected String accountNum;
//  private long amount;
//
//    public void setAmount(long amount) {
//        this.amount = amount;
//    }
//    public long getAmount(){
//        return amount;
//    }
//}
//class customer extends Account{
//   public void Amount(){
//       // System.out.println(amount);         // error can't access
//        System.out.println(accountNum);
//    }
//}

                                        //&********************************************************
                                        // Abstraction

// abstract class Animal{
//   abstract void walk();
//    abstract void eat();
                                        // constructor can make in abstract class
//}
// class horse extends Animal{
//    public void walk(){
//        System.out.println("horse is walking ");
//    }
//    public void eat(){
//        System.out.println("horse eating");
//    }
//}
//class tiger extends Animal{
//    public void walk(){
//        System.out.println("Tiger is walking");
//    }
//    public void eat(){
//        System.out.println("Tiger is eating deer");
//    }
//}
                                        //*****************************
                                        // Interfaces
//interface animal{
//    void eat();
//    int eye=2;    // final value
//    void running();
//}
//interface tiger extends animal{
//    void walking();
//}
//class horse implements animal{
//   public void eat(){
//        System.out.println("Horse is eating");
//    }
//    public void running(){
//        System.out.println("Horse is running");
//    }
//}
//class bear extends horse implements tiger{
// public void walking(){
//        System.out.println("Bear is walking");
//    }
//}
                                        //********************
                                        // static
class student{
    static String school;
    String name;
}
public class oops {
    public static void main(String[] args) {
        // class and object
//        base b1=new base();      // object created
//        b1.a=2;
//        b1.b=8;
//        b1.name="Saud";
//        b1.print();
//        base b2=new base();     // second obj ......... ek class ka multi obj bna skte hai
//        b2.age=90;
//        b2.age();
        //***********************************************

                        // type of constructor
//        StudentInformation s1=new StudentInformation();                                      // called by default parameter
//        StudentInformation s2=new StudentInformation("Saud","0191CS221185","O+",19); // called  parameter constructor
//        StudentInformation s3=new StudentInformation(s2);                                    // copy constructor


//**********************************************************
        //   Polymorphism (Compile time)
//        Employee e1=new Employee();
//        e1.EmployeeInformation();
//        e1.EmployeeInformation("Aman");
//        e1.EmployeeInformation("Saud","54635452886");


        //**********************************************************
        // Inheritance (Single inheritance,multiLevel,hybrid,hierarchical)
//        circle c1=new circle();
//
//        c1.b=4;
//        c1.pi=3;
//        c1.area();
//        rectangle r=new rectangle();
//        r.r=5;
//        r.area();



//****************************************************************
        // Access modifier(Default,Public, Protected,Private)


//Account a=new Account();
//a.name="Saud";                    // public everyone access
//        System.out.println(a.name);
//a.accountNum="45678@ybl";       // protected only access by sub class
//       // System.out.println(a.accountNum);
//a.setAmount(3456788);           // private accessible by getter & setter
//        System.out.println(a.getAmount());
//        customer c1=new customer();
//        c1.accountNum="2345678";
//        c1.Amount();

        //&********************************************************
        // Abstraction
//        horse h=new horse() ;
//        h.walk();
//        h.eat();
//     //   Animal a=new Animal(); // Can't create obj
//        tiger t=new tiger();
//        t.walk();
//        t.eat();

        //*****************************
        // Interfaces
//       bear a=new bear();
//        a.eat();
//        a.running();
//        a.walking();

        //****************
        //static
        student.school="GBPS";
        student s1=new student();
       // s1.name="Saud";
        System.out.println(s1.name="Saud");
        System.out.println(s1.school);
    }
}
