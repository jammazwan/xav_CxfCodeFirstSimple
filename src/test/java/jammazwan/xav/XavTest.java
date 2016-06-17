package jammazwan.xav;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XavTest extends CamelSpringTestSupport {

	@Override
	protected AbstractXmlApplicationContext createApplicationContext() {
		return new ClassPathXmlApplicationContext("META-INF/spring/camel-context.xml");
	}

	@Test
	public void testXav() throws Exception {
		// Thread.sleep(Long.MAX_VALUE); // poor man's server
		String input = "same back to you!";
		List<Object> params = new ArrayList<Object>();
		params.add(input);
		String reply = template.requestBody("cxf:bean:passThruEndpoint", params, String.class);
		assertEquals(reply, input);
	}

}
