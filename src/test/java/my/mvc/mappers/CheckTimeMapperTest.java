package my.mvc.mappers;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@Log4j2
@SpringBootTest
public class CheckTimeMapperTest {

    // 의존성 주입
    @Autowired
    private CheckTimeMapper checkTimeMapper;

    // MyBatis connection 확인을 위한 timeCheck
    @Test
    @Transactional
    public void checkTimeTest() {
        log.info(checkTimeMapper.getTime());
    }
}
