package elements

import com.typesafe.scalalogging.LazyLogging
import org.openqa.selenium.WebDriver
import org.scalatestplus.selenium.*

class HeaderElement(implicit val webDriver: WebDriver) extends Page with WebBrowser with LazyLogging {
  val url = "Not exist"

  def openCart(): Unit = {
    logger.info("Open a Cart")
    click on ("shopping_cart_container")
  }
}
