package jammazwan.xav;

import org.apache.camel.builder.RouteBuilder;

public class XavRoutes extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("cxf:bean:passThruEndpoint").log("\n\n${body}\n\n");
	}
}
