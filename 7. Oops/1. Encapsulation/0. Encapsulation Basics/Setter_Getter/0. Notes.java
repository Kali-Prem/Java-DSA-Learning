/*

Encapsulation mein Variables ko private rakhte hain aur getters/setters ke through access dete hain.

🔹 Encapsulation Ka Main Logic

Encapsulation me 3 important cheeze hoti hain:

           Variables ko private banana
           
           Public getter method banana (value lene ke liye)
           
           Public setter method banana (value set/change karne ke liye)

Note:- First write all setter then write all getter 

class Student {
    String name;
    int age;
}
Student s = new Student();
s.age = -10;   // Galat value bhi set ho sakti hai


//==WIth Encapsulation==========
class Student {
    private String name;
    private int age;

    // Setter method
    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
    }

    // Getter method
    public int getAge() {
        return age;
    }
}



================================



🔥 Step-by-Step Samjho
1️⃣ private keyword

Class ke bahar se access nahi hoga

2️⃣ Setter method

Value set karne ke liye

Yahan validation laga sakte ho

3️⃣ Getter method

Value read karne ke liye


//=================================
.

🚀 Ek Strong Example (Bank Account)
class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

Yahan:

Koi bhi direct balance = -1000 nahi kar sakta

Sirf deposit() ke through change hoga


*/
