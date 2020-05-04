package sample;
/**
 * 
 * @author >>RanaSiroosian<<
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
    @FXML private Text actiontarget;
    @FXML private TextField textField;
    @FXML private PasswordField passwordField;
    
    
    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        actiontarget.setText("Sign in button pressed");
    }
    
    @FXML protected void handleClearButtonAction(ActionEvent event) {
    	textField.clear();
    	passwordField.clear();
    	actiontarget.setText("Please fill the required fields again!");
    }
}