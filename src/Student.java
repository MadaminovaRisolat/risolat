public class Student {
    // Variables (attributes)
    private String name;
    private int id;
    private int age;
    private String major;
    private int year1;
    private int year2;


    // Method to display car information
    public void displayInfo() {
        System.out.println("Student name is " + name);
        System.out.println("Student's id number is " + id);
        System.out.println("Student is  " + age);
        System.out.println("Student's major is " + major);
        System.out.println("It's been " + calculateYearsInSchool() + " years since she started studying");
    }
    public int calculateYearsInSchool() {
        return year1 - year2;
    }

    public static void main(String[] args) {
        // Creating an object of the Car class
        Student student = new Student();

        // Setting attributes
        student.name = "Maria";
        student.id = 230142015;
        student.age = 19;
        student.major= "Foundation of Creative Industries";
        student.year1 = 2024;
        student.year2 = 2020;


        // Display car information
        student.displayInfo();
    }
}
