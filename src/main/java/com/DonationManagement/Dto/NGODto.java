package com.DonationManagement.Dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Length;

@Entity
public class NGODto {
	
	@Id
	private int id;
	@NotNull
	@Length(min = 5, max = 30)
	private String ngoName;
	@NotNull
	@Length(min = 5, max = 30)
	private String ngoUsername;
	@NotNull
	@Length(min = 5, max = 30)
	private String ngoPassword;
	@Email
	@Email(message = "Email should be valid")
	private String ngoEmail;
	@NotNull
	@Digits(integer=10, fraction=0)
	private Long ngoNumber;
	@NotNull
	@Length(min = 5, max = 100)
	private String ngoAddress;
	//private LocalDate estab_date;
	
	public NGODto(int id, @NotNull @Length(min = 5, max = 30) String ngo_name,
			@NotNull @Length(min = 5, max = 30) String ngo_username,
			@NotNull @Length(min = 5, max = 30) String ngo_password,
			@Email @Email(message = "Email should be valid") String ngo_email,
			@NotNull @Digits(integer = 10, fraction = 0) Long ngo_number,
			@NotNull @Length(min = 5, max = 100) String ngo_address) {
		super();
		this.id = id;
		this.ngoName = ngo_name;
		this.ngoUsername = ngo_username;
		this.ngoPassword = ngo_password;
		this.ngoEmail = ngo_email;
		this.ngoNumber = ngo_number;
		this.ngoAddress = ngo_address;
	}
	
	public NGODto() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNgoName() {
		return ngoName;
	}

	public void setNgoName(String ngoName) {
		this.ngoName = ngoName;
	}

	public String getNgoUsername() {
		return ngoUsername;
	}

	public void setNgoUsername(String ngoUsername) {
		this.ngoUsername = ngoUsername;
	}

	public String getNgoPassword() {
		return ngoPassword;
	}

	public void setNgoPassword(String ngoPassword) {
		this.ngoPassword = ngoPassword;
	}

	public String getNgoEmail() {
		return ngoEmail;
	}

	public void setNgoEmail(String ngoEmail) {
		this.ngoEmail = ngoEmail;
	}

	public Long getNgoNumber() {
		return ngoNumber;
	}

	public void setNgoNumber(Long ngoNumber) {
		this.ngoNumber = ngoNumber;
	}

	public String getNgoAddress() {
		return ngoAddress;
	}

	public void setNgoAddress(String ngoAddress) {
		this.ngoAddress = ngoAddress;
	};
	
}
