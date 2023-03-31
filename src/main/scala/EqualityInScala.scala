class EqualityInScala[T] {

  /* This method is used to check the list with .equals() method */
  def equalsCheck(firstList: List[T], secondList: List[T]): (Boolean, Boolean) = {
    val checkWithSameList = firstList.equals(firstList)
    val checkWithDifferentList = firstList.equals(secondList)
    (checkWithSameList, checkWithDifferentList)
  }

  /* This method is used to check the list with == operator */
  def equalsEqualsCheck(firstList: List[T], secondList: List[T]): (Boolean, Boolean) = {
    val checkWithSameList = firstList == firstList
    val checkWithDifferentList = firstList == secondList
    (checkWithSameList, checkWithDifferentList)
  }

  /* This method is used to check the list with != operator*/
  def notEqualsCheck(firstList: List[T], secondList: List[T]): (Boolean, Boolean) = {
    val checkWithSameList = firstList != secondList
    val checkWithDifferentList = firstList != secondList
    (checkWithSameList, checkWithDifferentList)
  }

  /* This method is used to check the list with ne keyword
     ne applied on same instance then it gives false else it give true */
  def neCheck(firstList: List[T], secondList: List[T]): (Boolean, Boolean) = {
    val checkWithSameList = firstList ne firstList
    val checkWithDifferentList = firstList ne secondList
    (checkWithSameList, checkWithDifferentList)
  }

  /* This method is used to check the list with ne keyword
     eq applied on same instance then it gives true else it give false */
  def eqCheck(firstList: List[T], secondList: List[T]): (Boolean, Boolean) = {
    val checkWithSameList = firstList eq firstList
    val checkWithDifferentList = firstList eq secondList
    (checkWithSameList, checkWithDifferentList)
  }

}



