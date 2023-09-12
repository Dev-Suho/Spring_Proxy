package hello.proxy.jdkdynamic;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
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

    @Test
    void dynamicCall() throws Exception {
        Class hello = Class.forName("hello.proxy.jdkdynamic.ReflectionTest$Hello");

        Hello targetClass = new Hello();

        Method methodCallA = hello.getMethod("callA");
        dynamicCall(methodCallA, targetClass);

        Method methodCallB = hello.getMethod("callB");
        dynamicCall(methodCallB, targetClass);
    }

    private void dynamicCall(Method method, Object target) throws InvocationTargetException, IllegalAccessException {
        log.info("start");
        Object result = method.invoke(target);
        log.info("result={}", result);
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
