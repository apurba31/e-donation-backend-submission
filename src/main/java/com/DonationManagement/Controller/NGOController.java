package com.DonationManagement.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.DonationManagement.Dto.DonorDto;
import com.DonationManagement.Dto.NGODto;
import com.DonationManagement.Repository.DonorRepository;
import com.DonationManagement.Repository.NGORepository;
import com.DonationManagement.Service.DonorServiceImpl;
import com.DonationManagement.Service.NGOServiceImpl;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/NGO")
public class NGOController {
	
	@Autowired
	private NGOServiceImpl ngoServiceImpl; 
	
	
	@PostMapping("/add-NGO")
	public String addNGO(@RequestBody NGODto ngo) {
		ngoServiceImpl.addNGO(ngo);
		return "NGO Information Added!";
	}
	
	@RequestMapping("/NGO-list")
	public List<NGODto> getAllNGOs() {
		return ngoServiceImpl.getAllNGOs();
				}
}
