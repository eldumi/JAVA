
@interface Info {
    String author();
    String version();
}

@Info(author = "Demo Author", version = "1.0")
public class Student
{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }

    public String sayHello()
    {
        return "Hello, " + name;
    }

    private void secretMethod() {
        System.out.println("This is a secret method.");
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
