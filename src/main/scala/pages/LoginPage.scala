package pages

import fixtures.{User}
import org.openqa.selenium.WebDriver
import org.scalatestplus.selenium.*

class LoginPage(implicit val webDriver: WebDriver) extends BasePage {
  val url = "https://www.saucedemo.com/"

  def login(user: User): Unit = {
    logger.info(s"Login with User: ${user.username} and ${user.password}")
    textField("user-name").value = user.username
    pwdField("password").value = user.password
    click on "login-button"
  }
}
