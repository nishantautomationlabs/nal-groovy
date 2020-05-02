package nal.groovy.demo.scripts

println "--------------------------------------------------------------------------------------"
println "Regex match In Groovy Demo"
def string = "nishant nand an and fan"

def match = string =~ "an"
if(match) {
    println "Match Count: " + match.getCount()
    for(i in 0..match.getCount() - 1) {
        println match[i]
    }
}
else
    println "No match found!!!"

println "--------------------------------------------------------------------------------------"
def regex = /(sta.*nt)/
def match2 = "this is a test statement" =~ regex
println match2[0]

println "--------------------------------------------------------------------------------------"
