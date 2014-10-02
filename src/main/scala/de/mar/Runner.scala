package de.mar

import akka.actor.{Props, ActorSystem}

object Runner extends App {

    val system = ActorSystem("performance")
    val actor = system.actorOf(Props(new CountActor))
    actor ! "start"
    for (i <- 1 to 20000000) actor ! i
    println("delivered at " + System.currentTimeMillis())
    actor ! "sum"

}
