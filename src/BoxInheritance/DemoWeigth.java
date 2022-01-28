package BoxInheritance;

public class DemoWeigth {
    public static void main(String[] args){
        // Object of class BoxWeigth
        BoxWeigth myBox1 = new BoxWeigth(10, 20, 30, 30.6); // All arguments
        BoxWeigth myBox2 = new BoxWeigth(); // Without arguments
        BoxWeigth myClone = new BoxWeigth(myBox1); // Create a clone of object
        BoxWeigth myCube = new BoxWeigth(10, 5); // Create a Cube with weigth

        // Object of class BoxColor
        BoxColor myBox3 = new BoxColor(10, 20, 30, "Red");
        BoxColor myBox4 = new BoxColor(); // Without arguments
        BoxColor myClone2 = new BoxColor(myBox3); // Create a clone of object
        BoxColor myCube2 = new BoxColor(16, "White"); // Create a Cube with color
        
        // Output all object of class BoxWeigth
        System.out.println("Area of myBox1: " + myBox1.volume());
        System.out.println("Weigth of myBox1: " + myBox1.weigth);
        System.out.println();

        System.out.println("Area of myBox2: " + myBox2.volume());
        System.out.println("Weigth of myBox2: " + myBox2.weigth);
        System.out.println();

        System.out.println("Area and weigth of myClone: " + myClone.volume() + " " + myClone.weigth);
        System.out.println();

        System.out.println("Area and weigth of myCube: " + myCube.volume() + " " + myCube.weigth);
        System.out.println();

        // Output all object from class BoxColor
        System.out.println("Area of myBox3: " + myBox3.volume());
        System.out.println("Color of myBox3: " + myBox3.color);
        System.out.println();

        System.out.println("Area of myBox4: " + myBox4.volume());
        System.out.println("Color of myBox4: " + myBox4.color);
        System.out.println();

        System.out.println("Area and color of myClone2: " + myClone2.volume() + " " + myClone2.color);
        System.out.println();

        System.out.println("Area and color of myCube2: " + myCube2.volume() + " " + myCube2.color);
    }
}
