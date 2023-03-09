package hello.springmvc.basic;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 일반적으로 @Controller는 반환값이 String인 경우 뷰 이름으로 인식되어 뷰를 찾아 렌더링한다.
@RestController // 반면 @RestController는 반환값이 뷰가 아닌 String이 HTTP 메시지 바디에 바로 입력된다.
public class LogTestController {
    private final Logger log = LoggerFactory.getLogger(getClass());
    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        log.trace("trace log={}", name); // 문자열 더하기 연산 +는 지양한다. 이렇게 parmeter를 넘기자.
        log.debug("debug log={}", name);
        log.info(" info log={}", name);
        log.warn(" warn log={}", name);
        log.error("error log={}", name);

        //로그를 사용하지 않아도 a+b 계산 로직이 먼저 실행됨, 이런 방식으로 사용하면 X log.debug("String concat log=" + name);
        log.debug("String concat log=" + name);
        return "ok";
    } }