package gg.asdf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
@WebIntegrationTest
public class AppTest {
	RestTemplate rt = new RestTemplate();

	@Test
	public void helloWorldSaysHello() {
		assertEquals("hello world", rt.getForEntity("http://localhost:8080/", String.class).getBody());
	}
}
