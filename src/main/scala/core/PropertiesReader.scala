package core

import com.typesafe.scalalogging.LazyLogging

import java.io.FileNotFoundException
import java.util.Properties
import scala.io.Source
import scala.language.postfixOps

class PropertiesReader extends LazyLogging {
  val properties: Properties = new Properties()
  try {
    val source = Source.fromResource("taf.properties")
    properties.load(source.reader())
  } catch {
    case e: FileNotFoundException => logger.error(s"Couldn't find that file! Error: ${e.getMessage}")
    case _: Throwable => logger.error("Something goes wrong!!!")
  }
}
