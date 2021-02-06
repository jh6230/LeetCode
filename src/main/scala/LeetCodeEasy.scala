object Easy {

  def main(args: Array[String]): Unit = {
    val accounts: Array[Array[Int]] = Array(Array(1, 2, 3), Array(4, 5, 6))
    val nums: List[Int] = List(1, 2, 3, 4, 5)
    val candies: List[Int] = List(2, 3, 5, 6, 1, 2)
    val int = 3
    val address: String = "255.255.100.1"
    println(maxmunWealth(accounts))
    println(runningSum(nums))
    println(defangIPadder(address))
    println(kidsWithCandies(candies, int))
  }

  def maxmunWealth(accounts: Array[Array[Int]]): Int = {
    accounts.map(v => v.sum).max
  }

  //累積和問題
  def runningSum(nums: List[Int]): List[Int] = {
    nums.scanLeft(0)(_ + _).slice(1, nums.size + 1)
  }

  def defangIPadder(address: String): String = {
    address.replace(".", "[.]")
  }

  def kidsWithCandies(candies: List[Int], extraCandies: Int): List[Boolean] = {
    candies.map(v =>
      if (candies.max <= v + extraCandies) {
        true
      } else {
        false
      }
    )
  }

}
