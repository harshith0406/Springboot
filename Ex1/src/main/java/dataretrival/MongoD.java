package dataretrival;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class MongoD implements Data{
	public int[] retriveData() {
		return new int[] {11,22,33,44,55};
	}
}
