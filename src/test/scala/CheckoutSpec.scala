import elements.*
import fixtures.Users
import pages.*
import pages.checkout.*

class CheckoutSpec extends BaseSpec with Users {
  val productsPage: ProductsPage = new ProductsPage()
  val headerElement: HeaderElement = new HeaderElement()
  val cartPage: CartPage = new CartPage()
  val checkoutStepOnePage: CheckoutStepOnePage = new CheckoutStepOnePage()
  val checkoutStepTwoPage: CheckoutStepTwoPage = new CheckoutStepTwoPage()
  val checkoutCompletePage: CheckOutCompletePage = new CheckOutCompletePage()

  before {
    val loginPage: LoginPage = new LoginPage()
    go to (loginPage)
    loginPage.login(StandardUser)
  }

  "Customer" should "checkout product successfully" in {
    productsPage.addToCart()
    productsPage.isRemoveBtnExist() should be (true)
    headerElement.openCart()
    cartPage.checkout()
    checkoutStepOnePage.fillCustomerInfo()
    checkoutStepOnePage.continue()
    checkoutStepTwoPage.finish()
    checkoutCompletePage.getConfirmationMsg() should be ("CHECKOUT: COMPLETE!")
  }
}
