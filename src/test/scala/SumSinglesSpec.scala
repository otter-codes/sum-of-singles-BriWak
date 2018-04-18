import org.scalatest._

class SumSinglesSpec extends WordSpec with MustMatchers {

  "SumSingles" must {

    "return 1 when given a list of 1" in {
      SumSingles(List(1)) mustEqual 1
    }

    "return 3 when given a list of 1,2" in {
      SumSingles(List(1,2)) mustEqual 3
    }

    "return 1 when given a list of 1,2,2" in {
      SumSingles(List(1,2,2)) mustEqual 1
    }

    "return 2 when given a list of 1,1,2,3,3" in {
      SumSingles(List(1,1,2,3,3)) mustEqual 2
    }

    "return 15 when given a list of 4,5,7,5,4,8" in {
      SumSingles(List(4,5,7,5,4,8)) mustEqual 15
    }

    "return 9 when given a list of 1,1,2,2,3,3,4,5" in {
      SumSingles(List(1,1,2,2,3,3,4,5)) mustEqual 9
    }
  }

}
