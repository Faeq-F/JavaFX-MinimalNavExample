package Page1;

import Page2.Page2;
import Page2.Page2Controller;
import Driver.Driver;

public class Page1Controller {
  
  private Page1 page;

  public Page1Controller(Page1 page) {
    this.page = page;
  }
  
  public void handleGoToPage2Button(){
    Page2 page2 = new Page2();
    new Page2Controller(page2);
    Driver.setScene(page2.start());
  }

}
