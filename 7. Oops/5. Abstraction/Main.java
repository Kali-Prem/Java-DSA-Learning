class Main {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.setName("Kali Linux");
        System.out.print(c1.getName());
    }

}
abstract class Parent {
    private String name;
    //setter
    public void setName(String name){
        this.name = name;
    }
    //getter
    public String getName(){
        return name;
    }
}
class Child extends Parent {
    

}