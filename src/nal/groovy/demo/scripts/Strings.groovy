package nal.groovy.demo.scripts

println "--------------------------------------------------------------------------------------"
println "Strings In Groovy Demo"
def name =  "Nishant"
println "My name is " + name
println "My name is ".concat(name)
println "My name is ${name}"   //${} for variable
println "My name is $name"     // {} is optional but recommended
println 'My name is $name' //variable will not be replaced when using single quote string. Interpolation is not allowed with single quote
println "--------------------------------------------------------------------------------------"
def str = """Triple double quote is used
to print multi-line string as it is."""
println str

def str2 = '''Triple single quote can also be used
to print multi-line string as it is.'''
println str2
println "--------------------------------------------------------------------------------------"
println name.length()
println "get the char at index 2 from start using charAt: " + name.charAt(2)
println "get the char at index 2 from start using index: " + name[2]
println "get the char at index 2 from end using index: " + name[-2]
println "get index of char s: " + name.indexOf('s')
println "--------------------------------------------------------------------------------------"
println "get the chars from index 0 to 2: " + name[0..2]
println "get the chars from index 5 to 2 (reverse order): " + name[5..2]
println "get the chars at index 0,2,4: " + name[0,2,4]
println "substring starting from index 2 to end: " + name.substring(2)
println "substring starting from index 2 to 5(exclusive): " + name.substring(2, 5)
println "subSequence starting from index 2 to 5(exclusive): " + name.subSequence(2, 5)
println "--------------------------------------------------------------------------------------"

def line = "This is a test statement"
println line.split(" ")

println "After removing test: " +  (line - " test")
println "Replace test with sample: " +  line.replace("test", "sample")

println "To Lower Case: " + line.toLowerCase()
println "To Upper Case: " + line.toUpperCase()
println "To List: " + line.toList()
println "--------------------------------------------------------------------------------------"

println "text " * 3
println "Nishant".equals("nishant")
println "Nishant".equalsIgnoreCase("nishant")
println "--------------------------------------------------------------------------------------"

def string = "My name is \"Nishant\""
println string
def slashy = "slashy"
def s1 = /This is a string using ${slashy}
        This is useful if you want to use " in your string. Like "THIS". 
        It's also useful in defining regex patterns/
def s2 = $/This is a string using dollar ${slashy}
        This is useful when you have / in your string/$
println s1
println s2
println "--------------------------------------------------------------------------------------"
