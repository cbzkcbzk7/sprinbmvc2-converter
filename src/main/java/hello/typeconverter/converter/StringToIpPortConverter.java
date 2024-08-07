package hello.typeconverter.converter;

import hello.typeconverter.type.IpPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;

/**
 * packageName    : hello.typeconverter.converter
 * fileName       : StringToIpPortConverter
 * author         : Sora
 * date           : 2024-08-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-07        Sora       최초 생성
 */
@Slf4j
public class StringToIpPortConverter implements Converter<String, IpPort> {

    @Override
    public IpPort convert(String source) {
        log.info("convert source={}", source);
        // "127.0.0.1:8080"
        String[] split = source.split(":");
        String ip = split[0];
        Integer port = Integer.parseInt(split[1]);

        return new IpPort(ip,port);
    }
}
