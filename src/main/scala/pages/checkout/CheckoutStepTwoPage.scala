package pages.checkout

import org.openqa.selenium.WebDriver
import pages.BasePage

class CheckoutStepTwoPage(implicit val webDriver: WebDriver) extends BasePage {
  val url = "https://www.saucedemo.com/checkout-step-two.html"

  def finish(): Unit = {
    logger.info("Finish checkout")
    click on ("finish")
  }

}
