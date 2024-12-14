package other;

public class D extends A {
    public void xyz() {
        // Accessing protected and package-private members
        System.out.println("Marks (protected): " + marks); // Accessible (protected)
        System.out.println("Name (default): " + name);    // Accessible (same package)
    }
}


