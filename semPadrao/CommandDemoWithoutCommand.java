public class CommandDemoWithoutCommand {
    public static void main(String[] args) {
        // Cria o objeto receiver
        Light light = new Light();

        // Cria o controle remoto
        RemoteControlWithoutCommand remote = new RemoteControlWithoutCommand(light);

        // Liga a luz
        remote.pressOnButton();  // Output: The light is on

        // Desliga a luz
        remote.pressOffButton();  // Output: The light is off
    }
}
