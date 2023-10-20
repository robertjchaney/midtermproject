public class Television {
    final public static int MAX_CHANNEL = 2;
    final public static int MAX_VOLUME = 6;
    private int currentChannel;
    private int currentVolume;
    private boolean on;

    public Television() {
        currentChannel = 0;
        currentVolume = MAX_VOLUME / 2;
        on = false;
    }

    // Acessor Methods
    public int getChannel() {
        return currentChannel;
    }

    public int getVolume() {
        return currentVolume;
    }

    public boolean getOn() {
        return on;
    }

    // Mutator Methods
    public void setChannel(int newChannel) {
        currentChannel = newChannel;
    }

    public void setVolume(int newVolume) {
        currentVolume = newVolume;
    }

    public void setOn(boolean power) {
        on = power;
    }

    // Power Functions
    public void powerOn() {
        if (on == false) {
            setOn(true);
            System.out.println("TV: Powering On");
        }
    }

    public void powerOff() {
        if (on == true) {
            setOn(false);
            System.out.println("TV: Powering Off");
        }
    }

    // Channel and Power Functions
    public void channelUp() {
        if (on == true) {
            currentChannel++;
            if (currentChannel > MAX_CHANNEL) {
                setChannel(0);
            }
            String whatsOn = Schedule.getShow(currentChannel);
            System.out.println(
                "TV: Now Showing " + "\"" + whatsOn + "\"" + " on Channel " + getChannel());
        }
    }

    public void channelDown() {
        if (on == true) {
            currentChannel--;
            if (currentChannel < 0) {
                setChannel(MAX_CHANNEL);
            }
            String whatsOn = Schedule.getShow(currentChannel);
            System.out.println(
                "TV: Now Showing " + "\"" + whatsOn + "\"" + " on Channel " + getChannel());
        }
    }

    public void volumeUp() {
        if (on == true) {
            currentVolume++;
            if (currentVolume > MAX_VOLUME) {
                setVolume(MAX_VOLUME);
            }
            System.out.println("TV: Volume Up to " + getVolume());
        }
    }

    public void volumeDown() {
        if (on == true) {
            currentVolume--;
            if (currentVolume < 0) {
                setVolume(0);
            }
            System.out.println("TV: Volume Down to " + getVolume());
        }
    }
}
