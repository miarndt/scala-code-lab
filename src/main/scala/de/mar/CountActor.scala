package de.mar

import akka.actor.Actor

class CountActor extends Actor {
    var sum = 0
    var start: Long = 0L

    def receive = {
        case i: Int => sum += i
        case "sum" =>
            println("Elapsed is: " + (System.currentTimeMillis() - start))
            println("Sum is: " + sum)
        case "start" =>
            start = System.currentTimeMillis()
            println("Now is: " + start)
    }
}
