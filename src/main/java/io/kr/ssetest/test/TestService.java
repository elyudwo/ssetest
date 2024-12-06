package io.kr.ssetest.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.io.IOException;

@Service
@Slf4j
public class TestService {

    public SseEmitter test() {
        String str = "hello world im lee y j in devcra lol lol lol lol";
        SseEmitter emitter = new SseEmitter(100000000L);
//        ExecutorService executor = newSingleThreadExecutor();
//        executor.execute(() -> {
        try {
            for (char c : str.toCharArray()) {
                emitter.send(c);
            }
            emitter.complete();
        } catch (IOException e) {
            emitter.completeWithError(e);
        }
//        });
        return emitter;
    }

}
