/*
 * This Groovy source file was generated by the Gradle 'init' task.
 */
package cmx.examples;

import jp.crestmuse.cmx.processing.CMXController;
import jp.crestmuse.cmx.sound.SMFPlayer;

import java.io.IOException;
import java.io.File;
import java.net.URI;

class App {
    public String getGreeting() {
        return "Hello CMX!";
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.getGreeting());
        app.playMusic();
    }

    public void playMusic() {
        CMXController cmx = CMXController.getInstance();
        URI uri = null;
        String path = null;

        try {
            uri = (getClass().getResource("/KIRAKIRA.mid")).toURI();            
            System.out.println(uri);
        } catch (Exception e) {
            e.printStackTrace();
        }
        path = (new File(uri)).getPath();
        System.out.println(path);

        cmx.smfread(path);
        cmx.playMusic();
    }

}
