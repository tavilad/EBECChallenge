/**
 * Date 18.06.2017
 * @author Seby
 * @version 1.0
 */

package client;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

// TODO: Auto-generated Javadoc
/**
 * The Class LoginWindow.
 */
public class LoginWindow extends Application {

	/* (non-Javadoc)
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage primaryStage) {
		Pane root;
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../windows/LoginWindow.fxml"));
			root = (Pane) loader.load();
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/* (non-Javadoc)
	 * @see javafx.application.Application#stop()
	 */
	@Override
	public void stop() {
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
			launch(args);
	}
}