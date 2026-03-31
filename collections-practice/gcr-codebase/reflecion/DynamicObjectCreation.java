class Student {
    String name;
    int age;

    public Student() {
        name = "Rahul";
        age = 21;
    }
}

public class DynamicObjectCreation {
    public static void main(String[] args) throws Exception {
        Class<?> c = Class.forName("Student");
        Object o = c.getDeclaredConstructor().newInstance();
        System.out.println(o);
    }
}