package example1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("gateway-config.xml")
public class GatewayTest {
	
	
	@Autowired
	private Gateway gateway;
	

	@Test
	public void submitOrderGetaway() {
		System.out.println(gateway.sayHello("John"));
	}

}
