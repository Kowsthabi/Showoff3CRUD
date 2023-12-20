
package com.example.demo.Model;

public class VendorDetails {
	private String VendorId;
	private String VendorName;
	private String VendorAddress;
	private String VendorphoneNumber;
	public VendorDetails() {
		
	}
	public VendorDetails(String vendorId, String vendorName, String vendorAddress, String vendorphoneNumber) {
		super();
		VendorId = vendorId;
		VendorName = vendorName;
		VendorAddress = vendorAddress;
		VendorphoneNumber = vendorphoneNumber;
	}
	public String getVendorId() {
		return VendorId;
	}
	public void setVendorId(String vendorId) {
		VendorId = vendorId;
	}
	public String getVendorName() {
		return VendorName;
	}
	public void setVendorName(String vendorName) {
		VendorName = vendorName;
	}
	public String getVendorAddress() {
		return VendorAddress;
	}
	public void setVendorAddress(String vendorAddress) {
		VendorAddress = vendorAddress;
	}
	public String getVendorphoneNumber() {
		return VendorphoneNumber;
	}
	public void setVendorphoneNumber(String vendorphoneNumber) {
		VendorphoneNumber = vendorphoneNumber;
	}
	
	

}
