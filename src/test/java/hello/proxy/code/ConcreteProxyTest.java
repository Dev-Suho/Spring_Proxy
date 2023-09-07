package hello.proxy.code;

import hello.proxy.code.concreteproxy.ConcreteClient;
import hello.proxy.code.concreteproxy.ConcreteLogic;
import org.junit.jupiter.api.Test;

public class ConcreteProxyTest {

    @Test
    void noProxy() {
        ConcreteLogic concreteLogic = new ConcreteLogic();
        ConcreteClient client = new ConcreteClient(concreteLogic);
        client.execute();
    }
}
