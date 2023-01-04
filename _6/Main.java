public class Main {
    public static void main(String[] args) {


        Student[] student = new Student[2];
        student[0] = new Student("ANNA", "K", "R", 5);
        student[1] = new Aspirant("KATE", "C", "R", 3, "IT");

        for (Student i : student) {
            System.out.println(i.getScholarship());
        }
    }
}
