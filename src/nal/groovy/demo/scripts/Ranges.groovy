package nal.groovy.demo.scripts

println "--------------------------------------------------------------------------------------"
println "Ranges In Groovy Demo"
def range = 1..10
println range
println "Size: " + range.size()
println "From ${range.getFrom()} To ${range.getTo()}"

println "get value at index 3: " + range[3]
println "contains 5: " + range.contains(5)
println "Is Reverse: " + range.isReverse()
println "(10..1) Is Reverse: " + ((10..1).isReverse())
println "--------------------------------------------------------------------------------------"

def newRange = range.subList(2,5)
println newRange
for(i in newRange) {
    print i + "-->"
}
println ""

println "--------------------------------------------------------------------------------------"
newRange.each {i ->
    println "Value=$i"
}

println "Get Class: " + range.getClass()
println "Is instance of java.util.List: " +  range instanceof java.util.List
println "--------------------------------------------------------------------------------------"

def str = "This is a test statement"
println str[0..3]
println str[3..0]   //in reverse order
println str[0..-5]  //from 0 to 5th last element from end

println "--------------------------------------------------------------------------------------"
