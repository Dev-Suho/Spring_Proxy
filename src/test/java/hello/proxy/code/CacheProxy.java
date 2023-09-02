package hello.proxy.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CacheProxy implements Subject {

    private Subject subject;
    private String cache;

    public CacheProxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String operation() {
        log.info("프록시 호출");
        if (cache == null) {
            cache = subject.operation();
        }
        return null;
    }
}
