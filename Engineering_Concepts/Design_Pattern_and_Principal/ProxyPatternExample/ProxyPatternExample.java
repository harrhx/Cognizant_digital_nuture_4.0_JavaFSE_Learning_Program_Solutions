public class ProxyPatternExample {

    public static void main(String[] args) {
        Image image1 = new ProxyImage("Image1.jpg");
        Image image2 = new ProxyImage("Image2.jpg");

        image1.display();
        image2.display();
    }
}