
package com.example.demo.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.VendorDetails;

@RestController()
@RequestMapping("/details")


public class CloudVendorAPIService {
	VendorDetails vendordetails;
	@GetMapping("{VendorId}")
	public VendorDetails getVendorDetails(String VendorId) {
		//return vendordetails;
		return new VendorDetails ("C1","ccc","bbb","4566");
		
	}
	@PostMapping
	public String PostVendorDetails(@RequestBody VendorDetails vendordetails) {
		this.vendordetails=vendordetails;
		return "Cloud vendor added Succesfully";
	}
	@PutMapping
	public String putVendorDetails(@RequestBody VendorDetails vendordetails) {
		this.vendordetails=vendordetails;
		return "Cloud vendor updated Succesfully";
	}
	@DeleteMapping("{VendorId}")
	public String deleteVendorDetails(String VendorId) {
		this.vendordetails=null;
		return "deleted Succesfully";
	}
}
