package elements

import org.openqa.selenium.WebDriver
import org.scalatestplus.selenium.*

class HeaderElement(implicit val webDriver: WebDriver) extends Page with WebBrowser {
  val url = "Not exist"

  def openCart(): Unit = {
    click on ("shopping_cart_container")
  }
}
