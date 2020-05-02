package nal.groovy.demo.scripts

println "--------------------------------------------------------------------------------------"
println "Maps In Groovy Demo"
def employee = ['name':'Nishant',
                'age':35,
                'company':'CompanyName']

println employee
println employee.name
println employee['age']
println employee.get('company')
println employee.getAt('age')

println "Size: ${employee.size()}"

employee.put('city','bangalore')
println employee

println "Contains Key age: " + employee.containsKey('age')
println "Contains Value 35: " + employee.containsValue(35)

println "Class Name: " + employee.getClass()

def copy = employee.clone();
copy.put('city', 'chennai')
println "Employee: " + employee
println "Copy: " + copy
println "--------------------------------------------------------------------------------------"
employee.each {
    println it.key + ":" + it.value
}
println "--------------------------------------------------------------------------------------"
employee.each { key, value ->
    println "${key} : ${value}"
}
println "--------------------------------------------------------------------------------------"
employee.eachWithIndex { key, value, i ->
    println "$i | ${key} : ${value}"
}
println "--------------------------------------------------------------------------------------"
employee.each { entry ->
    println "$entry.key : $entry.value"
}
println "--------------------------------------------------------------------------------------"
employee.clear()
println employee.size()
println employee
println "--------------------------------------------------------------------------------------"