import java.util.Scanner;

public class Remote {
    private Television myTV;

    public Remote(Television tv) {
        myTV = tv;
    }

    public void processInput(Scanner input) {
        int command;
        while (true) {
            System.out.print(
                "Enter Remote Command (0 = Power On, 1 = Channel Up, 2 = Channel Down, 3 = Volume Up, 4 = Volume Down, 5 = Power Off): ");
            if (input.hasNextInt()) {
                command = input.nextInt();
                if (command >= 0 && command <= 5) {
                    if (command == 0) {
                        myTV.powerOn();
                    } else if (command == 1) {
                        myTV.channelUp();
                    } else if (command == 2) {
                        myTV.channelDown();
                    } else if (command == 3) {
                        myTV.volumeUp();
                    } else if (command == 4) {
                        myTV.volumeDown();
                    } else if (command == 5) {
                        myTV.powerOff();
                        break; // Exit the loop on power off command
                    }
                } else {
                    System.out.println("Invalid command. Please enter a number between 0 and 5.");
                }
            } else {
                System.out.println("Invalid command. Please enter a valid number.");
                input.next();
            }
        }
    }
}
