package hello.proxy.jdkdynamic.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AImpl implements AInterface{
    @Override
    public String callInterfaceA() {
        log.info("A Interface 호출");
        return "A";
    }
}
