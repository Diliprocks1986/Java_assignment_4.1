import pkg2.Two;

public class Three {
    public static void main(String[] args) {
        new Two().callShowMe(); // calling instance method which in turn a protected method through inheritance 
    }
}