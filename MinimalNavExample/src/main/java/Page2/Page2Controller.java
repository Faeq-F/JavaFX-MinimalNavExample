package Page2;

import Driver.Driver;
import Page1.Page1;
import Page1.Page1Controller;

public class Page2Controller {
  
  private Page2 page;

  public Page2Controller(Page2 page) {
    this.page = page;
  }
  
  public void handleGoToPage1Button(){
    Page1 page1 = new Page1();
    new Page1Controller(page1);
    Driver.setScene(page1.start());
  }

}
