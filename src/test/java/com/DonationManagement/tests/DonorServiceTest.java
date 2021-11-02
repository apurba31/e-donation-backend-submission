package com.DonationManagement.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import com.DonationManagement.Dto.DonorDto;
import com.DonationManagement.Dto.NGODto;
import com.DonationManagement.Exceptions.NGONotFoundException;
import com.DonationManagement.Repository.DonationsRepository;
import com.DonationManagement.Repository.DonorRepository;
import com.DonationManagement.Repository.NGORepository;
import com.DonationManagement.Service.DonorServiceImpl;
import com.DonationManagement.Service.NGOServiceImpl;
import com.DonationManagement.testUtils.MasterData;

@WebMvcTest(DonorServiceImpl.class)
@AutoConfigureMockMvc
public class DonorServiceTest {

	@Autowired
	DonorServiceImpl donorService;
	
	@MockBean
	NGORepository ngoRepository;
	@MockBean
	DonorRepository donorRepository;
	@MockBean
	DonationsRepository donationRepository;
	
	@Test
	public void testRegisterDonorService() {
		
		DonorDto donor = MasterData.getDonor();
		int id = donor.getDonatedNgoId();
		Optional<NGODto> ngo = MasterData.getOptionalNGO();
		
		when(this.ngoRepository.findById(id)).thenReturn(ngo);
		when(this.donorRepository.save(donor)).thenReturn(donor);
		
		DonorDto donorActual = donorService.registerDonor(donor);
		
		assertEquals(donor, donorActual);
		
	}
	
	@Test
	public void testGetDonorsPerNGO() {
		
		List<DonorDto> donors = MasterData.getDonorList();
		int id = 1;
		
		Optional<NGODto> ngo = MasterData.getOptionalNGO();
		
		when(this.ngoRepository.findById(id)).thenReturn(ngo);
		when(this.donorRepository.getDonorPerNGO(id)).thenReturn(donors);
		
		List<DonorDto> donorActual = donorService.getDonorPerNGO(id);
		
		assertEquals(donors, donorActual);
		
	}
	
}
