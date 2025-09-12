package leetcode

import org.scalatest.funsuite.AnyFunSuite

class SuiteTestSpec extends AnyFunSuite {

//  val twoSum = new TwoSum
//  val addTwoNumbers = new AddTwoNumbers
//
  test("Testando Fold") {
    val palavras = List("Hello", "World", "Scala")
    val str = palavras.fold("")(_ + "," + _)
    println(str)
    //    assert(resultado.equals(resultado))
  }
//
//  test("Case 2 Soma") {
//    val result = twoSum.twoSum(Array(3,2,4), 6)
//    assert(result.sameElements(Array(1, 2)))
//  }
//
//  test("soma de duas listas ligadas - exemplo 1") {
//    val l1 = new ListNode(2, new ListNode(4, new ListNode(3)))
//    val l2 = new ListNode(5, new ListNode(6, new ListNode(4)))
//
//    val resultado = addTwoNumbers.addTwoNumbers(l1, l2)
//    assert(resultado.equals(resultado))
//  }
//
//  test("soma de duas listas ligadas - exemplo 2") {
//    val l1 = new ListNode(0)
//    val l2 = new ListNode(0)
//
//    val resultado = addTwoNumbers.addTwoNumbers(l1, l2)
//  }
//
//  test("soma de duas listas ligadas - exemplo 3") {
//    val l1 = new ListNode(9);
//
//    val l2 = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))))))
//
//    val resultado = addTwoNumbers.addTwoNumbers(l1, l2)
//    assert(resultado.equals(resultado))
//  }
}