package com.DonationManagement.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.DonationManagement.Dto.DonorDto;
import com.DonationManagement.Dto.NGODto;
import com.DonationManagement.Service.DonorServiceImpl;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController()
@RequestMapping("/donors")
public class DonorController {

	@Autowired
	private DonorServiceImpl donorServiceImpl; 
	
	
	@PostMapping("/register-donor")
	public DonorDto registerDonor(@RequestBody DonorDto donor) {
		 return donorServiceImpl.registerDonor(donor);
		 
	}
	
	@GetMapping("/by-ngo-id/{ngoId}")
	public List<DonorDto> getDonorPerNGO(@PathVariable int ngoId){
		return donorServiceImpl.getDonorPerNGO(ngoId);
	}
	
	@PutMapping("/update-donor")
	public DonorDto updateDonor(@RequestBody DonorDto donor) {
		return donorServiceImpl.updateDonor(donor);
	}
}
