package cucumber.calculator.demo;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Calculator.feature" ,
 glue = {"cucumber.calculator.demo"})
public class CalculatorTest {
	
}
