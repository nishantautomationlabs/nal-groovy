package nal.groovy.demo.scripts

println "--------------------------------------------------------------------------------------"
println "Methods In Groovy Demo"
def printMsg() {
    println "Hello World!!!"
}

printMsg()

def sum(int a, int b) {
    return a + b;
}

int result = sum(4, 6)
println result

def sumWithDefaultValues(int a=3, int b=2) {
    return a + b;
}

result = sumWithDefaultValues()
println result

result = sumWithDefaultValues(5)
println result

println "--------------------------------------------------------------------------------------"

def doubleIt(n) {
    n + n  // last line is always the return statement, return keyword is not required
}

println doubleIt(5)
println doubleIt("nishant")
println "--------------------------------------------------------------------------------------"

def noArgs() {
    println "Called the no args function"
}

def oneArg(x) {
    println "Called the 1 args function with $x"
    x
}

def twoArg(x, y) {
    println "Called the 2 args function with $x $y"
    x + y
}

//calling
oneArg 100  // () are not required when function takes one or more parameters
twoArg 100, 200
noArgs()
twoArg oneArg(100), 200
println "--------------------------------------------------------------------------------------"