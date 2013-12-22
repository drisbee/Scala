var test = 1 + 2
println(test)
var x = 15

while(x > 0)
  x = x - 1
  println("Andres print line" + x)
  println("Dit is " + x + " nu.")

//Functions
def addOne(m: Int): Int = m + 1

def adder(m: Int, n: Int) = m + n

//Partial application
val add2 = adder(2, _:Int)
add2(3)


