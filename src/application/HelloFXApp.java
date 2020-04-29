package application;

/**
 * 
 * @author >>RanaSiroosian<<
 */
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class HelloFXApp extends Application {
	

	@Override
    public void start(Stage primaryStage) throws Exception {
//       Parent root = FXMLLoader.load(getClass().getResource("application.fxml"));
		GridPane root = new GridPane();
		root.setAlignment(Pos.CENTER);
		root.setVgap(10);
		root.setHgap(10);
		Label greeting = new Label("Welcome to JavaFX!");
		greeting.setTextFill(Color.GREEN);
		greeting.setFont(Font.font("Times New Roman",FontWeight.BOLD,70));
		root.getChildren().add(greeting);
    	primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 700,275));
        primaryStage.show();
    }
	
	public static void main(String[] args) {
		// Launch the JavaFX application
		Application.launch(args);
	}

}
