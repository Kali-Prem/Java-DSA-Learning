
public class Main {

    public static void main(String[] args) {
        Student s1 = new Student();
        //s1.name = "Kali";  //not possible because name entitiy is private
        s1.setName("Kali Linux");       //setName change the value after calling the setName function
        s1.setAge(20);
        s1.setGender("male");

        System.out.print(s1.getName());  //getName return the value
        System.out.println(s1.getAge());
        System.out.println(s1.getGender());

    }
}

class Student {

    private String name;
    private int age;
    private String gender;

    //setter Function
    public void setName(String name) {          //non static kyunki access krni hai main function me ess studnet class ke function ko;
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    // Getter Function
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
}
