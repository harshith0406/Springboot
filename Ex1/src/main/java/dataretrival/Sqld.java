package dataretrival;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Sqld implements Data {
	public int[] retriveData() {
		return new int[] {1,2,3,4,5};
	}
}
