public class Computer {

    private final String cpu;
    private final String ram;
    private final String storage;



    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + cpu + ", RAM=" + ram + ", Storage=" + storage;
    }


    public static class Builder {


        private final String cpu;
        private final String ram;
        private final String storage;

        public Builder(String cpu, String ram, String storage) {
            this.cpu = cpu;
            this.ram = ram;
            this.storage = storage;
        }
        public Computer build() {
            return new Computer(this);
        }
    }
}