package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class SampleController implements Initializable {

	@FXML
	private Button btn1;

	@FXML
	private Button btn2;

	@FXML
	private Button btn3;

	@FXML
	private AnchorPane anc;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
System.out.println("I M CALLINg");
		btn1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub

				LoadPage("page1.fxml");
				
			}
		});
		btn2.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub

				LoadPage("page2.fxml");
				
			}
		});
		btn3.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub

				LoadPage("page3.fxml");
				
			}
		});

	}
	
	void LoadPage(String pagename)
	{
		Pane cmdPane=null;
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(pagename));
		try {
			cmdPane = (Pane) fxmlLoader.load();
	
			anc.getChildren().clear();
			anc.getChildren().add(cmdPane);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
