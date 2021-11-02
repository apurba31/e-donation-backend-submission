package com.DonationManagement.tests;

//import static com.iiht.training.ratings.testutils.TestUtils.boundaryTestFile;
//import static com.iiht.training.ratings.testutils.TestUtils.currentTest;
//import static com.iiht.training.ratings.testutils.TestUtils.yakshaAssert;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.junit.jupiter.api.Test;
import org.junit.Assert;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import com.DonationManagement.Dto.DonationsDto;
import com.DonationManagement.Dto.DonorDto;
import com.DonationManagement.Dto.NGODto;
import com.DonationManagement.testUtils.MasterData;



@ExtendWith(SpringExtension.class)
public class BoundaryTest {

	private static Validator validator;
	Integer testInt = null;
	
	@BeforeAll
	public static void setUp() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
	}
	
	@Test
	public void testDonorIdNotNull() throws Exception {
		DonationsDto donations = MasterData.getDonations();
		donations.setDonationType("");
		Set<ConstraintViolation<DonationsDto>> violations = validator.validate(donations);
		assertTrue(!violations.isEmpty());
	}
	
	@Test
	public void testNGOIdNotNull() throws Exception{
		DonationsDto donations = MasterData.getDonations();
		donations.setDonationType("");
		Set<ConstraintViolation<DonationsDto>> violations = validator.validate(donations);
		assertTrue(!violations.isEmpty());
	}
	
	@Test
	public void testNGODonationTypeNotNull() throws Exception{
		DonationsDto donations = MasterData.getDonations();
		donations.setDonationType(null);
		Set<ConstraintViolation<DonationsDto>> violations = validator.validate(donations);
		assertTrue(!violations.isEmpty());
	}
	
	@Test
	public void testNGODonationTypeMaxHundred() throws Exception{
		DonationsDto donations = MasterData.getDonations();
		String donationType = "";
		for (int i = 0; i < 120; i++) {
			donationType.concat("A");
		}
		donations.setDonationType(donationType);
		Set<ConstraintViolation<DonationsDto>> violations = validator.validate(donations);
		assertTrue(!violations.isEmpty());
	}
	
	@Test
	public void testDonatedNgoIdNotNull() throws Exception{
		DonorDto donors = MasterData.getDonors();
		donors.setAddress("");
		Set<ConstraintViolation<DonorDto>> violations = validator.validate(donors);
		assertTrue(!violations.isEmpty());
	}
	
	@Test
	public void testDonorNameNotNull() throws Exception{
		DonorDto donors = MasterData.getDonors();
		donors.setName(null);
		Set<ConstraintViolation<DonorDto>> violations = validator.validate(donors);
		assertTrue(!violations.isEmpty());
	}
	
	@Test
	public void testDonorNameMaxThirty() throws Exception{
		DonorDto donors = MasterData.getDonors();
		String donorName = "";
		for (int i = 0; i < 120; i++) {
			donorName.concat("A");
		}
		donors.setName(donorName);
		Set<ConstraintViolation<DonorDto>> violations = validator.validate(donors);
		assertTrue(!violations.isEmpty());
	}
	
	@Test
	public void testEmailNotNull() throws Exception{
		DonorDto donors = MasterData.getDonors();
		donors.setEmail(null);
		Set<ConstraintViolation<DonorDto>> violations = validator.validate(donors);
		assertTrue(!violations.isEmpty());
	}
	
	
	@Test
	public void testNumberNotNUll() throws Exception{
		DonorDto donors = MasterData.getDonors();
		donors.setNumber(null);
		Set<ConstraintViolation<DonorDto>> violations = validator.validate(donors);
		assertTrue(!violations.isEmpty());
	}
	
	@Test
	public void testAddressNotNull() throws Exception{
		DonorDto donors = MasterData.getDonors();
		donors.setAddress(null);
		Set<ConstraintViolation<DonorDto>> violations = validator.validate(donors);
		assertTrue(!violations.isEmpty());
	}
	
	@Test
	public void testAddressMaxHundred() throws Exception{
		DonorDto donors = MasterData.getDonors();
		String address = "";
		for (int i = 0; i < 120; i++) {
			address.concat("A");
		}
		donors.setAddress(address);
		Set<ConstraintViolation<DonorDto>> violations = validator.validate(donors);
		assertTrue(!violations.isEmpty());
	}
	
	@Test
	public void testPasswordNotNull() throws Exception{
		DonorDto donors = MasterData.getDonors();
		donors.setPassword(null);
		Set<ConstraintViolation<DonorDto>> violations = validator.validate(donors);
		assertTrue(!violations.isEmpty());
	}
	
	@Test
	public void testPasswordMaxThirty() throws Exception{
		DonorDto donors = MasterData.getDonors();
		String password = "";
		for (int i = 0; i < 120; i++) {
			password.concat("A");
		}
		donors.setAddress(password);
		Set<ConstraintViolation<DonorDto>> violations = validator.validate(donors);
		assertTrue(!violations.isEmpty());
	}
	
	@Test
	public void testNgoNameNotNull() throws Exception{
		NGODto ngo = MasterData.getNGOForTesting();
		ngo.setNgoName(null);
		Set<ConstraintViolation<NGODto>> violations = validator.validate(ngo);
		assertTrue(!violations.isEmpty());
	}
	
	@Test
	public void testNGONameMaximumThirty() throws Exception{
		NGODto ngo = MasterData.getNGOForTesting();
		String ngoName = "";
		for (int i = 0; i < 120; i++) {
			ngoName.concat("A");
		}
		ngo.setNgoName(ngoName);
		Set<ConstraintViolation<NGODto>> violations = validator.validate(ngo);
		assertTrue(!violations.isEmpty());
	}
	
	@Test
	public void testNGOUsernameNotNull() throws Exception{
		NGODto ngo = MasterData.getNGOForTesting();
		ngo.setNgoUsername(null);
		Set<ConstraintViolation<NGODto>> violations = validator.validate(ngo);
		assertTrue(!violations.isEmpty());
	}
	
	@Test
	public void testNGOUsernameMaxThirty() throws Exception{
		NGODto ngo = MasterData.getNGOForTesting();
		String ngoUsername = "";
		for (int i = 0; i < 120; i++) {
			ngoUsername.concat("A");
		}
		ngo.setNgoName(ngoUsername);
		Set<ConstraintViolation<NGODto>> violations = validator.validate(ngo);
		assertTrue(!violations.isEmpty());
	}
	
	@Test
	public void testNGOPasswordNotNull() throws Exception{
		NGODto ngo = MasterData.getNGOForTesting();
		ngo.setNgoPassword(null);
		Set<ConstraintViolation<NGODto>> violations = validator.validate(ngo);
		assertTrue(!violations.isEmpty());
	}
	
	@Test
	public void testNGOPasswordMaxthirty() throws Exception{
		NGODto ngo = MasterData.getNGOForTesting();
		String ngoPassword = "";
		for (int i = 0; i < 120; i++) {
			ngoPassword.concat("A");
		}
		ngo.setNgoName(ngoPassword);
		Set<ConstraintViolation<NGODto>> violations = validator.validate(ngo);
		assertTrue(!violations.isEmpty());
	}
}
