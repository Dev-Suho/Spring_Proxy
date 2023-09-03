package hello.proxy.code.decorator;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class DecoratorTest {

    @Test
    void noDecorator() {
        RealComponent component = new RealComponent();
        DecoratorClient client = new DecoratorClient(component);
        client.execute();
    }

    @Test
    void decorator1() {
        Component realComponent = new RealComponent();
        Component messageDecorator = new MessageDecorator(realComponent);
        DecoratorClient client = new DecoratorClient(messageDecorator);

        client.execute();
    }
    @Test
    void decorator2() {
        Component realComponent = new RealComponent();
        Component messageDecorator = new MessageDecorator(realComponent);
        Component timeDecorator = new TimeDecorator(messageDecorator);

        DecoratorClient client = new DecoratorClient(timeDecorator);
        client.execute();
    }
}
