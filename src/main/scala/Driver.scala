import scala.util.{Failure, Success, Try}

object Driver extends App {
  private val firstList: List[Int] = List(1, 2, 3, 4, 5)
  private val secondList: List[Int] = List(1, 2, 3, 4, 5)
  private val obj = new EqualityInScala[Int]
  private val result = {
    Try {
      val equalsResult = obj.equalsCheck(firstList, secondList)
      val equalsEqualsResult = obj.equalsEqualsCheck(firstList, secondList)
      val notEqualsResult = obj.notEqualsCheck(firstList, secondList)
      val neResult = obj.neCheck(firstList, secondList)
      val eqResult = obj.eqCheck(firstList, secondList)
      (equalsResult, equalsEqualsResult, notEqualsResult, neResult, eqResult)
    }
  }
  result match {
    case Success(value) => println(value)
    case Failure(exception) => exception.getMessage
  }
}