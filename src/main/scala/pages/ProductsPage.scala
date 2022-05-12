package pages

import org.openqa.selenium.{By, WebDriver}
import org.scalatestplus.selenium.*


class ProductsPage(implicit val webDriver: WebDriver) extends BasePage {
  val url = "https://www.saucedemo.com/inventory.html"

  def getNumberOfItems(): Int = {
    val items = findAll(cssSelector(".inventory_item_name"))
    items.size
  }

  def addToCart(): Unit = {
    click on ("add-to-cart-sauce-labs-backpack")
  }

  def isRemoveBtnExist(): Boolean = {
    val removeBtn = find(id("remove-sauce-labs-backpack"))
    !removeBtn.isEmpty
  }
}
