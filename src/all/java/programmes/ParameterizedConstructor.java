package all.java.programmes;

public class ParameterizedConstructor {

    int studentId;
    String studentName;

    java.lang.String ParameterizedConstructor(int id, String name) {
        this.studentId = id;
        this.studentName = name;
        System.out.println("Id: " + studentId + " Name: " + studentName);
        return studentName;
    }


    public static void main(String[] args) {
        ParameterizedConstructor obj=new ParameterizedConstructor();
        System.out.println(obj.ParameterizedConstructor(100, "Hello"));
        //ParameterizedConstructor obj2 = new ParameterizedConstructor(101, "Savita");

    }
}