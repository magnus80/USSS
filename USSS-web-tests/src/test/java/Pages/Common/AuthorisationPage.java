package Pages.Common;

import Pages.PageBase;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by KIryshkov on 16.05.2016.
 */
public class AuthorisationPage extends PageBase{
  @FindBy(how = How.XPATH,
          xpath = "//input[@id=\'loginFormB2C:loginForm:login\']"
  )
  private SelenideElement inputLoginElement;

  @FindBy(how = How.XPATH,
          xpath = "//input[@id=\'loginFormB2C:loginForm:passwordPwd\']"
  )

  private SelenideElement inputPasswordElement;

  @FindBy(how = How.XPATH,
          xpath = "//button[@id=\'loginFormB2C:loginForm:j_idt219\']"
  )
    private SelenideElement enterButtonElement;

  public void login(String login, String password) {
    this.inputLoginElement.sendKeys(new CharSequence[]{login});
    this.inputPasswordElement.sendKeys(new CharSequence[]{password});
    this.enterButtonElement.click();
  }
}
