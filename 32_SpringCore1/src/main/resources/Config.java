								import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

@Configurable
//the class whoes object we WANT to create
@ComponentScan(basePackages = {com.aurionpro.model})
public class Config {

	
	
}
