public class Kennel {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("Age: \n---------------");
        dog.setAge(15);
        System.out.println(dog.getAge());
        System.out.println("In human age : "+dog.ageconvert());



        System.out.println("\nName: \n---------------");
        dog.setName("Cabbar");
        System.out.println(dog.getName());

        System.out.println("\nBreed: \n---------------");
        dog.setBreed("Chiwawa");
        System.out.println(dog.getBreed());

        System.out.println("\nColor: \n---------------");
        dog.setColor("Black");
        System.out.println(dog.getColor());

        System.out.println("\n"+dog.toString());

    }
}
