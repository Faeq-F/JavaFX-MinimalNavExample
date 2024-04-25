package Driver;
import Page1.Page1;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Driver extends Application {
  
  private static Stage stage;

  @Override
  public void start(Stage stage) throws Exception {
    this.stage = stage;
    // create default view
    Page1 page1 = new Page1();
    //ready to show
    Driver.setScene(page1.start());
    stage.show();
  }
 
  public static void setScene(Scene scene) {
    stage.setScene(scene);
  }

  public static void main(String[] args) {
    Application.launch(args);
  }
}
