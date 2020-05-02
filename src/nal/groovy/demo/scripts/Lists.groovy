package nal.groovy.demo.scripts

println "--------------------------------------------------------------------------------------"
println "List In Groovy Demo"
def color = ["Red", "Blue", "Green"]
println "List: " + color
println "Element at index 1: " + color.get(1)
println "Element at index 2: " + color[2]
println "--------------------------------------------------------------------------------------"
def customList = [4, 1, ["item1", "item2", 3.3], 5, 2]
println "Custom List: " + customList
println "Element at index 3: " + customList[3]
println "Element at index [2][1]: " + customList[2][1]
println "Element at index [2][2]: " + customList.get(2).get(2)

println "Sublist from index 1 to 3: " + customList[1..3]  //from 1 to 3
println "Sublist from index 4 to 2 (reverse order): " + customList[4..2]  //in reverse order
println "Sublist from index 0 to 2nd last: " + customList[0..-2]  //From 0 to 2nd last element

customList.add(6)
println "After adding 6: " + customList

customList<<7   //another way to add in List
println "After adding 7: " + customList

customList.add(2,8) //add at index
println "After adding 8 at index 2: " + customList

println "Contains 5: " + customList.contains(5)
println "Contains item2 in sublist: " + customList.get(3).contains("item2")
println "Size: " + customList.size()

println "--------------------------------------------------------------------------------------"
println "Custom List: " + customList
println "Remove element at index 4: " + customList.remove(4)  //remove at index
println "After removing element at index 4: " + customList

println "Remove Object [\"item1\", \"item2\", 3.3]: " + customList.remove(["item1", "item2", 3.3])  // remove object
println "After removing object: " + customList

println "Remove last element: " + customList.removeLast()
println "After removing last element: " + customList

println "Pop element: " + customList.pop()  //pop from head
println "After popping: " + customList

customList = customList + [["test1", "test2"], 9]
println "After adding [\"test1\", \"test2\"], 9]: " + customList

customList = customList.plus([11, 13])
println "Plus [11, 13]: " + customList

customList = customList - [1, 8]
println "After subtracting [1, 8]:" + customList

customList = customList.minus([11, 13])
println "Minus [11, 13]: " + customList

println "--------------------------------------------------------------------------------------"
println "Custom List: " + customList
println "Intersection with [2, 5, 9]: " + customList.intersect([2,5,9])

customList = customList.reverse()
println "Reverse List: " + customList

customList = customList.sort()
println "Sorted List: " + customList

println "Clear List"
customList.clear()
println "Is Empty: " + customList.isEmpty()
println "--------------------------------------------------------------------------------------"