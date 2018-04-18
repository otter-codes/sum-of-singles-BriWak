object SumSingles {
  def apply(input: List[Int]): Int = {
    val noDuplicates = input.distinct
    val duplicates: List[Int] = input.diff(noDuplicates)
    noDuplicates.diff(duplicates).sum
  }
}