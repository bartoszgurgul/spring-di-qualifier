package pl.javastart.bean.decorator;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class UpperCaseMessageDecorator implements MessageDecorator {
    @Override
    public String decorated(String msg) {
        return msg.toUpperCase();
    }
}
