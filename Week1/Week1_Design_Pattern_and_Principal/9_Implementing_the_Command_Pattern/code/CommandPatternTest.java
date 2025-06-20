public class CommandPatternTest {
    public static void main(String args[]){
        Light livingRoom = new Light("livingroom");
        Command turnon = new LightOnCommand(livingRoom);
        Command turnoff = new LightOffCommand(livingRoom);
        RemoteControl remote = new RemoteControl();
        remote.setRemoteCommand(turnon);
        remote.pressbutton();
        remote.setRemoteCommand(turnoff);
        remote.pressbutton();
    }
}