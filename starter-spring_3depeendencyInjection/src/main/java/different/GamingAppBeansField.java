package different;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Component
class YourClass{
	
	Dependency1 d1;
	
	Dependency2 d2;

	public String toString() {
		return ("Dep1"+d1+"dep2"+d2);
	}
}
@Component
class Dependency1 {
	
}
@Component
class Dependency2{
	
}



//this is called feild dependency injection
@Configuration
@ComponentScan
public class GamingAppBeansField {
	public static void main(String[] args) {
		try(var context=new AnnotationConfigApplicationContext(GamingAppBeansField.class)){
			//without autowiring it wont automatically convert to wired component
			System.out.println(context.getBean(YourClass.class));
		}
	}
	
}
