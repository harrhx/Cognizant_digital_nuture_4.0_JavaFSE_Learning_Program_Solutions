public class BuilderPatternExample {

    public static void main(String[] args) {

        Computer basicComputer = new Computer.Builder("Intel i5", "8GB", "256GB SSD").build();
        System.out.println("\nCreated Basic Computer:");
        System.out.println(basicComputer);
    }
}
