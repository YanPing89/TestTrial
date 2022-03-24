package tution.student;


import java.time.LocalDate;

public class Student implements Comparable {
    private String name;
    private String birthDate;
    private int telNum;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", telNum=" + telNum +
                '}';
    }



    public Student(String name, String birthDate, int telNum) {
        this.name = name;
        this.birthDate = birthDate;
        this.telNum = telNum;
    }


    public String getName() {
        return name;
    }

    public void getName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getTelNum() {
        return telNum;
    }

    public void setTelNum(int telNum) {
        this.telNum = telNum;
    }


    @Override
    public int compareTo(Object o) {
        Integer s1Year = (LocalDate.parse(this.getBirthDate()).getMonthValue());
        Integer s2Year = (LocalDate.parse(((Student)o).getBirthDate()).getMonthValue());
        return s1Year.compareTo(s2Year);
    }
}
