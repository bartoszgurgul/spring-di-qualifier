package pl.javastart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.javastart.bean.printer.MessagePrinter;

@Configuration
@ComponentScan
public class SpringDiAppliaction {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringDiAppliaction.class);
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.print();
        context.close();
    }
}
