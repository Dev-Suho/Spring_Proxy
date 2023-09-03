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
}
