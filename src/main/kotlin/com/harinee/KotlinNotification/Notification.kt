package com.harinee.KotlinNotification

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

/*This method is used to listen for the message with the help of the @KafkaListener annotation
and prints the message on the console once it is available in the topic*/

@Service
class Notification {
    @KafkaListener(topics= ["OrderStatus"], groupId = "test_id")
    fun consume(message:String) :Unit {
        println(" Status of your order is : $message")  /*Message received from Topic*/
    }
}