package pages.checkout

import org.openqa.selenium.WebDriver
import org.w3c.dom.Element
import pages.BasePage

class CheckOutCompletePage(implicit val webDriver: WebDriver) extends BasePage {
  val url = "https://www.saucedemo.com/checkout-complete.html"

  def getConfirmationMsg(): String = {
    logger.info("Getting confirmation message for payment")
    find(cssSelector(".title")).get.text
  }

}
