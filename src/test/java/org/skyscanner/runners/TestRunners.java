package org.skyscanner.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class )
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "org.skyscanner",
        //tags = "@Rag or @Sag1", // Use several tags in same time
        tags= "@Reg", //"Use exclusive tag unique"
        plugin = {"pretty","html:src/test/resources/report/report.html"}
)
public class TestRunners {


}
