
import java.applet.AudioClip;

public class Hilo3 extends Thread {

    @Override
    public void run() {
        AudioClip Sound;
        Sound = java.applet.Applet.newAudioClip(getClass().getResource("Audio/sonido.wav"));
        Sound.play();
    }
}
