package UseSuper;

public class B extends A {
    int i; // this member hide member i from class A

    B(int a, int b){
        super.i = a; // member from class A
        i = b; // member from class B
    }

    void show(){
        System.out.println("Member 'i' in Super class: " + super.i);
        System.out.println("Member 'i' in Sub class: " + i);
    }
}
