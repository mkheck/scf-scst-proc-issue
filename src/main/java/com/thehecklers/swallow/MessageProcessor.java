package com.thehecklers.swallow;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.integration.annotation.MessageEndpoint;
import reactor.core.publisher.Flux;

//@MessageEndpoint
public class MessageProcessor {
//    @StreamListener
//    @Output(Processor.OUTPUT)
//    public Flux<Subscriber> transformSub(@Input(Processor.INPUT) Flux<Subscriber> subs) {
//        return subs.map(sub -> new Subscriber(sub.getId(),
//                sub.getFirstName().toUpperCase(),
//                sub.getLastName().toUpperCase(),
//                sub.getSubscribeDate()));
//    }
}
