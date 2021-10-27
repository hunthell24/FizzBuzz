package ee.tthk.tarpe19.järvela;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ipValidatorTests {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void ShouldReturn_False_WhenEmptyStringParameter() {
		IpValidator validator = new IpValidator();
		assertTrue(validator.ValidateIpv4Address(""));

	}
}