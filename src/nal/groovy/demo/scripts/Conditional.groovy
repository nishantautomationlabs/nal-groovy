package nal.groovy.demo.scripts

println "--------------------------------------------------------------------------------------"
println "Conditional Statements In Groovy Demo"
def num = 10
if(num < 10)
    println "Number is less than 10"
else if(num > 10)
    println "Number is greater than 10"
else
    println "Number is equal to 10"
println "--------------------------------------------------------------------------------------"

def var = 6
switch (var) {
    case {var > 5}:
        println "Greater than 5"
        break;
    case {var < 5}:
        println "Less than 5"
        break
    default:
        println "Equal case is not handled"
}

println "--------------------------------------------------------------------------------------"