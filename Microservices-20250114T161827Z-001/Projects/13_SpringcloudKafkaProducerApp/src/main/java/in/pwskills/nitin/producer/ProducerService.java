package in.pwskills.nitin.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProducerService {

	@Autowired
	private KafkaTemplate<String, String> kft;
	
	@Value("${my.topic.name}")
	private String topicname;
	
	public void sendMSG(String msg) {
		kft.send(topicname,msg);
	}
	
}
