package com.DonationManagement.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.DonationManagement.Dto.DonationsDto;
import com.DonationManagement.Dto.Donor_DonationsDto;
import com.DonationManagement.Service.DonationServiceImpl;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController()
@RequestMapping("/donations")
public class DonationsController {

	@Autowired
	private DonationServiceImpl donationServiceImpl;
	
	@PostMapping("/add-donation")
	public DonationsDto addDonation(@RequestBody DonationsDto donation ) {
		return donationServiceImpl.addDonation(donation);
	}
	
	@GetMapping("/by-id/{donorId}")
	public List<Donor_DonationsDto> getDonationsPerDoner(@PathVariable int donorId){
		return donationServiceImpl.getDonationsPerDoner(donorId);
	}
	
}
