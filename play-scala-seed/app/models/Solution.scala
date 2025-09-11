package models

class Solution {

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val resultados = for {
      i <- nums.indices
      j <- (i + 1) until nums.length
      if nums(i) + nums(j) == target
    } yield Array(i, j)

    resultados.head
  }
}
