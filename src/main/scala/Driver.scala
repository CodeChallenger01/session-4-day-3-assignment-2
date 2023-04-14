import com.typesafe.scalalogging.Logger

import scala.util.{Failure, Success, Try}

object Driver extends App {
  private val loggers = Logger(getClass)
  private val firstList: List[Int] = List(1, 2, 3, 4, 5)
  private val secondList: List[Int] = List(1, 2, 3, 4, 5)
  loggers.info("Checking with List Type")
  private val obj = new EqualityInScala[List[Int]]
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
    case Success(value) => loggers.info(s"$value")
    case Failure(exception) => loggers.info(s"${exception.getMessage}")
  }

  loggers.info("Checking with String Type")
  private val string = new EqualityInScala[String]
  val firstString = "Manish"
  val secondString = "manish"
  private val listOfString: List[String] = List("Manish", "Ravi")
  private val listOfOtherString: List[String] = List("Manish", "Ravi")
  private val stringResult = {
    Try {
      val equalsResult = string.equalsCheck(firstString, secondString)
      val equalsEqualsResult = string.equalsEqualsCheck(firstString, secondString)
      val notEqualsResult = string.notEqualsCheck(firstString, secondString)
      val neResult = string.neCheck(listOfString, listOfOtherString)
      val eqResult = string.eqCheck(listOfString, listOfOtherString)
      (equalsResult, equalsEqualsResult, notEqualsResult, neResult, eqResult)
    }
  }
  stringResult match {
    case Success(value) => loggers.info(s"$value")
    case Failure(exception) => loggers.info(s"${exception.getMessage}")
  }

  loggers.info("Checking with Integer Type")
  private val integer = new EqualityInScala[Int]
  private val firstInteger = 14
  private val secondInteger = 15
  private val listOfInteger: List[Int] = List(16, 18, 20)
  private val listOfOtherInteger: List[Int] = List(12, 17, 19)
  private val integerResult = {
    Try {
      val equalsResult = integer.equalsCheck(firstInteger, secondInteger)
      val equalsEqualsResult = integer.equalsEqualsCheck(firstInteger, secondInteger)
      val notEqualsResult = integer.notEqualsCheck(firstInteger, secondInteger)
      val neResult = integer.neCheck(listOfInteger, listOfOtherInteger)
      val eqResult = integer.eqCheck(listOfInteger, listOfOtherInteger)
      (equalsResult, equalsEqualsResult, notEqualsResult, neResult, eqResult)
    }
  }
  integerResult match {
    case Success(value) => loggers.info(s"$value")
    case Failure(exception) => loggers.info(s"${exception.getMessage}")
  }
}