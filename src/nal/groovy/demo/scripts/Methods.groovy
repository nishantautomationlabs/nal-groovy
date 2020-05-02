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