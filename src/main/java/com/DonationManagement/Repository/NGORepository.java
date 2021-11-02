package com.DonationManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DonationManagement.Dto.NGODto;

public interface NGORepository extends JpaRepository<NGODto, Integer>{

}
