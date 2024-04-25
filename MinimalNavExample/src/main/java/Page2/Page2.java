package Page2;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class Page2 {
  

  @FXML
  private Button GoToPage2Button;
  
  public Scene start() {
    Parent root;
    try {
      root = FXMLLoader.load(getClass().getResource("Page2.fxml"));
      Scene scene = new Scene(root, 600, 400);
      return scene;
    } catch (IOException e) {
      e.printStackTrace();
      return null;
    }
  }
  
  @FXML
  public void initialize() {
    Page2Controller page2Controller = new Page2Controller(this);
    GoToPage2Button.setOnAction(event -> page2Controller.handleGoToPage1Button());
  }

}
