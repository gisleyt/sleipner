package no.cuteforce.sleipner.parser.resultparser;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.testng.annotations.Test;

@Test
public class ResultParserTest {


    public void testParsing() {


        Connection connection = Jsoup.connect(this.getClass().getResource("/").getPath());
    }


}
