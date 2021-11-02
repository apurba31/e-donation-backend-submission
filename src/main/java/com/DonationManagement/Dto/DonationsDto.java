package com.DonationManagement.Dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

@Entity(name = "DONATIONS")
public class DonationsDto {
	
	@Id
	private int id;
	@NotNull
	private int donorId;
	@NotNull
	private int ngoId;
	@NotNull
	@Length(min = 5, max = 100)
	private String donationType;
	@NotNull
	private long amount;
	
	public DonationsDto(int id, @NotNull int donorId, @NotNull int ngo_id,
			@NotNull @Length(min = 5, max = 100) String donationType, @NotNull long amount) {
		super();
		this.id = id;
		this.donorId = donorId;
		this.ngoId = ngo_id;
		this.donationType = donationType;
		this.amount = amount;
	}
	
	public DonationsDto() {};
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDonorId() {
		return donorId;
	}
	public void setDonorId(int donorId) {
		this.donorId = donorId;
	}
	public int getNgoId() {
		return ngoId;
	}
	public void setNgoId(int ngoId) {
		this.ngoId = ngoId;
	}
	public String getDonationType() {
		return donationType;
	}
	public void setDonationType(String donationType) {
		this.donationType = donationType;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (amount ^ (amount >>> 32));
		result = prime * result + ((donationType == null) ? 0 : donationType.hashCode());
		result = prime * result + donorId;
		result = prime * result + id;
		result = prime * result + ngoId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DonationsDto other = (DonationsDto) obj;
		if (amount != other.amount)
			return false;
		if (donationType == null) {
			if (other.donationType != null)
				return false;
		} else if (!donationType.equals(other.donationType))
			return false;
		if (donorId != other.donorId)
			return false;
		if (id != other.id)
			return false;
		if (ngoId != other.ngoId)
			return false;
		return true;
	}	
	
//	public boolean equals(Object object) {
//	      if(object == null) {
//	          return false;
//	      } 
//	      if(this == object) {
//	          return true;
//	      }
//	      Department otherDepartment = (Department) object;
//	      if(this.getDepId() == otherDepartment.getDepId()) {
//	          return true;
//	      } else {
//	          return false;
//	      }
//	}
	
}
