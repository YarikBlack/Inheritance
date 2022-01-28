package BoxInheritance;

public class BoxWeigth extends Box{
    double weigth;

    // Construct clone of object
    BoxWeigth(BoxWeigth ob){
        super(ob);
        weigth = ob.weigth;
    }
    // Constructor used when we have all parameters
    BoxWeigth(double w, double h, double d, double m){
        super(w, h, d);
        weigth = m;
    }
    // Constructor used when we dont have all parameters
    BoxWeigth(){
        super();
        weigth = -1;
    }
    // Constructor used when we create Cube
    BoxWeigth(double len, double m){
        super(len);
        weigth = m;
    }
}
