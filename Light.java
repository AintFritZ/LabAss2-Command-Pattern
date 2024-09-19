public class Light implements Device {
    private int brightness;

    public void turnOn() {
        this.brightness = 100; // Max brightness
        System.out.println("Light turned on");
    }

    public void turnOff() {
        this.brightness = 0;
        System.out.println("Light turned off");
    }

    public void execute(String command) {
        switch (command) {
            case "Increase Brightness":
                setBrightness(brightness + 10);
                break;
            case "Decrease Brightness":
                setBrightness(brightness - 10);
                break;
            default:
                System.out.println("Command not recognized");
        }
    }

    private void setBrightness(int brightness) {
        this.brightness = Math.min(Math.max(brightness, 0), 100);
        System.out.println("Brightness set to " + this.brightness);
    }
}

