package net.shyshkin.study.groovy

class Patient {

    def firstName, lastName, age
    static hospitalCode = 'Best Hospital in Town'

    void setFirstName(firstName) {
        if (firstName == null)
            throw new IllegalArgumentException("Last Name can not be null")
        this.firstName = firstName
    }

    def getLastName() {
        println('Getting last name')
        return lastName
    }

    static void display() {
        println hospitalCode
    }
}

p = new Patient(firstName: 'Art', lastName: 'Shyshkin', age: 38)
//p.firstName = null      //IllegalArgumentException
p.firstName = "Artem"   //Correct
println p.firstName + " " + p.lastName + " " + p.age

Patient.display()