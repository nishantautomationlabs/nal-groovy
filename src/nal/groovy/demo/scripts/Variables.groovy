package nal.groovy.demo.scripts

println "--------------------------------------------------------------------------------------"
println "Variable In Groovy Demo"
name  = "Name1"
println name
def name2 = "Name2"
println name2
String name3 = "Name3"
println name3
println "--------------------------------------------------------------------------------------"

def _a = 1
def _A = 2
println "a = ${_a}, b = $_A"  //{} can be dropped

//Letter, digit and underscore is allowed in variable name and variable name is case sensitive
def _var123 = 22
println _var123
println "--------------------------------------------------------------------------------------"

def var = "Nishant"
println "var Type: " + var.getClass().getName()
var = 123
println var
print "var Type: " + var.getClass().getName()
var = (byte)10
println var
print "var Type: " + var.getClass().getName()

def(a,b,c) = [1,2,3]
println "$a $b $c"
println "--------------------------------------------------------------------------------------"

def(String x, int y, double z) = ["text", 8, 9.1]
println "$x $y $z"
println "--------------------------------------------------------------------------------------"

def(q, w, e) = [7, 8]   //e will be assigned null
println "$q $w $e"
println "--------------------------------------------------------------------------------------"
