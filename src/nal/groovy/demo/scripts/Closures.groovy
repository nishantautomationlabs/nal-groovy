package nal.groovy.demo.scripts

println "--------------------------------------------------------------------------------------"
println "Closure In Groovy Demo"

def myClosure = { println "This is my closure" }
myClosure.call()

def closureWithVariable = { var -> println "Welcome ${var}" }
closureWithVariable.call("Nishant")
closureWithVariable.call("Peter")

def str = "variable"
def closureWithVars = { var -> println "This is a referring a ${str} along with closure parameter ${var}" }
closureWithVars.call("Test")

//def someMethod() {
//    println "${str}"   //Will not work as we cannot do direct referncing in method like we do in closure
//}
//someMethod()


def methodWithClosureAsParameter(closure) {
    closure.call("You")
}
methodWithClosureAsParameter(closureWithVariable)

def closureWithReturnValue = {
    a, b, c -> return (a + b + c)
}
def result = closureWithReturnValue.call(1, 2, 3)
println result

println "--------------------------------------------------------------------------------------"
def color = ["Red", "Blue", "Green"]
color.each { println it }

def map = ["key1":"value1", "key2":"value2"]
map.each { println it}
map.each { println it.key + "---" + it.value}
println "--------------------------------------------------------------------------------------"

def myList = [1,2,3,4,5]
println "List: $myList"
println "Find: " + myList.find { item -> item % 2 == 0}  //returns the first match
println "Find All: " + myList.findAll { item -> item % 2 == 0}  //returns all the matches
println "Any: " + myList.any() { item -> item % 2 == 0}  //returns true if there is one or more element matching the condition
println "Every: " + myList.every() { item -> item > 0}  //returns true if all the elements matches the condition
println "Collect: " + myList.collect { item -> item * 2}
println "--------------------------------------------------------------------------------------"

def numList = 1..8
def evenNoClosure = { num -> return (num % 2 == 0)}
def evenNums = filterMethod(numList, evenNoClosure)  //pass closure as an argument
println "Even Nos: " + evenNums


static def filterMethod(list, closure) {
    return list.findAll(closure)
}

println "--------------------------------------------------------------------------------------"