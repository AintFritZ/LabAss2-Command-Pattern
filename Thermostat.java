public class Thermostat implements Device {
    private int temperature;

    public void turnOn() {
        setTemperature(72); // Default temperature
    }

    public void turnOff() {
        System.out.println("Thermostat turned off");
    }

    public void execute(String command) {
        if (command.startsWith("Set Temperature")) {
            int temp = Integer.parseInt(command.split(" ")[2]);
            setTemperature(temp);
        }
    }

    private void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Temperature set to " + this.temperature + "°F");
    }
}
