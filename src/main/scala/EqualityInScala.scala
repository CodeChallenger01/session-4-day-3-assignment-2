import com.typesafe.scalalogging.Logger

class EqualityInScala[T] {

  private val loggers = Logger(getClass)

  /* This method is used to check the list with .equals() method */
  def equalsCheck(firstList: T, secondList: T): (Boolean, Boolean) = {
    loggers.info(" Checking inside the equal to method ")
    val checkWithSameList = firstList.equals(firstList)
    val checkWithDifferentList = firstList.equals(secondList)
    (checkWithSameList, checkWithDifferentList)
  }

  /* This method is used to check the list with == operator */
  def equalsEqualsCheck(firstList: T, secondList: T): (Boolean, Boolean) = {
    loggers.info(" Checking inside the == to operator ")
    val checkWithSameList = firstList == firstList
    val checkWithDifferentList = firstList == secondList
    (checkWithSameList, checkWithDifferentList)
  }

  /* This method is used to check the list with != operator*/
  def notEqualsCheck(firstList: T, secondList: T): (Boolean, Boolean) = {
    loggers.info(" Checking inside the != to operator ")
    val checkWithSameList = firstList != firstList
    val checkWithDifferentList = firstList != secondList
    (checkWithSameList, checkWithDifferentList)
  }

  /* This method is used to check the list with ne keyword
     ne applied on same instance then it gives false else it give true */
  def neCheck[A](firstList: List[A], secondList: List[A]): (Boolean, Boolean) = {
    loggers.info(" Checking inside the ne to operator ")
    val checkWithSameList = firstList ne firstList
    val checkWithDifferentList = firstList ne secondList
    (checkWithSameList, checkWithDifferentList)
  }

  /* This method is used to check the list with eq keyword
     eq applied on same instance then it gives true else it give false */
  def eqCheck[A](firstList: List[A], secondList: List[A]): (Boolean, Boolean) = {
    loggers.info(" Checking inside the eq to operator ")
    val checkWithSameList = firstList eq firstList
    val checkWithDifferentList = firstList eq secondList
    (checkWithSameList, checkWithDifferentList)
  }

}



