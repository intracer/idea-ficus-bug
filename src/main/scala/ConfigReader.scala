import com.typesafe.config.ConfigFactory

import net.ceedubs.ficus.Ficus._
import net.ceedubs.ficus.readers.ArbitraryTypeReader._

case class Message(subject: String, body: String)

object ConfigReader {

  def main(args: Array[String]) {
    val conf = ConfigFactory.load("bug.conf").getConfig("bug")

    val email = conf.as[Message]("email")

    println(s"${email.subject} // ${email.body}")

  }

}
