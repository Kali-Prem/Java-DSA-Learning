abstract class RBI {      //controller
    abstract void interestRate(); // fixed and decided by rbi
    abstract void interestOnFd();
}
class PNB extends RBI {
    void interestRate(){        //fixed and decided by rbi
        System.out.println("8% on home loan");

    }
    void interestOnFd(){
        System.out.println("5.5% on FD");
    }
}

class SBI extends RBI {
    void interestRate(){       // fixed and decided by rbi
        System.out.println("6% on car loan");
    }
    void interestOnFd() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
class First {
    public static void main(String[] args) {
        PNB c1 = new PNB();
        c1.interestRate();
        SBI c2 = new SBI();
        c2.interestRate();
    }
    
}