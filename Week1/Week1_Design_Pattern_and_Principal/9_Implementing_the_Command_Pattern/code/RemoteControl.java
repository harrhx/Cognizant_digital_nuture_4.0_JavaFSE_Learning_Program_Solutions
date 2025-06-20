public class RemoteControl {
    private Command command;

    public void setRemoteCommand(Command command){
        this.command = command;
    }

    public void pressbutton(){
        if(command == null){
            System.out.println("Command is null");
            return;
        }
        command.execute();
    }
}