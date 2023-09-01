package hello.proxy;

import hello.proxy.code.ProxyPatternClient;
import hello.proxy.code.SubjectImpl;
import org.junit.jupiter.api.Test;

public class ProxyPatternTest {

    @Test
    void noProxyTest() {
        SubjectImpl subject = new SubjectImpl();
        ProxyPatternClient client = new ProxyPatternClient(subject);
        client.execute();
        client.execute();
        client.execute();
    }
}
