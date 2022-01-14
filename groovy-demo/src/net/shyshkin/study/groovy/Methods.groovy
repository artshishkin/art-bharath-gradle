package net.shyshkin.study.groovy

int product(int x, int y) {
    return x * y
}

println product(3, 4)

def productSimple(x, y) {
    x * y
}

result = productSimple 5, 6
println result

int productBestPractices(int x, int y) {
    x * y
}

//println(productBestPractices(5,"6")) //Caught: groovy.lang.MissingMethodException: No signature of method
println(productBestPractices(5, 6)) //OK

int productDefaultValue(int x = 3, int y) {
    x * y
}

println(productDefaultValue(5))

void display(Map productDetails) {
    println productDetails.name
    println productDetails.price
}

display([name: 'IPhone', price: 1000])
display(name: 'IPhone', price: 1000) //without square brackets
display(price: 1000, name: 'IPhone') //change order of keys
display price: 1000, name: 'IPhone' //syntax without brackets

