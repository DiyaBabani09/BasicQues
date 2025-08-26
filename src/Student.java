public class Student {
private String name;
private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student s=new Student();
        s.setName("Diya");
        System.out.println(s.getName());
        s.setAge(20);
        System.out.println(s.getAge());
    }
}
