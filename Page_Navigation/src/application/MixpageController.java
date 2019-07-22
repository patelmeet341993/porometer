package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class MixpageController implements Initializable {

	   @FXML
	    private AnchorPane page1;

	    @FXML
	    private AnchorPane page2;

	    @FXML
	    private AnchorPane page3;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		LoadPage(page1, "page1.fxml");
		LoadPage(page2, "page2.fxml");
		LoadPage(page3, "page3.fxml");
		
		
	}

	
	void LoadPage(AnchorPane anc,String pagename)
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
