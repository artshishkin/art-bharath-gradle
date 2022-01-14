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

s = ['java', 'js', 'python', 'js'] as Set
println s
println s.class

emptyMap = [:]
println emptyMap
println emptyMap.getClass()

m = [courseName: 'Gradle', rating: 5, price: 9.99]
println m
println m.rating.class
println m.price.class

m.each { k, v ->
    println "${k} -> ${v}"
}

// Access to fields
println m.courseName
println m['courseName']
println m.get('courseName')

//new key
m.review = 'It\'s awesome'
m['students'] = 4321
m.put('enrolled', 567)
println m

TreeSet treeSet = [3, 2, 1, 5, 6] as Set
println treeSet
println treeSet.class

