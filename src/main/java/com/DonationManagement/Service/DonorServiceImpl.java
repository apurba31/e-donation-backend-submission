package com.DonationManagement.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DonationManagement.Dto.DonorDto;
import com.DonationManagement.Dto.NGODto;
import com.DonationManagement.Exceptions.DonorNotFoundException;
import com.DonationManagement.Exceptions.NGONotFoundException;
import com.DonationManagement.Repository.DonorRepository;
import com.DonationManagement.Repository.NGORepository;


@Service
public class DonorServiceImpl {

	@Autowired
	private DonorRepository donorRepository;
	
	@Autowired
	private NGORepository ngoRepository;
	
	public DonorDto registerDonor(DonorDto donor) {
		
		int ngo_id = donor.getDonatedNgoId();
		Optional<NGODto> ngo = ngoRepository.findById(ngo_id);
		
		if(ngo.empty()==null) {
			throw new NGONotFoundException("NGO Not Found With NGO Id: " + ngo_id);
		}else {
			return donorRepository.save(donor);
		}
		
		 
	}

	public List<DonorDto> getDonorPerNGO(int ngoId) {
		
		Optional<NGODto> ngo = ngoRepository.findById(ngoId);
		if(ngo.empty()==null) {
			throw new NGONotFoundException("NGO Not Found With NGO Id: " + ngoId);
		}else{
			return donorRepository.getDonorPerNGO(ngoId);
		}
		
		
	}

	public DonorDto updateDonor(DonorDto donor) {
		
		int id = donor.getId();
		int ngo_id = donor.getDonatedNgoId();
		
		DonorDto d = donorRepository.findById(id).get();
		Optional<NGODto> ngo = ngoRepository.findById(ngo_id);
		
		if(ngo.empty()==null) {
			throw new NGONotFoundException("NGO Not Found With NGO Id: " + ngo_id);
		}else {
			BeanUtils.copyProperties(donor, d);
			return donorRepository.save(d);
		}
		
	}

}

