package nal.groovy.demo.scripts

println "--------------------------------------------------------------------------------------"
println "Data Types In Groovy Demo"
//byte
byte b = 100
println b
println "Class: " + b.getClass().getName() + " Min Value: " + Byte.MIN_VALUE + " Max Value: " + Byte.MAX_VALUE
println "--------------------------------------------------------------------------------------"
//short
short s = 32000
println s
println "Class: " + s.getClass().getName() + " Min Value: " + Short.MIN_VALUE + " Max Value: " + Short.MAX_VALUE
println "--------------------------------------------------------------------------------------"
//int
int i = 2140000000
println i
println "Class: " + i.getClass().getName() + " Min Value: " + Integer.MIN_VALUE + " Max Value: " + Integer.MAX_VALUE
println "--------------------------------------------------------------------------------------"
//long
long l = 1234567890L
println l
println "Class: " + l.getClass().getName() + " Min Value: " + Long.MIN_VALUE + " Max Value: " + Long.MAX_VALUE
println "--------------------------------------------------------------------------------------"
//float
float f = 1000.0221F
println f
println "Class: " + f.getClass().getName() + " Min Value: " + Float.MIN_VALUE + " Max Value: " + Float.MAX_VALUE
println "--------------------------------------------------------------------------------------"
//double
double d = 1000.0331
println d
println "Class: " + d.getClass().getName() + " Min Value: " + Double.MIN_VALUE + " Max Value: " + Double.MAX_VALUE
println "--------------------------------------------------------------------------------------"
//char
char c = 'C'
println c
println "Class: " + c.getClass().getName()
println "--------------------------------------------------------------------------------------"
//String
String str = "Sample String"
println str
println "Class: " + str.getClass().getName()
println "--------------------------------------------------------------------------------------"
//Boolean
boolean bool = true
println bool
println "Class: " + bool.getClass().getName()
println "--------------------------------------------------------------------------------------"