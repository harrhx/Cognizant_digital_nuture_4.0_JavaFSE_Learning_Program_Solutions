public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            System.out.println("Proxy: Initializing RealImage for " + fileName);
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }

}