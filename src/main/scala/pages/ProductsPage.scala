package pages

import org.openqa.selenium.{By, WebDriver}
import org.scalatestplus.selenium.*


class ProductsPage(implicit val webDriver: WebDriver) extends BasePage {
  val url = "https://www.saucedemo.com/inventory.html"

  def getNumberOfItems(): Int = {
    logger.info("Getting number of items on a Product page")
    val items = findAll(cssSelector(".inventory_item_name"))
    items.size
  }

  def addToCart(): Unit = {
    logger.info("Add to cart first item")
    click on ("add-to-cart-sauce-labs-backpack")
  }

  def isRemoveBtnExist(): Boolean = {
    logger.info("Checking is Remove button exist on a first item")
    val removeBtn = find(id("remove-sauce-labs-backpack"))
    !removeBtn.isEmpty
  }
}
