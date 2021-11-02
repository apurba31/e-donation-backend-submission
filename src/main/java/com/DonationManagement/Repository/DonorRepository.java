package com.DonationManagement.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.DonationManagement.Dto.DonorDto;

public interface DonorRepository extends JpaRepository<DonorDto, Integer> {

	@Query("select d from DONORDETAILS d where d.donatedNgoId = ?1")
	List<DonorDto> getDonorPerNGO(int ngoId);

}
