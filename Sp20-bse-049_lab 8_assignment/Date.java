
package lab.pkg8;


public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.month = chekMonth(month);
        this.day = chekDay(day);
        this.year = year;
    }
    
    private int chekDay(int day){
        int[] dayofMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        if(day >= 0 && day <= dayofMonth[month])
            return day;
        
        else if (month == 2 && day == 29 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
            return day;
        else{
            System.out.println("invalid date. set automatically to 1.");
            return 1;
        }
    }
    
    private int chekMonth(int month){
        if(month > 0 && month <= 12)
            return month;
        else{
            System.out.println("invalid month..automatically set to 1.");
            return 1;
        }
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    
    public String toString(){
        return ("day: " + day + " month: " + month +  " year: " + year);
    }
      
}
