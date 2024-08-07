package hello.typeconverter.converter;

import hello.typeconverter.type.IpPort;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import static org.assertj.core.api.Assertions.*;

/**
 * packageName    : hello.typeconverter.converter
 * fileName       : ConverterTest
 * author         : Sora
 * date           : 2024-08-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-07        Sora       최초 생성
 */
public class ConverterTest {

    @Test
    void stringToInteger(){
       StringToIntegerConverter converter = new StringToIntegerConverter();
       Integer result = converter.convert("10");

        assertThat(result).isEqualTo(10);
        assertThat(result).isInstanceOf(Integer.class);
    }

    @Test
    void integerToString(){
        IntegerToStringConverter converter = new IntegerToStringConverter();
        String result = converter.convert(10);

        assertThat(result).isEqualTo("10");
        assertThat(result).isInstanceOf(String.class);
    }

    @Test
    void stringToIpPort() {
        StringToIpPortConverter converter = new StringToIpPortConverter();
        String source = "127.0.0.1:8080";
        IpPort result = converter.convert(source);
        assertThat(result).isEqualTo(new IpPort("127.0.0.1", 8080));
    }


    @Test
    void ipPortToString() {
        IpPortToStringConverter converter = new IpPortToStringConverter();
        IpPort source = new IpPort("127.0.0.1", 8080);
        String result = converter.convert(source);
        assertThat(result).isEqualTo("127.0.0.1:8080");
    }
}
