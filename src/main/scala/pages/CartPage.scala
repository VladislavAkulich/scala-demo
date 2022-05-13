package pages

import org.openqa.selenium.WebDriver

class CartPage(implicit val webDriver: WebDriver) extends BasePage {
  val url = properties.getProperty("cartUrl")

  def checkout(): Unit = {
    logger.info("Make a checkout")
    click on ("checkout")
  }

}
