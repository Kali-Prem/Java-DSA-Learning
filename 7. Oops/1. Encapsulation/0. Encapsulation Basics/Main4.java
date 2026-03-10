public class Main4 {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.name = "Abd";
        c1.age = 20;
        c1.gender = "Male";
        
        c1.setEye("Blue");
        c1.setHeight(7);
        System.out.println(c1.getEye());
        System.out.println(c1.getHeight());
        System.out.println(c1.name);
        System.out.println("ABC");
        System.out.println(c1.age);
        System.out.println(c1.gender);
        
    }
}
class grandParent{
    String name;
    int age;
    String gender;
}
class Parent extends grandParent{
    private String eyecolor;
    public void setEye(String eyecolor){
    this.eyecolor = eyecolor;
    }
    public String getEye(){
    return eyecolor;
    }
}
class Child extends Parent{
    private int Height;
    public void setHeight(int Height){
    this.Height = Height;
    }
    public int getHeight(){
    return Height;
    }
}