//================Java OOPs Concepts================

/*

Object-Oriented Programming (OOP) is a programming paradigm that organizes software design around data, or objects, rather than functions and logic. It allows developers to create modular, reusable, and maintainable code by modeling real-world entities as objects with properties (attributes) and behaviors (methods).
The main 4 pillars of OOP are:
1. Encapsulation -- prvide security(private to only variables)
2. Inheritance   -- reuse code and create new class from existing class
3. Polymorphism  -- naam ek kaam anek and Error handling when same function but different paramter (overloading) or same function but different class (overriding))
4. Abstraction  -- provide more security and hide complexity (abstract class and interface)

*/

/*================ 1. Encapsulation =================
1. Encapsulation:-
Encapsulation is the process of hiding data using private variables and 
providing controlled access through public getter and setter functions/method.

Example:-
class EncapsulationExample {
    private String name; // private variable

    // public getter method
    public String getName() {
        return name;
    }

    // public setter method
    public void setName(String name) {
        this.name = name;
    }
}

*/

/*================ 2. Inheritance =================
2. Inheritance:-    
Inheritance is a fundamental OOP concept that allows a new class (called a subclass or child class) to inherit
properties and behaviors (fields and methods) from an existing class (called a superclass or parent class). This promotes code reusability and establishes a natural hierarchical relationship between classes.

3 types of Inheritance in Java:
1. Single Inheritance: A subclass inherits from a single superclass.    
2. Multilevel Inheritance: A subclass inherits from a superclass, which in turn inherits from another superclass.
3. Hierarchical Inheritance: Multiple subclasses inherit from a single superclass.

Example:-
// Superclass (Parent Class)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass (Child Class) inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}   
// Another Subclass (Child Class) inheriting from Animal
class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}

*/

/*================ 3. Polymorphism =================
3. Polymorphism:-   
Polymorphism is the ability of an object to take on many forms. In Java, it allows a single interface to be used for a general class of actions. The specific action is determined by the exact nature of the situation. Polymorphism can be achieved through method overloading and method overriding.
Example:-
// Method Overloading (Compile-time Polymorphism) -- same method name but different parameters
class MathUtils {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
}       
// Method Overriding (Runtime Polymorphism) -- same method name but different class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}   
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

*/
/*================ 4. Abstraction =================
4. Abstraction:-
Abstraction is the concept of hiding the complex implementation details and showing only the necessary features of an
object. In Java, abstraction can be achieved using abstract classes and interfaces.

Example:-

*/




//==========================Important Points=======================

/*
java mein OOPs concepts ke alawa bhi kuch important points hote hain jo aapko dhyan mein rakhne chahiye:

java me pass by value hota hai, iska matlab hai ki jab aap kisi variable ko method ke andar pass karte hain, to uska ek copy ban jata hai. Isliye, agar aap method ke andar variable ki value change karte hain, to original variable ki value change nahi hoti.

EXAMPLE:-
public class PassByValueExample {
    public static void main(String[] args) {
        int originalValue = 10;
        modifyValue(originalValue);
        System.out.println("Original Value: " + originalValue); // Output: Original Value: 10
    }

    public static void modifyValue(int value) {         // yahan originalValue ka sirf value pass ho raha hai value ko, reference nahi . Yahan pr value ki jagah hum kuchh bhi likhe jese x then fir bhi originalValue ka value 10 pass hokar x ko milega
        value = 20; // This change will not affect the original variable
    }
}




//Note:-

Java me memory management automatic hota hai, iska matlab hai ki aapko manually memory allocate ya deallocate karne ki zarurat nahi hoti. Java ka garbage collector automatically unused objects ko remove kar deta hai, jisse memory efficient hoti hai.
Java me multithreading support hota hai, jiska matlab hai ki aap ek program ke andar multiple threads create kar sakte hain jo simultaneously execute hote hain. Isse aap apne program ko faster aur responsive bana sakte hain.
Java me exception handling mechanism hota hai, jiska matlab hai ki aap apne program me errors ko handle kar sakte hain using try-catch blocks. Isse aap apne program ko crash hone se bachate hain aur user-friendly error messages provide kar sakte hain.
Java me platform independence hota hai, iska matlab hai ki aap ek baar Java code likh kar usse kisi bhi platform par run kar sakte hain without any modifications. Java Virtual Machine (JVM) ke through, Java code ko bytecode me convert kiya jata hai, jo kisi bhi platform par execute ho sakta hai.
Java me strong type checking hota hai, iska matlab hai ki aapko variables ko declare karte waqt unka data type specify karna hota hai. Isse aapko compile-time errors milte hain agar aap galat data type ka use karte hain, jisse aapke program ki reliability badh jati hai.
Java me standard libraries ka support hota hai, jisme aapko bahut saare pre-built classes aur methods milte hain jo aapke programming tasks ko asaan banate hain. Jaise ki java.util package me collections framework, java.io package me file handling classes, java.net package me networking classes, etc.
Java me object-oriented programming (OOP) concepts ka support hota hai, jisme aap classes aur objects ka use karke apne program ko modular aur reusable bana sakte hain. OOP ke main pillars hain encapsulation, inheritance, polymorphism, aur abstraction.

//==========================Important Points=======================
Notes:==

int a = 10;
int x = 15;   --->Helping variable
Dynamic allocation(queue) --> PQ
Pointer( Java not available) --> Reference variable
List ---> Dynamic L.DS
1-->2-->3-->4-->5(X bytes ) hexa code
print(x);
f1();













