package all.java.programmes;

public class ParameterizedConstructor {

    int studentId;
    String studentName;

    //parameterized constructor with two parameters
    ParameterizedConstructor(int id, String name) {
        this.studentId = id;
        this.studentName = name;
    }

    void info() {
        System.out.println("Id: " + studentId + " Name: " + studentName);
    }

    public static void main(String[] args) {
        ParameterizedConstructor obj1 = new ParameterizedConstructor(100, "Suraj");
        ParameterizedConstructor obj2 = new ParameterizedConstructor(101, "Savita");
        obj1.info();
        obj2.info();
    }
}