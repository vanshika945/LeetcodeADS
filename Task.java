class Neeraj {
    void print1() {
        System.out.println("print 1 ");
    }

    void print2() {
        System.out.println("print 2 ");
    }
}


class Neeraj1 extends Neeraj {
    void print3() {
        System.out.println("print 3 ");
    }

    void print4() {
        System.out.println("print 4 ");
    }

    
    void ParentActions() {
        super.print1(); 
        super.print2();
    }

    void ChildActions() {
        this.print3(); 
        this.print4();
    }
}

public class vanshika {
    public static void main(String[] args) {
        Neeraj1 x = new Neeraj1();

        System.out.println("calling parent method:");
        x.ParentActions(); 

        System.out.println("\ncalling child method :");
        x.ChildActions(); 
    }
}
