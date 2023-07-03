import java.util.Arrays;
import java.util.Scanner;

public class MyFriends extends Student{

    public static Student[] StudentArray;

    public MyFriends(String studentName, int studentNumber, long regYear, String faculty, String department) {
        super(studentName, studentNumber, regYear, faculty, department);
    }

    public static void fillArray(){

        Scanner input = new Scanner(System.in);

        System.out.println("Please input the amount of students: ");

        int studentAmount = input.nextInt();
        StudentArray = new Student[studentAmount];

        for(int i = 0; i < studentAmount; i++){
            System.out.println("Input student StudentName: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.println("Input student StudentNumber: ");
            int StuNumber = input.nextInt();
            System.out.println("Input student registerYear: ");
            long registerYear = input.nextLong();
            input.nextLine();
            System.out.println("Input student faculty: ");
            String Faculty = input.nextLine();
            System.out.println("Input student department: ");
            String Department = input.nextLine();

            StudentArray[i] = new Student(name, StuNumber, registerYear, Faculty, Department);

        }
    }

    public static void main(String[] args) {

        fillArray();

        int computerScienceStudents= 0;

        for (int i = 0; i < StudentArray.length; i++) {
            if (StudentArray[i].getDepartment().equals("computer science")) {
                computerScienceStudents++;
            }
        }
        if(computerScienceStudents >= (0.5* StudentArray.length)){
            System.out.println("You … need more friends …");
        }else{
            System.out.println("Nice, diversity is good");
        }
    }


    @Override
    public String toString() {
        return super.toString();
    }


}
