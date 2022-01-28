package BoxInheritance;

public class Box {
    private double width;
    private double heigth;
    private double depth;
    
    // Construct clone of object
    Box(Box ob){
        width = ob.width;
        heigth = ob.heigth;
        depth = ob.depth;
    }
    // Constructor used when we have all parameters
    Box(double w, double h, double d){
        width = w;
        heigth = h;
        depth = d;
    }
    // Constructor used when we doesn't have parameters
    Box(){
        width = -1;
        heigth = -1;
        depth = -1;
    }
    // Constructor used when whe we hava a Cube
    Box(double len){
        width = heigth = depth = len;
    }
    // Count and return Area
    double volume(){
        return width * heigth * depth;
    }
}
