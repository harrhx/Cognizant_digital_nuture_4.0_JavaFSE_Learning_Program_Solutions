public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadserver();
    }

    private void loadserver() {
        System.out.println("Loading " + filename + "...");
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        System.out.println("\n--- Display Image ---" + filename);
    }
}