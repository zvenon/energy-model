    package org.codefx.demo.bingen.zoo

/*
 * TODO #8: Visit the zoo
 *
 * Create a `Visitor` interface with `Kid` and `Parent` implementations.
 * Come up with two methods on it, put some instances in a list and iterate over it.
 */

fun main(args: Array<String>) {
    val cats = listOf(Cat("Luna"), Cat("Mo"), Cat("Felix"))
    val fishes = listOf(Fish("#1"), Fish("#2"), Fish("#3"))

    val animals: MutableList<Animal> = mutableListOf()
    animals.addAll(cats)
    animals.addAll(fishes)

    animals.addAll(fishes)
    for (animal in animals) {
        println("${animal.name()} says '${animal.noise()}' and moves ${animal.move()}.")
    }
}

interface Animal {

    fun name(): String

    fun move(): String

    fun noise(): String

}

class Cat(val name: String): Animal {

    override fun name(): String {
        return name
    }

    override fun move(): String {
        return "prowl.."
    }

    override fun noise(): String {
        return "meow"
    }

    fun lookCondescending(): String {
        return "you mortal fool *sqints*"
    }

}

class Fish(val name: String): Animal {

    override fun name(): String {
        return name
    }

    override fun move(): String {
        return "swim, swim"
    }

    override fun noise(): String {
        return ""
    }

}
