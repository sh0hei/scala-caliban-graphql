package scala.com.github.sh0hei.caliban

import zio.stream.ZStream
import zio.{Queue, Ref, UIO}

class ExampleService(characters: Ref[List[Character]], subscribers: Ref[List[Queue[String]]]) {

  def getCharacters(origin: Option[Origin]): UIO[List[Character]] = ???

  def findCharacter(name: String): UIO[Option[Character]] = ???

  def deleteCharacter(name: String): UIO[Boolean] = ???

  def deleteEvents: ZStream[Any, Nothing, String] = ???

}

object ExampleService {
  def make(initial: List[Character]): UIO[ExampleService] = ???
}
