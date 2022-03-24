package tution;

import tution.student.*;

import java.time.LocalDate;
import java.util.*;


public class Main {

    public static void main (String[] args) {
        HashMap<Integer, Student> stuReg = new HashMap<>();
        do {
            int mainChoice = mainMenu();
            if (mainChoice == 1) {
                enrollStudent(stuReg);
            } else if (mainChoice == 2) {
                removeStudent(stuReg);
            } else if (mainChoice == 3) {
                for (HashMap.Entry list : stuReg.entrySet()) {
                    System.out.println(list);
                }
            } else if (mainChoice == 4) {
                searchStudent(stuReg);
            } else if (mainChoice == 5) {
                filterStudentAge(stuReg);
            }else if (mainChoice == 6) {
                sortBy(stuReg);
            }else if (mainChoice == 7) {
                System.out.print("Thank you!");
                break;
            }
        } while (true);

    }

        public static void enrollStudent (HashMap < Integer, Student > addStuList) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter Unique ID of Student: ");
            int id = 0;
            try{
                id = in.nextInt();
            }catch (Exception e){
                System.out.println("Wrong Input! Please Try Again!");
                enrollStudent(addStuList);
            }
            System.out.print("Enter Name of Student: ");
            String name = in.next();
            System.out.print("Date of Birth (yyyy-MM-dd):");
            String dob = in.next();
            try{
            LocalDate dobObf = LocalDate.parse(dob);
            }catch (Exception e){
                e.printStackTrace();
                System.out.println("Wrong Input! Please Try Again!");
                enrollStudent(addStuList);
            }
            System.out.print("Enter Telephone number of Student: ");
            int telNum =  in.nextInt();
            addStuList.put(id,new Student(name,dob,telNum));
            System.out.println("New student added successfully");
            }

        public static void removeStudent (HashMap < Integer, Student > remStuList){
            Scanner in = new Scanner(System.in);
            System.out.print("Enter Unique ID of Student: ");
            int id = in.nextInt();
//            System.out.print("Enter Name of Student: ");
//            String name =  in.next();
//            System.out.print("Date of Birth (yyyy-MM-dd):");
//            String dob =  in.next();
//            System.out.print("Enter Telephone number of Student: ");
//            int telNum =  in.nextInt();
//            LocalDate dobObf = LocalDate.parse(dob);
            remStuList.remove(id);
            System.out.println("Student Remove Successfully");
    }
        public static int mainMenu () {
            Scanner in = new Scanner(System.in);
            System.out.println("Whaaatclub's Tuition Center");
            System.out.println("1)Add a New Student");
            System.out.println("2)Remove a existing Student");
            System.out.println("3)List all existing Student");
            System.out.println("4)Search for existing Student with unique key");
            System.out.println("5)Filter student according to age");
            System.out.println("6)Sort student adding to DOB");
            System.out.println("7)Exit");
            System.out.println("Enter Choice: ");
            return in.nextInt();
        }

            public static void searchStudent(HashMap < Integer, Student > searchStuList) {
                Scanner in = new Scanner(System.in);
                System.out.println("Please input the unique key: ");
                int searchKey = in.nextInt();
                for (HashMap.Entry search : searchStuList.entrySet()) {
                    if (search.getKey().equals(searchKey)) {
                        System.out.println(search);
                    }
                }
            }
             public static void filterStudentAge(HashMap < Integer, Student > filterStuAge) {
                 Scanner in = new Scanner(System.in);
                 System.out.println("Please input the age: ");
                 LocalDate todayDate = LocalDate.now();
                 int inputAge = in.nextInt();
                 int nowYear = todayDate.getYear();
                 for (Student student : filterStuAge.values()) {
                     String dob = student.getBirthDate(); // "2022-03-03"
                     LocalDate dobObj = LocalDate.parse(dob);
                     int year = dobObj.getYear();   ///2022
                     //dobObj.getDayOfYear();
                     //dobObj.getMonth();
                     int age = nowYear - year;
                     if (age == inputAge) {
                         System.out.println(student.toString());
                     }
                 }
             }
                 public static void sortBy (HashMap < Integer, Student > sortByStuList){
                     List<Student> sortingList = new ArrayList(sortByStuList.values());
                     Collections.sort(sortingList);
                     for (Student s : sortingList) {
                         System.out.println(s.toString());
                     }
                 }

}