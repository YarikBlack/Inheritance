package BoxInheritance;

public class BoxColor extends Box {
    String color;
    
    // Constract clone of Object
    BoxColor(BoxColor ob){
        super(ob);
        color = ob.color;
    }
    // Constructor used when we have all parameters
    BoxColor(double w, double h, double d, String c){
        super(w, h, d);
        color = c;
    }
    // Constructor  used when we dont have parameters
    BoxColor(){
        super();
        color = "None";
    }
    // Constructor used whe we create a Cube
    BoxColor(double len, String c){
        super(len);
        color = c;
    }
}
