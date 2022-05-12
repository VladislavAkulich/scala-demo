import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.scalatest.{BeforeAndAfter}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should
import org.scalatestplus.selenium.WebBrowser

abstract class BaseSpec extends AnyFlatSpec with should.Matchers with WebBrowser with BeforeAndAfter {
  implicit val webDriver: WebDriver = new ChromeDriver()

  after {
    quit()
  }
}
