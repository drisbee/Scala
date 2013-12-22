// Zie website http://twitter.github.io/scala_school/basics.html

//Expressions

1+1

//Values
val two = 1 + 1 //mag niet veranderd worden dus two = 3 mag niet.

//Variables
var name = "steve"
var name = "Andres"

//Functions
def addOne(m: Int): Int = m + 1
val three = addOne(2)

def three() = 1 + 2
three()
three

//Anonymous Functions
(x: Int) => x + 1

val addOne = (x: Int) => x + 1
val addOneTest = addOne(1)
println(addOneTest)

def timesTwo(i: Int): Int = {
  println("Hello world")
  i * 2
}

{i: Int => 
  println("Hello world")
  i * 2
}

//Partial application
def adder(m: Int, n: Int) = m + n

val add2 = adder(2, _:Int)
add2(3)

//Curried Functions

def multiply(m: Int) (n: Int): Int = m * n

multiply(2) (3)
val timesTwo = multiply(2) _
timesTwo(3)

(adder _).curried

//Variable length arguments
def capitalizeAll(args: String*) = {
  args.map { arg =>
    arg.capitalize
  }
}

//Classes

class Calculator(brand: String) {
  /**
   * A constructor
   */
  val color: String = if (brand == "TI") {
    "blue"
    } else if (brand == "HP") {
    "black"
  } else {
    "white"
  }
  
  def add(m: Double, n: Double): Double = m + n
  def min(m: Double, n: Double): Double = m - n
  def mul(m: Double, n: Double): Double = m * n
  def div(m: Double, n: Double): Double = m / n
}

val calc = new Calculator("HP")

// Aside Functions vs Methods
class C {
  var acc = 0
  def minc = { acc += 1 }
  val finc = { () => acc += 1}
  }

val c = new C
