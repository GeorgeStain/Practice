package udemy

object DarkSugars extends App {

  trait Action {
    def act(x: Int): Int
  }

  val act = new Action {
    override def act(x: Int): Int = x + 1
  }

  val aThread = new Thread({new Runnable {
    override def run(): Unit = println("hello scala")
  }})

  val scalaThread = new Thread(() => println("hello cool scala") )

  abstract class AnAbstractType {
    def implemented = 23
    def f(a: Int):Unit
  }

  val anAbstractInstance: AnAbstractType = (a:Int) => println("sweet")
//  :: and #::
  val prependedList = 2 :: List(3, 4)
//  2.::(List(3,4)) we assume
//  List(3,4).::(2) actually
//  WHAT?????
//  the associativity of the method determined by the last chat of methode name
//  if it end with : "right to left "
//  else "left to right



}
