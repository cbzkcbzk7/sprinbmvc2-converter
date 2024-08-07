package hello.typeconverter.converter;

import hello.typeconverter.type.IpPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;

/**
 * packageName    : hello.typeconverter.converter
 * fileName       : IpPortToStringConverter
 * author         : Sora
 * date           : 2024-08-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-07        Sora       최초 생성
 */
@Slf4j
public class IpPortToStringConverter implements Converter<IpPort, String> {
    @Override
    public String convert(IpPort source) {
        log.info("convert source = {}", source);

        return source.getIp() + ":" + source.getPort();
    }
}
