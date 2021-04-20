
package lab.pkg8;


public class Act1_runner {
    public static void main(String[] args){
        Date d = new Date(2,7,2004);
        Student st1 = new Student("farhan" , "jauharabad" , 123456789 ,"abc@gmail.com" , "single");
        st1.display();
        
        Staff f = new Staff("employee" , "asad" , "islamabad" , 123456 , "asdf@gmail.com"  , "Admission office" , 30000 , d);
        System.out.println("\n");
        f.display();
    }
    
}
