package hello.proxy.jdkdynamic;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

@Slf4j
public class ReflectionTest {

    @Test
    void reflection() throws Exception {
        Class hello = Class.forName("hello.proxy.jdkdynamic.ReflectionTest$Hello");

        Hello targetClass = new Hello();

        Method methodCallA = hello.getMethod("callA");
        Object resultA = methodCallA.invoke(targetClass);
        log.info("resultA={}", resultA);

        Method methodCallB = hello.getMethod("callB");
        Object resultB = methodCallB.invoke(targetClass);
        log.info("resultB={}", resultB);
    }

    static class Hello {
        public String callA() {
            log.info("callA");
            return "A";
        }
        public String callB() {
            log.info("callB");
            return "B";
        }
    }

}
