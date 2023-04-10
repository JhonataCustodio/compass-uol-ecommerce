package br.com.compassuol.pb.mspayment.mqueue;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class Payment {
    @RabbitListener(queues = "${mq.queues.payment}")
    public void payloadPayment(@Payload String payload){
        System.out.println(payload);
    }
}
