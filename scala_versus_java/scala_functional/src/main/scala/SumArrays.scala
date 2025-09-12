@main def Main(): Unit = {
    val arr = Array(1, 2, 3, 4, 5)
    val sum = sumArrays(arr)
    println(s"Sum of arrays: $sum")
}

def sumArrays(arr: Array[Int]): Int = arr.sum