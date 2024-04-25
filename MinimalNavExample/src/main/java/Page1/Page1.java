package Page1;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class Page1 {
  
  @FXML
  private Button GoToPage2Button;
  
  public Scene start() {
    Parent root;
    try {
      root = FXMLLoader.load(getClass().getResource("Page1.fxml"));
      Scene scene = new Scene(root, 600, 400);
      return scene;
    } catch (IOException e) {
      e.printStackTrace();
      return null;
    }
  }
  
  @FXML
  public void initialize() {
    Page1Controller page1Controller = new Page1Controller(this);
    GoToPage2Button.setOnAction(event -> page1Controller.handleGoToPage2Button());
  }

}
