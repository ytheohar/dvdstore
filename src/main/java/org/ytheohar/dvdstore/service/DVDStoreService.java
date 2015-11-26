package org.ytheohar.dvdstore.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ytheohar.dvdstore.domain.Customer;
import org.ytheohar.dvdstore.repository.DVDStoreRepository;

@Service
public class DVDStoreService {

	private final DVDStoreRepository repo;

	@Autowired
	public DVDStoreService(DVDStoreRepository repo) {
		this.repo = repo;
	}

	public List<Customer> report1(short age, String gender, int income, String country) {
		List<Customer> customers = repo.findByAgeAndGenderAndIncomeAndCountry(age, gender, income,
				country);
		return customers.stream().filter(c -> !c.getOrders().isEmpty())
				.collect(Collectors.toList());
	}

	public List<Customer> report2(short age, String gender, int income, String country) {
		return repo.findByAgeAndGenderAndIncomeAndCountryJoin(age, gender, income, country);
	}

	public List<Customer> report3(short age, String gender, int income, String country) {
		return repo.findByAgeAndGenderAndIncomeAndCountryFetchJoin(age, gender, income, country);
	}
}
