package runner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src\\test\\resources\\login\\login.feature"},glue = {"definition"})
public class test_runner
{

}
