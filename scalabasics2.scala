//Apply methods

class Foo {}

object FooMaker {
  def apply() =  new Foo
  }

class Bar {
  def apply() = 123 
  }

val bar = new Bar

//Objects

object Timer {
  var count = 0

  def currentCount(): Long = {
    count += 1
    count
  }
}

