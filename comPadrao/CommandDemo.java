package comPadrao;

public class CommandDemo {
    public static void main(String[] args) {
        // Cria o objeto receiver
        Light light = new Light();

        // Cria os comandos
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        // Configura o controle remoto
        RemoteControl remote = new RemoteControl();

        // Liga a luz
        remote.setCommand(lightOn);
        remote.pressButton();  // Output: The light is on

        // Desliga a luz
        remote.setCommand(lightOff);
        remote.pressButton();  // Output: The light is off
    }
}
