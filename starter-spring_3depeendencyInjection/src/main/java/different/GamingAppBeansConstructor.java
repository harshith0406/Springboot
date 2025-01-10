package different;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Component
class Youclass{
	@Autowired
	Depend1 d1;
	@Autowired
	Depend2 d2;
	public String toString() {
		return ("Dep1"+d1+"dep2"+d2);
	}
	//no need autowired
	public Youclass(Depend1 d1, Depend2 d2) {
		super();
		this.d1 = d1;
		this.d2 = d2;

		System.out.println("Check1&2");
	}
	
}
@Component
class Depend1 {
	
}
@Component
class Depend2{
	
}
//this is called feild dependency injection
@Configuration
@ComponentScan
public class GamingAppBeansConstructor {
	public static void main(String[] args) {
		try(var context=new AnnotationConfigApplicationContext(GamingAppBeansConstructor.class)){
			//without autowiring it wont automatically convert to wired component
			//System.out.println(context.getBean(Youclass.class));
		}
	}
	
}
