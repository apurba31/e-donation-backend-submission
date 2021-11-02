package com.DonationManagement.Dto;

import javax.persistence.Id;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class Donor_DonationsDto {

	private int donationId;
	private int donorId;
	private int ngoId;
	private String donationType;
	private long amount;
	
	private String donorname;
	private String donorUsername;
	private String donorPassword;
	private String donorEmail;
	private Long donorNumber;
	private String donorAddress;
	
	public Donor_DonationsDto(){
		
	}
	
	public Donor_DonationsDto(int donation_id, int donor_id, int ngo_id, String donation_type, long amount,
			String donor_name, String donor_username, String donor_password, String donor_email, Long donor_number,
			String donor_address) {
		super();
		this.donationId = donation_id;
		this.donorId = donor_id;
		this.ngoId = ngo_id;
		this.donationType = donation_type;
		this.amount = amount;
		this.donorname = donor_name;
		this.donorUsername = donor_username;
		this.donorPassword = donor_password;
		this.donorEmail = donor_email;
		this.donorNumber = donor_number;
		this.donorAddress = donor_address;
	}
	
	public int getDonationId() {
		return donationId;
	}
	public void setDonationId(int donation_id) {
		this.donationId = donation_id;
	}
	public int getDonorId() {
		return donorId;
	}
	public void setDonorId(int donor_id) {
		this.donorId = donor_id;
	}
	public int getNgoId() {
		return ngoId;
	}
	public void setNgoId(int ngo_id) {
		this.ngoId = ngo_id;
	}
	public String getDonationType() {
		return donationType;
	}
	public void setDonationType(String donation_type) {
		this.donationType = donation_type;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public String getDonorname() {
		return donorname;
	}
	public void setDonorname(String donor_name) {
		this.donorname = donor_name;
	}
	public String getDonorUsername() {
		return donorUsername;
	}
	public void setDonorUsername(String donor_username) {
		this.donorUsername = donor_username;
	}
	public String getDonorPassword() {
		return donorPassword;
	}
	public void setDonorPassword(String donor_password) {
		this.donorPassword = donor_password;
	}
	public String getDonorEmail() {
		return donorEmail;
	}
	public void setDonorEmail(String donor_email) {
		this.donorEmail = donor_email;
	}
	public Long getDonorNumber() {
		return donorNumber;
	}
	public void setDonorNumber(Long donor_number) {
		this.donorNumber = donor_number;
	}
	public String getDonorAddress() {
		return donorAddress;
	}
	public void setDonorAddress(String donor_address) {
		this.donorAddress = donor_address;
	}
	
}
