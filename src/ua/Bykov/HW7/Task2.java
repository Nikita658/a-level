package ua.Bykov.HW7;

public class Task2 {
    public static void main(String[] args) {
        Student[] student = new Student[2];
        student[0] = new Student("Anton", "Ivleev", "Trimi", 4.0);
        student[1] = new Aspirant("Bob", "Argentov", "TRTK", 5.0, "курсовая");
        System.out.println(student[0].getScholarship());
        System.out.println(student[1].getScholarship());
    }

}
