package scala.com.github.sh0hei.caliban

import ExampleData._
import caliban.GraphQL._
import caliban.schema.Annotations.{ GQLDeprecated, GQLDescription }
import caliban.schema.GenericSchema
import org.http4s.implicits._
import org.http4s.server.Router
import org.http4s.server.blaze.BlazeServerBuilder
import org.http4s.server.middleware.CORS
import zio.clock.Clock
import zio.console.{ putStrLn, Console }
import zio.interop.catz._
import zio.stream.ZStream
import zio.{ RIO, URIO, ZEnv, ZIO }

object ExampleApp extends CatsApp with GenericSchema[Console with Clock] {

  case class Queries()
  case class Mutations()
  case class Subscriptions()

  type ExampleTask[A] = RIO[Console with A]

  override def run(args: List[String]): ZIO[zio.ZEnv, Nothing, Int] = ???
}
