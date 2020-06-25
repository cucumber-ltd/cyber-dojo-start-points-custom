import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;

@CucumberContextConfiguration
//@ContextConfiguration(locations="classpath:cucumber.xml")
@ContextConfiguration(classes=Shouty.class)
@TestExecutionListeners(inheritListeners = true)
public class CucumberSpringConfiguration
{

}
