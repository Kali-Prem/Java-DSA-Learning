public class Main2 {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.name = "Sheru";
        a1.age = 10;
        System.out.println(a1.name);
        System.out.println(a1.age);
        System.out.println(a1.animalProperties("Barking"));

        Animal a2 = new Animal();
        a2.name = "anam";
        a2.age = 20;
        System.out.println(a2.name);
        System.out.println(a2.age);
        System.out.println(a2.animalProperties("Singing"));
    }
}
class Animal {
    String name;
    int age;

    public String animalProperties(String properties){
        return properties;
        
    }
        }