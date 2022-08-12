package com.pensionerDetails.Service;

import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import org.mockito.InjectMocks;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import com.pensionerDetailsMicroservice.Service.PensionerdetailServiceImpl;
@SpringBootTest(classes = PensionDetailServiceTest.class)
@AutoConfigureMockMvc
@SuppressWarnings("deprecation")
class PensionDetailServiceTest {

	@InjectMocks
	private PensionerdetailServiceImpl pds;

	@Rule
	public ExpectedException exception = ExpectedException.none();

	

	@Test
	void testNotNullPensionDetailServiceObject() {
		assertNotNull(pds);
	}

	/*
	 * @Test void testCorrectDetailsReturnedFromServiceWithCorrectAadharNumber()
	 * throws NumberFormatException, IOException, AadharNumberNotFoundException,
	 * ParseException {
	 * 
	 * PensionerDetail pensionerDetail = new PensionerDetail("Sudarshan",
	 * DateUtil.parseDate("30-08-2000"), "PCASD1234Q", 45000, 2000, "family", new
	 * Bank("SBI", 11223344, "private"));
	 * 
	 * PensionerDetail pd=pds.getPensionerDetailByAadhaarNumber(102233445566L);
	 * assertEquals(pd, pensionerDetail); }
	 */

}
