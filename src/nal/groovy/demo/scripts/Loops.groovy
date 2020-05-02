package nal.groovy.demo.scripts

println "--------------------------------------------------------------------------------------"
println "Loops In Groovy Demo"

for(int i = 0; i < 5; i++)
    print i + " "
println ""
println "--------------------------------------------------------------------------------------"

for(def i = 0; i < 5; i++)
    print i + " "
println ""
println "--------------------------------------------------------------------------------------"

int i = 0
for(i; i < 5; i++)
    print i + " "
println ""
println "--------------------------------------------------------------------------------------"

for(j in 1..5)
    print j + " "
println ""
println "--------------------------------------------------------------------------------------"

1.upto(5) { print "$it " }
println ""
println "--------------------------------------------------------------------------------------"

5.times { print "$it "}  //Zero based
println ""
println "--------------------------------------------------------------------------------------"

0.step(10, 2) { print "$it "}
println ""
println "--------------------------------------------------------------------------------------"

for(k in [0,1,2,3,4])
    println k
println "--------------------------------------------------------------------------------------"

def map = ["key1":"value1", "key2":"value2"]
for(e in map)
    println e.key + ":" + e.value
println "--------------------------------------------------------------------------------------"

int x = 0;
while(x < 5) {
    print x + " "
    x++;
}
println ""
println "--------------------------------------------------------------------------------------"

