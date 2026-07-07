// ^ MUSIC PLAYER PROGRAM

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Music_Player {
    public static void main(String[] args) {
        
        // how to Play Audio with java(.wav, .au, .aiff)

        String filePath  = "music\\lofi-music.wav";
        File file = new File(filePath);

        try (Scanner sc = new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){


            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);


            String response = "";
            while (!response.equals("q")) {
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");

                System.out.print("Enter Your Choice: ");

                response = sc.next().toLowerCase();

                switch (response) {
                    case "p" -> clip.start();
                    case "s" -> clip.stop();
                    case "r" -> clip.setMicrosecondPosition(0);
                    case "q" -> clip.close();
                    
                    default -> System.out.println("Invalid Choice!");
                 
                }
            }           

        } 
        catch (FileNotFoundException e){
            System.out.println("Could Not Locate File");
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Audio file is not supported");
        }
        catch(LineUnavailableException e){
            System.out.println("Unable to access audio resource");
        }
        catch (Exception e) {
            System.out.println("Something Went Wrong!");
        }
        finally{
            System.out.println("Bye!");
        }
    }
}
