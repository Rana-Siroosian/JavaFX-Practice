package sample;
import java.time.LocalDate;

import javafx.application.Platform;
/**
 * 
 * @author >>RanaSiroosian<<
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
    @FXML private Text actiontarget;
    @FXML private TextField textField;
    @FXML private PasswordField passwordField;
    @FXML private DatePicker datePicker;
    @FXML private Button signupB;
    
    @FXML
    public void initialize() {
    	signupB.setDisable(true);
    }

    
    @FXML 
    public void onButtonClicked(ActionEvent e) {
    	if(e.getSource().equals(signupB)) {
    		actiontarget.setText("Sign in button pressed");
    	}else {
    		textField.clear();
        	passwordField.clear();
        	datePicker.setValue(LocalDate.now());
        	signupB.setDisable(true);
    	}
    	Runnable task = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					String s = Platform.isFxApplicationThread() ? "UI Thread" :"Background Thread";
					System.out.println("I'm going to sleep on the " + s);
		    		Thread.sleep(10000);
		    		Platform.runLater(new Runnable() {
		    			@Override
		    			public void run() {
		    				actiontarget.setText("Please fill the required fields again!");
		    			}
		    		});
		    	}catch(InterruptedException e) {
		    		//I just made this to see how the thread works,so when the clear button pressed it will take
		    		//10 seconds to clear the username and password fields and show a msg
		    	}
			}
    		
    	};
    	new Thread(task).start();
    }
    
    
    @FXML
    public void handleEmptyFields() {
    	String text = textField.getText();
    	//trim doesn't let the button be active if the user enter only white space 
    	boolean disableSignup = text.isEmpty() || text.trim().isEmpty();
    	signupB.setDisable(disableSignup);
    }

    
}