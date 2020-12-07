package pl.javastart.bean.printer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pl.javastart.bean.decorator.MessageDecorator;
import pl.javastart.bean.producer.FileMessage;
import pl.javastart.bean.producer.MessageProducer;
import pl.javastart.bean.producer.Producer;

@Component
public class MessagePrinter {

    MessageProducer messageProducer;
    MessageDecorator messageDecorator;

    public void print(){
        System.out.println(messageProducer.getMsg());
    }

    public MessagePrinter() {
    }

    @Autowired
    public MessagePrinter(@Producer(type = Producer.ProducerType.SIMPLE) MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }


    public MessageDecorator getMessageDecorator() {
        return messageDecorator;
    }
    @Autowired(required = false)
    public void setMessageDecorator(MessageDecorator messageDecorator) {
        this.messageDecorator = messageDecorator;
    }

    public MessageProducer getMessageProducer() {
        return messageProducer;
    }

    public void setMessageProducer(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }
}
