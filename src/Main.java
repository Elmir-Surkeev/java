
import java.util.Scanner;

class Channel {
    private int number;
    private String name;

    public Channel(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}

class Television {
    private int currentChannel;
    private int maxChannels;
    private Channel[] channels;

    public Television(int maxChannels) {
        this.currentChannel = 1;
        this.maxChannels = maxChannels;
        channels = new Channel[maxChannels];
        for (int i = 0; i < maxChannels; i++) {
            channels[i] = new Channel(i + 1, "Канал " + (i + 1));
        }
    }

    public Television(int startChannel, int maxChannels) {
        this.currentChannel = startChannel;
        this.maxChannels = maxChannels;
        channels = new Channel[maxChannels];
        for (int i = 0; i < maxChannels; i++) {
            channels[i] = new Channel(i + 1, "Канал " + (i + 1));
        }
    }

    public void nextChannel() {
        currentChannel = (currentChannel % maxChannels) + 1;
    }

    public void previousChannel() {
        currentChannel = (currentChannel - 1 + maxChannels - 1) % maxChannels + 1;
    }

    public void setChannel(int channelNumber) {
        if (channelNumber >= 1 && channelNumber <= maxChannels) {
            currentChannel = channelNumber;
        } else {
            System.out.println("Неверный номер канала. Пожалуйста, введите номер от 1 до " + maxChannels);
        }
    }

    public void displayCurrentChannel() {
        System.out.println("Текущий канал: " + channels[currentChannel - 1].getName());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество каналов:");
        int numChannels = scanner.nextInt();
        Television tv = new Television(numChannels);

        boolean running = true;
        while (running) {
            tv.displayCurrentChannel();
            System.out.println("Нажмите 1 для следующего канала, 2 для предыдущего канала, 3 для выбора конкретного канала, 4 для выхода:");
            String input = scanner.next();
            switch (input) {
                case "1":
                    tv.nextChannel();
                    break;
                case "2":
                    tv.previousChannel();
                    break;
                case "3":
                    System.out.println("Введите номер канала:");
                    int channelNumber = scanner.nextInt();
                    tv.setChannel(channelNumber);
                    break;
                case "4":
                    running = false;
                    break;
                default:
                    System.out.println("Неверный ввод. Пожалуйста, попробуйте снова.");
            }
        }
        scanner.close();
    }
}

