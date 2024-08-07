package hello.typeconverter.converter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;

/**
 * packageName    : hello.typeconverter.converter
 * fileName       : StringToIntegerConverter
 * author         : Sora
 * date           : 2024-08-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-07        Sora       최초 생성
 */
@Slf4j
public class StringToIntegerConverter implements Converter<String,Integer> {
    @Override
    public Integer convert(String source) {
        log.info("convert source={}", source);
        return Integer.valueOf(source);
    }


}
