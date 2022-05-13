package pages.checkout

import fixtures.User
import org.openqa.selenium.WebDriver
import pages.BasePage

class CheckoutStepOnePage(implicit val webDriver: WebDriver) extends BasePage {
  val url = "https://www.saucedemo.com/checkout-step-one.html"

  def fillCustomerInfo(user: User): Unit = {
    logger.info(s"Fill customer info for User: ${user}")
    textField("first-name").value = user.firstName
    textField("last-name").value = user.lastName
    textField("postal-code").value = user.zip
  }

  def continue(): Unit = {
    logger.info("Proceed with checkout")
    click on ("continue")
  }
}
