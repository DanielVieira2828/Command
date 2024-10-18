public class RemoteControlWithoutCommand {
    private Light light;

    public RemoteControlWithoutCommand(Light light) {
        this.light = light;
    }

    public void pressOnButton() {
        light.turnOn();
    }

    public void pressOffButton() {
        light.turnOff();
    }
}
