import SimpleAudioPlayer.SimpleAudioPlayer;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        try {
            String filePath = "C:\\Users\\rdyms\\Downloads\\INSTASAMKA_-_ZA_DENGI_DA_75227740.wav";
            SimpleAudioPlayer.filePath = filePath;
            SimpleAudioPlayer audioPlayer = new SimpleAudioPlayer();
            audioPlayer.play();
            Scanner sc = new Scanner(System.in);

            while(true) {
                System.out.println("1. pause");
                System.out.println("2. resume");
                System.out.println("3. restart");
                System.out.println("4. stop");
                System.out.println("5. Jump to specific time");
                int c = sc.nextInt();
                audioPlayer.gotoChoice(c);
                if (c == 4)
                    break;

            }
            sc.close();
        } catch (Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }


}