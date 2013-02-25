package example0;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.MessageChannel;
import org.springframework.integration.core.PollableChannel;
import org.springframework.integration.message.GenericMessage;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("serviceactivator-config.xml")
public class ServiceActivatorTest {
	
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private MessageChannel inputChannel;
	
	@Autowired
	private PollableChannel outputChannel;

	@Test
	public void submitOrderGetaway() {
		inputChannel.send(new GenericMessage<String>("World"));
		System.out.println("==> HelloWorldDemo: " + outputChannel.receive(0).getPayload());
	}

}
