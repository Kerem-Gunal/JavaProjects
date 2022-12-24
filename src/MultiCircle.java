public class MultiCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Default radius: "+circle.getRadius());
        circle.setRadius(22);
        System.out.println("Your current radius: "+circle.getRadius());
        System.out.println(circle.toString());
    }
}
