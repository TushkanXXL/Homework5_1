
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import java.io.File;


public class Main extends Application {

    private MediaPlayer mediaPlayer;

    @Override
    public void start(Stage primaryStage) throws Exception {
        File file = new File("song.mp3");
        Media media = new Media(file.toURI().toString());
        mediaPlayer = new MediaPlayer(media);

        Button playButton = new Button("Play");
        playButton.setOnAction(event -> mediaPlayer.play());

        Button pauseButton = new Button("Pause");
        pauseButton.setOnAction(event -> mediaPlayer.pause());

        HBox hbox = new HBox(playButton, pauseButton);
        Scene scene = new Scene(hbox, 200, 100);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        mediaPlayer.stop();
    }

    public static void main(String[] args) {
        launch(args);
    }
}