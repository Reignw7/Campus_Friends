public class Student {

    public static String studentName;
    public static int studentNumber;
    public  long regYear;
    public static String faculty;
    public  String department;

    public Student(String studentName, int studentNumber, long regYear, String faculty,String department) {
       this.studentName = studentName;
       this.studentNumber = studentNumber;
       this.regYear = regYear;
       this.faculty= faculty;
       this.department= department;
    }

    //Accessors

    public int getStudentNumber(){
        return studentNumber;
    }
    public String getStudentName(){
        return studentName;
    }
    public long getRegYear(){
        return regYear;
    }
    public String getFaculty(){
        return faculty;
    }
    public String getDepartment(){
        return department;
    }

     //mutators

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
    public void setStudentName(String studentName){
        this.studentName= studentName;
    }
    public void setRegYear(long regYear){
        this.regYear= regYear;
    }
    public void setFaculty(String faculty){
        this.faculty= faculty;
    }
    public void setDepartment(String department){
        this.department= department;
    }


    public static String toString(Student a){
        return studentName + " " + studentNumber + " " + faculty;
    }

}