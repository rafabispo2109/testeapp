package javafx.stage;

 // GameApplication.java
import javafx.application.Application;
import javafx.SceneManager.*;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class GameApplication extends Application {

    private SceneManager sceneManager;

    @Override
    public void start(Stage primaryStage) {
        sceneManager = new SceneManager(primaryStage);

        MainMenuScene mainMenuScene = new MainMenuScene(new MainMenuController(sceneManager));
        SettingsScene settingsScene = new SettingsScene(new SettingsController(sceneManager));
        GameScene gameScene = new GameScene(new GameController(sceneManager));


        sceneManager.addScene("mainMenu", mainMenuScene);
        sceneManager.addScene("settings", settingsScene);
        sceneManager.addScene("game", gameScene);

        sceneManager.switchScene("mainMenu"); 
    }

    public static void main(String[] args) {
        launch(args);
    }

	private static void launch(String[] args) {
		// TODO Auto-generated method stub
		
	}
}
