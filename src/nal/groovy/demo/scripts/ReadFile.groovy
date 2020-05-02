package nal.groovy.demo.scripts

println "--------------------------------------------------------------------------------------"
println "Read files in Groovy Demo"
String filePath = "/opt/nishantautomationlabs/nal-groovy/src/file.txt"

File myFile = new File(filePath)
println myFile.text  //read entire content at once

println "--------------------------------------------------------------------------------------"
//Load file in a list
def list = myFile.collect { it }
println "List: $list"

println "--------------------------------------------------------------------------------------"
//Load file in an array
def array = myFile as String[]
println "Array: $array"

println "--------------------------------------------------------------------------------------"
//Load file into a list of string
def lines = myFile.readLines()
println "List of String: $lines"

println "--------------------------------------------------------------------------------------"
def lineNos = 2..5
def filteredLine = []
println "Read file line by line"
myFile.eachLine { line, i ->
    if(lineNos.contains(i)) {
        filteredLine.add(line)
    }
    println "Line $i: $line"
}
println "Filtered Lines: $filteredLine"
println "--------------------------------------------------------------------------------------"

println "Read with Reader"
def line
myFile.withReader { reader ->
    while((line = reader.readLine()) != null) {
        println "Line: $line"
    }
}
println "--------------------------------------------------------------------------------------"
println "Read with new Reader to keep it open, write to another file"
def outFile = "out.txt"
def reader  = myFile.newReader()
new File(outFile).append(reader)
reader.close()
new File(outFile).delete() //to delete file
println "--------------------------------------------------------------------------------------"

println "Read file as bytes"
byte[] content = myFile.bytes
println content
println content.size()
println "Is File: " + myFile.isFile()
println "Is Directory: " + myFile.isDirectory()
println "--------------------------------------------------------------------------------------"

println "Print all files path in a folder"
new File("/opt/testfolder").eachFile { file ->
    if(file.isFile())
        println file.getAbsoluteFile()
}
println "--------------------------------------------------------------------------------------"

println "Print all files path recursively in a folder"
new File("/opt/testfolder").eachFileRecurse { file ->
    if(file.isFile())
        println file.getAbsoluteFile()
}
println "--------------------------------------------------------------------------------------"

println "Write content of a file to another file"
def newFile = new File("test.txt")
newFile << myFile.text
newFile.delete() //to delete file
println "--------------------------------------------------------------------------------------"
