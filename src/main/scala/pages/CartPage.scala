package pages

import org.openqa.selenium.WebDriver

class CartPage(implicit val webDriver: WebDriver) extends BasePage {
  val url = "https://www.saucedemo.com/cart.html"

  def checkout(): Unit = {
    click on ("checkout")
  }

}
