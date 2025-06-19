public class Main{
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("this is the first log message");


        Logger logger2 = Logger.getInstance();
        logger2.log("this is the second log message");

        if(logger1 == logger2){
            System.out.println("Both are on the same instance");
        }else{
            System.out.println("Both are not on the same instance");
        }
    }
}