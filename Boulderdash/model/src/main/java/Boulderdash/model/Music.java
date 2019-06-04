package Boulderdash.model;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;
/**
 * @author GROUP 8
 *
 */
public class Music {
	private AudioFormat format;
    
    /**
     * @param sonFile
     */
    public static void Play(String sonFile) { //la m�thode importante qui sert � jouer le son � chaque fois qu'on l'appelle en y passant l'URL du fichier...
      SourceDataLine soundLine = null;
      int BUFFER_SIZE = 64 * 1024; // 64 KB


      try {
      File soundFile = new File(sonFile);
      AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
      AudioFormat audioFormat = audioInputStream.getFormat();
      DataLine.Info info = new DataLine.Info(SourceDataLine.class, audioFormat);
      soundLine = (SourceDataLine) AudioSystem.getLine(info);
      soundLine.open(audioFormat);
      soundLine.start();
      int nBytesRead = 0;
      byte[] sampledData = new byte[BUFFER_SIZE];
      while (nBytesRead != -1) {
      nBytesRead = audioInputStream.read(sampledData, 0,
      sampledData.length);
      if (nBytesRead >= 0) {
      soundLine.write(sampledData, 0, nBytesRead);
      }
      }
      } catch (UnsupportedAudioFileException ex) {
      ex.printStackTrace();
      } catch (IOException ex) {
      ex.printStackTrace();
      } catch (LineUnavailableException ex) {
      ex.printStackTrace();
      } finally {
      soundLine.drain();
      soundLine.close();
      }
         }

public AudioFormat getFormat() {
 return format;
}
public void setFormat(AudioFormat format) {
 this.format = format;

}

}
