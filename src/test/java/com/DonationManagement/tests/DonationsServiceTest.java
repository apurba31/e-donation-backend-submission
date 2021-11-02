package com.DonationManagement.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import com.DonationManagement.Dto.DonationsDto;
import com.DonationManagement.Dto.DonorDto;
import com.DonationManagement.Dto.Donor_DonationsDto;
import com.DonationManagement.Dto.NGODto;
import com.DonationManagement.Exceptions.DonorNotFoundException;
import com.DonationManagement.Exceptions.NGONotFoundException;
import com.DonationManagement.Repository.DonationsRepository;
import com.DonationManagement.Repository.DonorRepository;
import com.DonationManagement.Repository.NGORepository;
import com.DonationManagement.Service.DonationServiceImpl;
import com.DonationManagement.Service.NGOServiceImpl;
import com.DonationManagement.testUtils.MasterData;

@WebMvcTest(DonationServiceImpl.class)
@AutoConfigureMockMvc
public class DonationsServiceTest {

	@Autowired
	DonationServiceImpl donationService;
	
	@MockBean
	NGORepository ngoRepository;
	@MockBean
	DonorRepository donorRepository;
	@MockBean
	DonationsRepository donationRepository;
	
	@Test
	public void testAddDonationService() {
	
		DonationsDto donations =MasterData.getDonation();
		int donorId = donations.getDonorId();
		int ngoId = donations.getNgoId();
		
		Optional<DonorDto> donor = MasterData.getDonorOptional();
		Optional<NGODto> ngo = MasterData.getOptionalNGO();
		
		when(this.donorRepository.findById(donorId)).thenReturn(donor);
		when(this.ngoRepository.findById(ngoId)).thenReturn(ngo);
		when(this.donationRepository.save(donations)).thenReturn(donations);
		
		DonationsDto donationActual = donationService.addDonation(donations);
		
		assertEquals(donations, donationActual);	
		
	}
}
