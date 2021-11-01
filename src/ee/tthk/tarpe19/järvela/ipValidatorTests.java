package ee.tthk.tarpe19.järvela;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ipValidatorTests {

	private IpValidator validator;
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void ShouldReturn_False_WhenEmptyStringParameter() {
		assertFalse(validator.ValidateIpv4Address(""));

	}
	@Test
	void ShouldReturn_False_GivenEmptyStringParameter() {
		assertFalse(validator.ValidateIpv4Address("")); 
	}
	
	@Test
	void ShouldBe_True_GivenStringWithThreeDots() {
		assertTrue(validator.ValidateIpv4Address("1.2.3.4")); 
	
	}
	@Test
	void ShouldReturnFourNumbersGivenStringWithThreeDots() {
		int[] expected = {1,2,3,4};
		assertArrayEquals(expected,validator.getNumbers("1.2.3.4")); 
	
	}
	@Test
	void ShouldBe_False_GivenStringWithThreeNumbersAndDots() {
		assertFalse(validator.ValidateIpv4Address("1.2.3."));
		
		
	}
	
}

















