package com.DonationManagement.Repository;

import java.util.List;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import com.DonationManagement.Dto.DonationsDto;
import com.DonationManagement.Dto.DonorDto;

public interface DonationsRepository extends JpaRepository<DonationsDto, Integer>{

	@Query("select d from DONATIONS d where d.donorId = ?1")
	List<DonationsDto> getDonationsPerDoner(int donorId);

}