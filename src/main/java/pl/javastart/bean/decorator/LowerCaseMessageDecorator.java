package pl.javastart.bean.decorator;

import org.springframework.stereotype.Component;

@Component
public class LowerCaseMessageDecorator implements MessageDecorator{
    @Override
    public String decorated(String msg) {
        return msg.toLowerCase();
    }
}
