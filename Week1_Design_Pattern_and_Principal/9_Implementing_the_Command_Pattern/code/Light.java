public class Light {
    private String Location;

    public Light(String Location) {
        this.Location = Location;
    }

    void turnOn(){
        System.out.println("Light is on");
    }

    void turnOff(){
        System.out.println("Light is off");
    }
}