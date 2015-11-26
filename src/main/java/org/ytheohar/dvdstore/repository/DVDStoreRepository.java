package org.ytheohar.dvdstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.ytheohar.dvdstore.domain.Customer;

public interface DVDStoreRepository extends Repository<Customer, Long> {

	List<Customer> findByAgeAndGenderAndIncomeAndCountry(short age, String gender, int income,
			String country);

	@Query("select distinct c FROM Customer c JOIN c.orders o WHERE c.age= :age AND c.gender= :gender AND c.income=:income AND c.country=:country")
	List<Customer> findByAgeAndGenderAndIncomeAndCountryJoin(@Param("age") short age,
			@Param("gender") String gender, @Param("income") int income,
			@Param("country") String country);

	@Query("select distinct c FROM Customer c JOIN FETCH c.orders o WHERE c.age= :age AND c.gender= :gender AND c.income=:income AND c.country=:country")
	List<Customer> findByAgeAndGenderAndIncomeAndCountryFetchJoin(@Param("age") short age,
			@Param("gender") String gender, @Param("income") int income,
			@Param("country") String country);

}
