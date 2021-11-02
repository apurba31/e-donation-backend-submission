package com.DonationManagement.testUtils;

import static org.mockito.Mockito.RETURNS_DEEP_STUBS;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import com.DonationManagement.Dto.DonationsDto;
import com.DonationManagement.Dto.DonorDto;
import com.DonationManagement.Dto.Donor_DonationsDto;
import com.DonationManagement.Dto.NGODto;
import com.fasterxml.jackson.databind.ObjectMapper;


public class MasterData {
	
	public static DonationsDto getDonations() {
		DonationsDto donations = new DonationsDto();
		donations.setDonorId(1);
		donations.setNgoId(1);
		donations.setId(1);
		donations.setAmount(1L);
		donations.setDonationType("Depression");
		return donations;
	}
	
	public static DonorDto getDonors() {
		DonorDto donors = new DonorDto();
		donors.setId(1);
		donors.setName("Scofield");
		donors.setNumber(1L);
		donors.setPassword("Password");
		donors.setUsername("Test");
		donors.setEmail("Scofield@gmail.com");
		donors.setDonatedNgoId(1);
		donors.setAddress("Hyderabad");
		return donors;
	}
	
	public static NGODto getNGOForTesting() {
		NGODto ngo = new NGODto();
		ngo.setNgoAddress("Hyderabad");
		ngo.setNgoEmail("Scofield@gmail.com");
		ngo.setNgoName("Apurba");
		ngo.setNgoNumber(1L);
		ngo.setNgoUsername("Apurba");
		ngo.setNgoPassword("Test");
		ngo.setNgoAddress("Hyderabad");
		return ngo;
	}
	
	//NGO Data---------------------------------------
	
	public static List<NGODto> getNGOList(){
		List<NGODto> ngos = new ArrayList<NGODto>();
		NGODto ngo1 = new NGODto(1, "MR Robot Depression", "elliot@123", "ElliotPassword", "elliot@gmail.com", 9988232323L, "Hyderabad");
		NGODto ngo2 = new NGODto(2, "Mr Soprano Personality Disorder NGO", "TonySoprano@123", "TonyPassword", "Tony@gmail.com", 9988232323L, "Hyderabad");
		ngos.add(ngo1);
		ngos.add(ngo2);
		
		return ngos;
		
	}
	
	public static NGODto getNGO(){
		
		NGODto ngo = new NGODto(1, "MR Robot Depression", "elliot@123", "ElliotPassword", "elliot@gmail.com", 9988232323L, "Hyderabad");
		return ngo;
		
	}
	
	public static Optional<NGODto> getOptionalNGO() {
		
		NGODto ngo = new NGODto(1, "MR Robot Depression", "elliot@123", "ElliotPassword", "elliot@gmail.com", 9988232323L, "Hyderabad");
		Optional<NGODto> userOptional = Optional.of(ngo);
		return userOptional;
		
	}
	
	
	//DonorDto Data------------------------------------
	
	public static DonorDto getDonor(){
		
		DonorDto donor = new DonorDto(1, 1, "Apurba Kumar", "Apurba@311", "Test@123", "apurbakumar@gmail.com", 9988232323L, "Hyderabad");
		return donor;
		
	}
	
	public static List<DonorDto> getDonorList() {
		
		DonorDto d1 = new DonorDto(1, 1, "Apurba Kumar", "Apurba@311", "Test@123", "apurbakumar@gmail.com", 9988232323L, "Hyderabad");
		DonorDto d2= new DonorDto(2, 1, "Michael Scofield", "Scofield@123", "Test@456", "michaelScofield@gmail.com", 9988232311L, "Hyderabad");
		
		List<DonorDto> donors = new ArrayList<DonorDto>();
		donors.add(d1);
		donors.add(d2);
		
		return donors;
	}
	
	
	// Donations Data---------------------------------
	
	
	
	public static DonationsDto getDonation() {
		
		DonationsDto donation = new DonationsDto(1, 1, 1, "Annual", 5000L);
		return donation;
	}
	
	
	public static List<Donor_DonationsDto> getDonationPerDonor() {
		
		Donor_DonationsDto d1 = new Donor_DonationsDto(1, 1, 1, "Annual", 50000L,"Apurba Kumar", "Apurba@123", "Test@123", "apurbak@gmail.com", 9988232323L, "Hyderabad");
		Donor_DonationsDto d2 = new Donor_DonationsDto(1, 1, 1, "Half Yearly", 80000L,"Apurba Kumar", "Apurba@123", "Test@123", "apurbak@gmail.com", 9988232323L, "Hyderabad");
		
		List<Donor_DonationsDto> donations = new ArrayList<Donor_DonationsDto>();
		donations.add(d1);
		donations.add(d2);
		
		return donations;
		
	}
	
	public static Optional<DonorDto> getDonorOptional() {
		
		DonorDto d = new DonorDto(2, 1, "Michael Scofield", "Scofield@123", "Test@456", "michaelScofield@gmail.com", 9988232311L, "Hyderabad");
		Optional<DonorDto> userOptional = Optional.of(d);
		return userOptional;
		
	}
	
	public static List<DonationsDto> getDonationsList() {
		
		DonationsDto d1 = new DonationsDto(1, 1, 1, "Annual", 50000L);
		DonationsDto d2 = new DonationsDto(1, 1, 1, "Half Yearly", 80000L);
		List<DonationsDto> donations = new ArrayList<DonationsDto>();
		donations.add(d1);
		donations.add(d2);
		return donations;
		
	}
	
	
	public static String asJsonString(final Object obj) {
		try {
			final ObjectMapper mapper = new ObjectMapper();
			final String jsonContent = mapper.writeValueAsString(obj);
			return jsonContent;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
}
