package pages.checkout

import org.openqa.selenium.WebDriver
import pages.BasePage

class CheckoutStepOnePage(implicit val webDriver: WebDriver) extends BasePage {
  val url = "https://www.saucedemo.com/checkout-step-one.html"

  def fillCustomerInfo(): Unit = {
    logger.info("Fill customer info")
    textField("first-name").value = "test user"
    textField("last-name").value = "test surname"
    textField("postal-code").value = "220000"
  }

  def continue(): Unit = {
    logger.info("Proceed with checkout")
    click on ("continue")
  }
}
