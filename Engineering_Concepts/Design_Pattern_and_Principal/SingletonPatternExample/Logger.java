public class Logger{
    private static Logger singleinstanace = null;

    private Logger(){
        System.out.println("Logger instance created");
    }


    public static Logger getInstance(){
        if(singleinstanace == null){
            singleinstanace = new Logger();
        }
        return singleinstanace;
    }

    public void log(String message){
        System.out.println(message);
    }
}