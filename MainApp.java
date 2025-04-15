import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;


public class MainApp extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		primaryStage.settitle("Multi-Scene JavaFX Application");
		
		// login Scene with Interaction
		VBox loginLayout = new VBox();
		TextField usernameField = new TextField();
		TextField passwordField = new TextField();
		Label loginMessage = new Label();
		Button loginButton = new Button("Login");
		
		loginLayout.getChildren()addAll(usernameField, passwordField, loginButton, loginLayout);
		Scene loginScene = new Scene(loginLayout, 800, 600);
		
				
		// Dashboard Scene
		VBox dashBoardLayout = new VBox();
		Button settingsButton new Button("Go to Settings");
		dashBoardLayout.getChildren().add(settingsButton);
		Scene dashboardScene = new Scene(dashBoardLayout, 800, 600);
		
		// Login Button Action with Validation
		loginButton.setOnAction(e -> {
			String username = usernameField.getText();
			String password = passwordFiels.getText();
			if(username.equals("admin") && password.equals("password")) {
				primaryStage.setScene(dashboardScene);
			} else {
				loginMessage.setText("invalid login. Please try again");
			}
		});
	
		primaryStage.setScene(loginScene);
		primaryStage.show();
		
	}
	
	private void addAll(String string) {
		// TODO Auto-generated method stub
		
	}

	private void addAll(TextField usernameField, TextField passwordField, Button loginButton, VBox loginLayout) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		launch(args);
	}

	private static void launch(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	}
