package pl.javastart.bean.producer;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Producer(type = Producer.ProducerType.FILE)
public class FileMessageProducer implements MessageProducer {
    @Override
    public String getMsg() {
        return "file >>>>>>>>>>>>>>";
    }
}
