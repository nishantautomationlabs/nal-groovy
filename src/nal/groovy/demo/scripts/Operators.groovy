package nal.groovy.demo.scripts

println "--------------------------------------------------------------------------------------"
println "Operators In Groovy Demo"
//Arithmetic Operators
assert 3 + 2 == 5
assert 3 - 2 == 1
assert 3 * 2 == 6
assert 3 / 2 == 1.5
assert 3 % 2 == 1
assert 3 ** 2 == 9  //raised to the power

assert 3.intdiv(2) == 1
assert 1.2.plus(2.3) == 3.5
println "--------------------------------------------------------------------------------------"

//Increment and Decrement operators
int i = 10;
println i++
println i
println i--
println i

int x = ++i * 2
println x
println "i = $i, x = $x"
int y = --i * 2
println "i = $i, y = $y"

println "--------------------------------------------------------------------------------------"

def a = 3
a += 4
assert a == 7
a -= 2
assert a == 5
a %= 2
assert a == 1
a *= 5
assert a == 5
a /= 2
assert a == 2.5
println "--------------------------------------------------------------------------------------"
//Relational operators
assert 1 + 2 == 3
assert 3 != 4
assert -2 < 3
assert 2 <= 2
assert 3 <= 4
assert 5 > 1
assert 5 >= -2
println "--------------------------------------------------------------------------------------"
//Logical operators
assert !false
assert true && true
assert true || false
println "--------------------------------------------------------------------------------------"
//Bitwise operators
int a1 = 0b00101010
assert a1 == 42
int b1 = 0b00001000
assert b1 == 8
assert (a1 & a1) == a1
assert (a1 & b1) == b1
assert (a1 | a1) == a1
assert (a1 | b1) == a1
assert (a1 ^ a1) == 0b00000000
println "--------------------------------------------------------------------------------------"
println Integer.toBinaryString(25)
println Integer.parseInt("1001", 2)

assert (!'string') == false
println "--------------------------------------------------------------------------------------"
//Not operator
assert (!true)    == false
assert (!'foo')   == false
assert (!'')      == true
println "--------------------------------------------------------------------------------------"
//Ternary operator
def res = (1 > 0) ? "Is greater" : "is not greater"
println res
def str = "nishant"
result = str ? str : "not defined"
println result
result = str ?: "not defined"   //Elvis operator
println result
println "--------------------------------------------------------------------------------------"