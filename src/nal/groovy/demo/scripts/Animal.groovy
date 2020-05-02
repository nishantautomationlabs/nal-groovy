package nal.groovy.demo.scripts

import groovy.transform.ToString


@ToString(includeNames = true, includeFields = true, includePackage = false)
class Animal {
    def name
    def sound

    def run() {
        println "$name runs"
    }

    def makeSound() {
        println "$name says $sound"
    }

//    def Animal(name, sound) {
//        this.name = name
//        this.sound = sound
//    }

    static void main(args) {
//        def dog = Animal("dog", "bark")   // with constructor
        def dog = new Animal(name:"dog", sound: "bark")  //no constructor required
        dog.run()
        dog.makeSound()
        println dog.toString()

    }
}

