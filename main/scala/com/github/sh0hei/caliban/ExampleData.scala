package scala.com.github.sh0hei.caliban

import scala.com.github.sh0hei.caliban.ExampleData.Origin.{ Belt, Earth, Mars }
import scala.com.github.sh0hei.caliban.ExampleData.Role.{ Captain, Engineer, Mechanic, Pilot }

object ExampleData {

  sealed trait Origin
  object Origin {
    case object Earth extends Origin
    case object Mars extends Origin
    case object Belt extends Origin
  }

  sealed trait Role
  object Role {
    case class Captain(shipName: String) extends Role
    case class Pilot(shipName: String) extends Role
    case class Engineer(shipName: String) extends Role
    case class Mechanic(shipName: String) extends Role
  }

  case class Character(name: String, nicknames: List[String], origin: Origin, role: Option[Role])
  case class CharactersArgs(origin: Option[Origin])
  case class CharacterArgs(name: String)

  val sampleCharacters = List(
    Character("James Holden", List("Jim", "Hoss"), Earth, Some(Captain("Rocinante"))),
    Character("Naomi Nagata", Nil, Belt, Some(Engineer("Rocinante"))),
    Character("Amos Burton", Nil, Earth, Some(Mechanic("Rocinante"))),
    Character("Alex Kamal", Nil, Mars, Some(Pilot("Rocinante"))),
    Character("Chrisjen Avasarala", Nil, Earth, None),
    Character("Josephus Miller", List("Joe"), Belt, None),
    Character("Roberta Draper", List("Bobbie", "Gunny"), Mars, None)
  )
}
