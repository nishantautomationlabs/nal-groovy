package nal.groovy.demo.scripts

println "--------------------------------------------------------------------------------------"
println "Write file in Groovy Demo"

File file = new File("output.txt")
file.write("This is the first line")
file << "\nThis is the second line"
println file.text
println "--------------------------------------------------------------------------------------"

file.text = "This will replace old content with this"
println file.text
println "--------------------------------------------------------------------------------------"

file.withWriter { writer ->
    writer.write("This will also overwrite old content")
}
println file.text
println "--------------------------------------------------------------------------------------"

file.append("\nThis text will be appended to the existing text in the file")
println file.text
println "--------------------------------------------------------------------------------------"

println "File Length in bytes: " + file.length()
println "Is File: " + file.isFile()
println "Is Directory: " + file.isDirectory()
println "Is Hidden: " + file.isHidden()
println "--------------------------------------------------------------------------------------"

println "Copy data from one file to another"
def newFile = new File("copy.txt")
newFile << file.text
println "NewFile: " + newFile.text
println "--------------------------------------------------------------------------------------"

println "rename file to newcopy.txt: " + newFile.renameTo(new File("newcopy.txt"))
newFile = new File("newcopy.txt")  //newFile still pointing to copy.txt
println "empty file content"
newFile.bytes = []
println "Size after clearing content: " + newFile.size()
println "Delete New File: " + newFile.delete()
println "--------------------------------------------------------------------------------------"
