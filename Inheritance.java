import java.util.Arrays;

public class Inheritance {

    public static void main(String[] args) {

        Person p1 = new Person("John", "Smith", "Male");
        Person p2 = new Person("John", "Smith", "Male");

        System.out.println(p1);
        System.out.println("Persons equal: " + p1.equals(p2));

        String[] courses = {"Math", "Physics"};

        Teacher t1 = new Teacher("Alice", "Brown", "Female", "Computer Science", courses);
        Teacher t2 = new Teacher("Alice", "Brown", "Female", "Computer Science", courses);

        System.out.println(t1);
        System.out.println("Teachers equal: " + t1.equals(t2));
    }
}

class Person {

    private String firstName;
    private String lastName;
    private String gender;


    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public boolean equals(Person p) {
        if (p == null) return false;

        return firstName.equals(p.firstName) &&
               lastName.equals(p.lastName) &&
               gender.equals(p.gender);
    }
}


class Teacher extends Person {

    private String department;
    private String[] courses;

    public Teacher(String firstName, String lastName, String gender,
                   String department, String[] courses) {

        super(firstName, lastName, gender); 
        this.department = department;
        this.courses = courses;
    }

    public String getDepartment() {
        return department;
    }

    public String[] getCourses() {
        return courses;
    }

    
    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

   
    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", department='" + department + '\'' +
                ", courses=" + Arrays.toString(courses) +
                '}';
    }

    
    public boolean equals(Teacher t) {
        if (t == null) return false;

        return super.equals(t) &&
               department.equals(t.department) &&
               Arrays.equals(courses, t.courses);
    }
}