import scala.collection.immutable.LazyList.cons

val nums = List.range(1, 10)
nums.sliding(2, 1).toList
nums.sliding(2, 2).toList
nums.sliding(2, 3).toList
nums.sliding(2, 4).toList
nums.sliding(5, 2).toList

val myStream = LazyList("m1", "m2", "m3")
myStream.head

myStream.take(2).toList

def createFibSeries(a: Int, b: Int): LazyList[Int] = {
  println(s"a = $a, b = $b")
   cons(a, createFibSeries(b, a + b))
}

val myFibSeries = createFibSeries(0, 1)

myFibSeries.take(8).foreach(println)