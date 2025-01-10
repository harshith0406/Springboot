package dataretrival;
import java.util.Arrays;

import org.springframework.stereotype.Component;
@Component
public class Compute {
	private Data dataservice;
	public Compute(Data dataservice) {
		super();
		this.dataservice=dataservice;
	}
	public int findMax(){
		return Arrays.stream(dataservice.retriveData()).max().orElse(0);
	}
}

