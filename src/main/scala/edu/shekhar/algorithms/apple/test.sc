val a = Array(1, 2, 3, 4)
a.drop(1).scanLeft(1)(_ * _)
a.drop(1).scanRight(1)(_ * _)
a.reduceLeft(_ * _)
a.drop(2).product