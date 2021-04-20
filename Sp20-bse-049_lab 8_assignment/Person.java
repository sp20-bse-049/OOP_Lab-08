
package lab.pkg8;


public class Person {
    protected String name ; 
    protected String adress ;
    protected int phone ;
    protected String email;
    public Person() {
        name = "farhan" ;
        adress = "chak50 MB" ;
        phone = 12345 ;
        email = "zojaan42@gmail.com";
}
    public Person(String name , String adress , int phone , String email) {
        this.name = name ;
        this.adress = adress ;
        this.phone = phone ;
        this.email = email;
} 

public void display( ) {
        System.out.println("Name : " + name + "\nadress : " + adress + "\nPhone : " + phone + "\nemail adress: " + email ) ;
}
    
}

class Student extends Person  {
    private String status ;


    public Student(String name , String adress , int phone , String email , String status){
        super(name , adress , phone , email) ;
        this.status = status;
    }

    public void display( ) {
        super.display();
        System.out.println("status: "+ status) ;
    }
    
    
}


class Employee extends Person{
protected String office;
protected Date hiredate;
protected int salary;

public Employee(String name , String adress , int phone , String email , String office , int salary , Date hiredate) 
{
    super(name , adress , phone , email );
    this.office = office;
    this.salary = salary;
    this.hiredate = hiredate;
} 

public void display(){
    super.display();
    System.out.println("office : "+ office + "\nhire date: " + hiredate.toString() + "\nsalary : "+ salary);
}
}

class Faculty extends Employee {
    private int officeHours;
    private String rank;

    public Faculty(int officeHours, String rank, String name, String adress, int phone, String email, String office, int salary, Date hiredate) {
        super(name, adress, phone, email, office, salary, hiredate);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public int getOfficeHours() {
        return officeHours;
    }

    public String getRank() {
        return rank;
    }
    
    public void display(){
        super.display();
        System.out.println("office hours : " + officeHours + " rank: " + rank);
    }
    
}


class Staff extends Employee {
    private String title;

    public Staff(String title, String name, String adress, int phone, String email, String office, int salary, Date hiredate) {
        super(name, adress, phone, email, office, salary, hiredate);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    
    public void display(){
        super.display();
        System.out.println("title: " + title);
    }    
    
    
}
