package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\Features\\TestSuite01.feature"}, glue= {"StepDefinations"})
public class TestRunner {

}
