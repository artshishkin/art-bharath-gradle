package net.shyshkin.study.groovy

c1 = {
    println("Closures are super simple")
}

c1.call()

c2 = {
    n -> println(n % 2 == 0 ? "even" : "odd")
}

c2.call(51)

closureWithDefault = {
    n = 0 -> println(n % 2 == 0 ? "even" : "odd")
}

closureWithDefault.call()
closureWithDefault.call(11)

4.times { n -> print n }
4.times { print it }


