object Main extends App {
  private val firstList: List[Int] = List(1, 2, 3, 4, 5)
  private val secondList: List[Int] = List(1, 2, 3, 4, 5)
  private val obj = new EqualityInScala[Int]
  println(obj.equalsCheck(firstList, secondList))
  println(obj.equalsEqualsCheck(firstList, secondList))
  println(obj.notEqualsCheck(firstList, secondList))
  println(obj.neCheck(firstList, secondList))
  println(obj.eqCheck(firstList, secondList))

}