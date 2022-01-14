package net.shyshkin.study.groovy

l = [1, 2, 3]
println l
println l.class

LinkedList l = [1, 2, 3]
println l
println l.class

l.add(4)
l << 5
println l

l = l + [6, 7, 8]
println l

println l - [3, 5]

println("\neach")
l.each { print it }
println("\nreverseEach")
l.reverseEach { print it }
println("\neachPermutation")
['a', 'b', 'c'].eachPermutation { println it }


