import fixtures.Users
import org.openqa.selenium.WebDriver
import pages.*

class ProductsSpec extends BaseSpec with Users {
  val productsPage: ProductsPage = new ProductsPage()

  before {
    val loginPage: LoginPage = new LoginPage()
    go to (loginPage)
    loginPage.login(StandardUser)
  }

  "Products page" should "have 6 items" in {
    productsPage.getNumberOfItems() should be (6)
  }
}
