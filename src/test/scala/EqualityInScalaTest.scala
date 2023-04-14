import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class EqualityInScalaTest extends AnyFlatSpec {

  /* A class to Test with integer type value*/
  val testIntegerObj = new EqualityInScala[Int]
  private val firstIntegerList: List[Int] = List(1, 2, 3, 4, 5)
  private val secondIntegerList: List[Int] = List(1, 2, 3, 4, 5)

  /* A class to Test with  String Type value*/
  val testStringObj = new EqualityInScala[String]
  val firstString: List[String] = List("Manish", "Akhil", "Jitendra")
  val secondString: List[String] = List("Manish", "Akhil", "Jitendra")

  /* In every part I am checking with same list as well as different list */

  /* To checking with Integer type list by .equals(), ==, !=, ne, eq */
  ".equals()" should "match with true,true on list of Integer" in {
    val actualOutput = testIntegerObj.equalsCheck(firstIntegerList.head, secondIntegerList.head)
    val expectedOutput = (true, true)
    expectedOutput shouldBe actualOutput
  }

  "==" should "match with true,true on list of Integer" in {
    val actualOutput = testIntegerObj.equalsEqualsCheck(firstIntegerList.head, secondIntegerList.head)
    val expectedOutput = (true, true)
    expectedOutput shouldBe actualOutput
  }

  "!=" should "match with false, false on list of Integer" in {
    val actualOutput = testIntegerObj.notEqualsCheck(firstIntegerList.head, secondIntegerList.head)
    val expectedOutput = (false, false)
    expectedOutput shouldBe actualOutput
  }

  "ne" should "match with false,true on list of Integer" in {
    val actualOutput = testIntegerObj.neCheck(firstIntegerList, secondIntegerList)
    val expectedOutput = (false, true)
    expectedOutput shouldBe actualOutput
  }

  "eq" should "match with true, false on list of Integer" in {
    val actualOutput = testIntegerObj.eqCheck(firstIntegerList, secondIntegerList)
    val expectedOutput = (true, false)
    expectedOutput shouldBe actualOutput
  }

  /* CHECKING WITH STRING TYPE VALUE */
  /* To checking with String type list by .equals(), ==, !=, ne, eq */
  ".equals()" should "match with true,true on  String" in {
    val actualOutput = testStringObj.equalsCheck(firstString.head, secondString.head)
    val expectedOutput = (true, true)
    expectedOutput shouldBe actualOutput
  }

  "==" should "match with true,true on  String" in {
    val actualOutput = testStringObj.equalsEqualsCheck(firstString.head, secondString.head)
    val expectedOutput = (true, true)
    expectedOutput shouldBe actualOutput
  }

  "!=" should "match with false,false on  String" in {
    val actualOutput = testStringObj.notEqualsCheck(firstString.head, secondString.head)
    val expectedOutput = (false, false)
    expectedOutput shouldBe actualOutput
  }

  "ne" should "match with false,true on  String" in {
    val actualOutput = testStringObj.neCheck(firstString, secondString)
    val expectedOutput = (false, true)
    expectedOutput shouldBe actualOutput
  }

  "eq" should "match with true, false on  String" in {
    val actualOutput = testStringObj.eqCheck(firstString, secondString)
    val expectedOutput = (true, false)
    expectedOutput shouldBe actualOutput
  }

}
