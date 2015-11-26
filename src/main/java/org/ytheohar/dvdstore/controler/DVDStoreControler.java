package org.ytheohar.dvdstore.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ytheohar.dvdstore.domain.Customer;
import org.ytheohar.dvdstore.service.DVDStoreService;

@RestController
public class DVDStoreControler {

	private final DVDStoreService service;

	@Autowired
	public DVDStoreControler(DVDStoreService service) {
		this.service = service;
	}

	@RequestMapping("/report1/{age}/{gender}/{income}/{country}")
	public List<Customer> report1(@PathVariable short age, @PathVariable String gender,
			@PathVariable int income, @PathVariable String country) {
		return service.report1(age, gender, income, country);
	}

	@RequestMapping("/report2/{age}/{gender}/{income}/{country}")
	public List<Customer> report2(@PathVariable short age, @PathVariable String gender,
			@PathVariable int income, @PathVariable String country) {
		return service.report2(age, gender, income, country);
	}

	@RequestMapping("/report3/{age}/{gender}/{income}/{country}")
	public List<Customer> report3(@PathVariable short age, @PathVariable String gender,
			@PathVariable int income, @PathVariable String country) {
		return service.report3(age, gender, income, country);
	}
}
