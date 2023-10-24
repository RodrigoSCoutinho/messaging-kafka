package br.com.rodrigoscoutinho.messagingkafka;


import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class HelloProducer {
    private KafkaTemplate<String, String> kafkaTemplate;

    public HelloProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }


    public void senMessage(String message){
        kafkaTemplate.send("hello-topic", message);
    }
}
