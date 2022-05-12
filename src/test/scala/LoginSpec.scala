import fixtures.{Users}
import org.scalatest.*
import org.scalatest.matchers.*
import org.scalatestplus.selenium.*
import pages.LoginPage

class LoginSpec extends BaseSpec {
  var loginPage: LoginPage = new LoginPage()

  "Login into demo app" should "be successful" in new Users {
    go to (loginPage)
    loginPage.login(StandardUser)
    pageTitle should be ("Swag Labs")
  }
}

