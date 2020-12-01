package cucumber.calculator.demo;

import org.hamcrest.Matchers;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CalculatorStepDefinition {

	private int total;
	private int operand1;
	private int operand2;

	private final Calculator calculator = new Calculator();

	
	@Given("^user enters the values (-?\\d+) and (-?\\d+)$")
	public void userEntersTwoNumbers(int num1, int num2) throws Throwable {
		this.operand1 = num1;
		this.operand2 = num2;
		log.info("User entered two values " + num1 + " " + num2);
	}
	

	@When("^adding entered numbers$")
	public void testAdd() throws Throwable {
		total = calculator.add(this.operand1, this.operand2);
		System.out.println("Operands: " + this.operand1 + " " + this.operand2);
	}
	

	@When("^subtracting entered numbers$")
	public void testSubtract() throws Throwable {
		total = calculator.subtract(this.operand1, this.operand2);
		System.out.println("Operands: " + this.operand1 + " " + this.operand2);
	}
	

	@When("^multiplying entered numbers$")
	public void testMultiply() throws Throwable {
		total = calculator.multiply(this.operand1, this.operand2);
		System.out.println("Operands: " + this.operand1 + " " + this.operand2);
	}
	

	@When("^dividing entered numbers$")
	public void testDivide() {
		if (operand2 == 0) {
			log.error("Dividing by zero is an illegal operation");
		}
		total = calculator.divide(this.operand1, this.operand2);
		System.out.println("Operands: " + this.operand1 + " " + this.operand2);
	}

	
	@Then("^the result should be (-?\\d+)$")
	public void validateResult(int result) throws Throwable {
		Assert.assertThat(total, Matchers.equalTo(result));
		System.out.println("result:: " + result);
	}
	

	@When("^division is requested with divide by zero$")
	public void testDividebyZero() throws Throwable {
		log.info("Trying to divide by Zero");
	}
	

	@Then("^the operation leads to exception$")
	public void validateDividebyZero() throws Throwable {
		log.info("Dividing by zero is an illegal operation");
	}
	

	@When("^multiplication is requested$")
	public void testIncorrectResult() throws Throwable {
		log.info("Multiplication is requested");
	}
	

	@Then("^multiplication result is incorrect$")
	public void checkIncorrectMultiplication() throws Throwable {
		log.info("This multiplication yielded wrong result");
	}
}
