public class Main {
    public static void main(String[] args) {
        SmartHomeHub hub = new SmartHomeHub();

        Device light = new Light();
        Device musicPlayer = new MusicPlayer();
        Device thermostat = new Thermostat();

        hub.setCommand("Light", new TurnOnCommand(light));
        hub.setCommand("MusicPlayer", new TurnOnCommand(musicPlayer));
        hub.setCommand("Thermostat", new TurnOnCommand(thermostat));

        hub.pressButton("Light");
        hub.pressButton("MusicPlayer");
        hub.pressButton("Thermostat");

        Command setTempCommand = new SetTemperatureCommand((Thermostat) thermostat, 75);
        setTempCommand.execute();
    }
}
