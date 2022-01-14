package net.shyshkin.study.groovy

def a = 10.24F
println a
println a.class

float b = 10.24F
println b
println b.class

s = 'hello'
println s
println s.class

name = "Art"
s = "hello ${name}"
println s
println s.class

s = '''
All the power is with you.
You can do everything and anything
'''
println s
println s.class

s = """
All the power is with you. ${name}
You can do everything and anything
"""
println s
println s.class

emailPattern = /([a-zA-Z0-9_\-\.]+)@([a-zA-Z0-9_\-\.]+)\.([a-zA-Z]{2,5})/
println "test@gmail.com" ==~ emailPattern
println "testgmail.com" ==~ emailPattern
println "test@gmail.c" ==~ emailPattern
println emailPattern.class


