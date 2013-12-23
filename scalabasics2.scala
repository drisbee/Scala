//Apply methods

class Foo {}

object FooMaker {
  def apply() =  new Foo
  }
/*
class Bar {
  def apply() = 123 
  }

val bar = new Bar
*/
//Objects

object Timer {
  var count = 0

  def currentCount(): Long = {
    count += 1
    count
  }
}

class Bar(foo: String)

object Bar {
  def apply(foo: String) = new Bar(foo)
  }

//Functions are Objects

object addOne extends Function1[Int, Int] {
  def apply(m: Int): Int = m + 1
  }

class AddOne extends Function1[Int, Int] {
  def apply(m: Int): Int = m + 1
  }

class AddOneShortHand extends (Int => Int) {
  def apply(m: Int): Int = m + 1
  }

//Packages "1 package heb ik aangemaakt in bestand scalabasics2_packages.scala"

object colorHolder {
  val Blue = "Blue"
  val Red = "Red"
  }

//Pattern Matching

/*val times = 123 

times match {
  case 1 => "one"
  case 2 => "two"
  case _ => "some other number"
  }
*/
val times = 2

times match {
  case i if i == 1 => "one"
  case i if i == 2 => "two"
  case _ => "some other number"
  }

//Matching on type
/*Je kan per verschillende types verschillende 
  acties laten uitvoeren*/

def bigger(o: Any): Any = {
  o match {
    case i: Int if i < 0 => i - 1
    case i: Int => i + 1
    case d: Double if d < 0.0 => d - 0.1
    case d: Double => d + 0.1
    case text: String => text + "s"
  }
}

//Matching on Classes
/*Aan de hand van welke type van een class
  kan je verschillende acties laten uitvoeren.*/

def calcType(calc: Calculator) calc match {
  case _ 
          

