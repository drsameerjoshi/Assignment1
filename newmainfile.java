public class newmainfile {
    
    public class Super_Department{
        public static String departmentName(){
            return("Super Department");
        }
        public static String getTotalWork(){
            return("No Work as of now");
        }
        public static String getWorkDeadline(){
            return("Nil");
        }
        public static String istodayAHoliday(){
            return("Today is not a holiday");
        }
    }

    public class Admin_Department extends Super_Department{
        public static String departmentName(){
           return("Welcome To Admin Department");
        }
        public static String getTotalWork(){
            return("Conplete Your Document Submission");
        }
        public static String getWorkDeadline(){
            return("Complete by EOD");
        }
    }
    public class HR_Department extends Super_Department{
        public static String departmentName(){
           return("Welcome to HR Department");
        }
        public static String DoActivity(){
            return("Team Lunch");
        }
        public static String getTotalWork(){
            return("Fill Todays Worksheet and Mark Attendance");
        }
        public static String getWorkDeadline(){
            return("Complete by EOD");
        }
        
    }
    public class Tech_Department extends Super_Department{
        public static String departmentName(){
        return("Welcome To Tech Department");
        }
        public static String getTotalWork(){
           return("Complete coding of Module 1");
        }
        public static String getWorkDeadline(){
            return("Complete by EOD");
        }
        public static String getTechStackinformation(){
            return("Core JAVA");
        }
    }
    
    static Admin_Department obj1=null;
    static HR_Department objhr=null;
    static Tech_Department objtech=null;

      static  String admindept, admintotal, admindeadline, adminholiday;
      static String hrdept, hract, hrtotal, hrdeadline, hrholiday;
    static String techdept, techtotal, techdeadline,techstack,techholiday; 
    public static void main(String[] args){
       admindept= obj1.departmentName();
       admintotal=obj1.getTotalWork();
       admindeadline=obj1.getWorkDeadline();
       adminholiday=obj1.istodayAHoliday();
       System.out.println(admindept.toString() + "\n" + admintotal.toString() + "\n" + admindeadline.toString() + "\n" + adminholiday);
       System.out.println("\n" + "\n");
       
       hrdept= objhr.departmentName();
       hract= objhr.DoActivity();
       hrtotal=objhr.getTotalWork();
       hrdeadline=objhr.getWorkDeadline();
       hrholiday=objhr.istodayAHoliday();
       System.out.println(hrdept.toString() + "\n" + hract.toString() + "\n" + hrtotal.toString() + "\n" + hrdeadline.toString() +"\n" + hrholiday);
       System.out.println("\n" + "\n");
       
       techdept= objtech.departmentName();
       techtotal= objtech.getTotalWork();
       techdeadline=objtech.getWorkDeadline();
       techstack=objtech.getTechStackinformation();
       techholiday=objtech.istodayAHoliday();
       System.out.println(techdept.toString() + "\n" + techtotal.toString() + "\n" + techdeadline.toString() + "\n" + techstack.toString() +"\n" + techholiday.toString());
       System.out.println("\n" + "\n");
    }
}