import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(strict=true, monochrome=true, plugin="pretty", snippets=SnippetType.UNDERSCORE)
public class RunCucumberTest {
    // this is the adapter/bridge code
    // between cucumber jvm and junit
    // you do not need to edit this
}
