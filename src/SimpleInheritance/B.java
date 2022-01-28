package SimpleInheritance;

public class B extends A {
    int k;

    void showk(){
        System.out.println("k: " + k);
    }

    void showSum(){
        System.out.println("i + j + k = " + (i+j+k));
    }
}
