package pl.javastart.bean.decorator;

import org.springframework.stereotype.Component;

@Component
@Decoder(type = Decoder.DECODER.LOWER)
public class LowerCaseMessageDecorator implements MessageDecorator{
    @Override
    public String decorated(String msg) {
        return msg.toLowerCase();
    }
}
