package pages

import com.typesafe.scalalogging.LazyLogging
import core.PropertiesReader
import org.scalatestplus.selenium.{Page, WebBrowser}

abstract class BasePage extends Page with WebBrowser with LazyLogging {
  val properties = new PropertiesReader().properties
}
