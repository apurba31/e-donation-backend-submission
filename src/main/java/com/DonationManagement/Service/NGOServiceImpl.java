package com.DonationManagement.Service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DonationManagement.Dto.NGODto;
import com.DonationManagement.Repository.NGORepository;


@Service
public class NGOServiceImpl {
	
	@Autowired
	private NGORepository ngoRepository;
	
	public NGODto addNGO(NGODto ngo) {
		return ngoRepository.save(ngo);
		
	}

	public List<NGODto> getAllNGOs() {
		
		List<NGODto> ngos = new ArrayList<>();
		ngoRepository.findAll().forEach(ngos::add);
		return ngos;
	}

}
