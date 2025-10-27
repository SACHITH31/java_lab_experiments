
class AllShapes {
    double volume (int side) {
        return side * side * side;
    } // cube

    double volume (int l, int b, int h) {
        return l * b * h;
    } // cuboid

    double volume (float r, float h) {
        return Math.PI * r * r * h;
    } // cylinder
}

public class Shapes {
    public static void main(String[] args) {
        AllShapes a1 = new AllShapes();
        
        System.err.println(a1.volume(3));
        System.err.println(a1.volume(1, 2, 3));
        System.err.println(a1.volume(1, 1));
    }
}
