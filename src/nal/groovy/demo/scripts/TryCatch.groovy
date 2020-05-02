package nal.groovy.demo.scripts

try {
    i = 1 / 0
}
catch (ArithmeticException ex) {
    println "In ArithmeticException Catch Block"
    println "Cause: " + ex.getCause()
    println "Message: " + ex.getMessage()
    println "Printing Stack Trace: "
    ex.printStackTrace()
}
catch (Exception ex) {
    println "In General Exception Catch Block"
    println "Cause: " + ex.getCause()
    println "Message: " + ex.getMessage()
    println "Printing Stack Trace: "
    ex.printStackTrace();
}
finally {
    println "In finally block"
    println "This will always be executed, even if there is no exception"
    println "You can have finally block even if you dont have any catch block. try{}finally{}"
}

println "Outside try catch finally"