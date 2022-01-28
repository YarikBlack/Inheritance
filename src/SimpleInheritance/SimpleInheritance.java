package SimpleInheritance;

public class SimpleInheritance {
    public static void main(String[] args){
        A superOb = new A();
        B subOb = new B();

        // Super Class can be used independent
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Super object contain: ");
        superOb.showij();
        System.out.println();

        // Sub Class have access to all opened members of Super class
        subOb.i = 3;
        subOb.j = 9;
        subOb.k = 12;
        System.out.println("Sub object contain: ");
        subOb.showij();
        subOb.showk();
        
        System.out.println();
        System.out.println("Sum of i, j, k in Sub object: ");
        subOb.showSum();
    }
}
