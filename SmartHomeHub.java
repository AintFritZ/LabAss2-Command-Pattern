import java.util.HashMap;
import java.util.Map;

public class SmartHomeHub {
    private Map<String, Command> commands = new HashMap<>();

    public void setCommand(String deviceName, Command command) {
        commands.put(deviceName, command);
    }

    public void pressButton(String deviceName) {
        Command command = commands.get(deviceName);
        if (command != null) {
            command.execute();
        } else {
            System.out.println("No command set for " + deviceName);
        }
    }
}
