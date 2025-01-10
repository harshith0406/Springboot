package different;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Component
class Your_Class{
	@Autowired
	Dependency_1 d1;
	@Autowired
	Dependency_2 d2;
	public String toString() {
		return ("Dep1"+d1+"dep2"+d2);
	}
	@Autowired
	public void setD1(Dependency_1 d1) {
		this.d1 = d1;
		System.out.println("Check1");
	}
	@Autowired
	public void setD2(Dependency_2 d2) {
		this.d2 = d2;
		System.out.println("Check2");
	}
}
@Component
class Dependency_1 {
	
}
@Component
class Dependency_2{
	
}
//this is called feild dependency injection
@Configuration
@ComponentScan
public class GamingAppBeansSetter {
	public static void main(String[] args) {
		try(var context=new AnnotationConfigApplicationContext(GamingAppBeansSetter.class)){
			//without autowiring it wont automatically convert to wired component
			System.out.println(context.getBean(Your_Class.class));
		}
	}
	
}
