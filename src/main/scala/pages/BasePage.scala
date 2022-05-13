package pages

import com.typesafe.scalalogging.LazyLogging
import org.scalatestplus.selenium.{Page, WebBrowser}

abstract class BasePage extends Page with WebBrowser with LazyLogging
