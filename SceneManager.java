// SceneManager.java

package javafx.SceneManager;

import javafx.scene.Scene;
import javafx.stage.GameScene;
import javafx.stage.MainMenuScene;
import javafx.stage.SettingsScene;
import javafx.stage.Stage;
import java.util.HashMap;
import java.util.Map;

public class SceneManager {
    private Stage primaryStage;
    private Map<String, Scene> scenes = new HashMap<>();

    public SceneManager(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void addScene(String name, Scene mainMenuScene) {
        scenes.put(name, mainMenuScene);
    }

    public void switchScene(String name) {
        Scene scene = scenes.get(name);
        if (scene != null) {
            primaryStage.setScene(scene);
            primaryStage.show();
        }
    }

	public void addScene(String name, MainMenuScene mainMenuScene) {
		// TODO Auto-generated method stub
		
	}

	public void addScene(String name, SettingsScene settingsScene) {
		// TODO Auto-generated method stub
		
	}

	public void addScene(String name, GameScene gameScene) {
		// TODO Auto-generated method stub
		
	}
}
