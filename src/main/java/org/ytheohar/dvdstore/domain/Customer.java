package org.ytheohar.dvdstore.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "customers")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customerid", nullable = false)
	private int id;

	@Column(nullable = false)
	private String firstname;

	@Column(nullable = false)
	private String lastname;

	@Column(nullable = false)
	private String address1;

	@Column(nullable = true)
	private String address2;

	@Column(nullable = false)
	private String city;

	@Column(nullable = true)
	private String state;

	@Column(nullable = true)
	private String zip;

	@Column(nullable = false)
	private String country;

	@Column(nullable = false)
	private short region;

	@Column(nullable = true)
	private String email;

	@Column(nullable = true)
	private String phone;

	@Column(nullable = false)
	private int creditcardtype;

	@Column(nullable = false)
	private String creditcard;

	@Column(nullable = false)
	private String creditcardexpiration;

	@Column(nullable = false)
	private String username;

	@Column(nullable = false)
	private String password;

	@Column(nullable = true)
	private short age;

	@Column(nullable = false)
	private int income;

	@Column(nullable = false)
	private String gender;

	@OneToMany(mappedBy = "customer", targetEntity = Order.class, fetch = FetchType.LAZY)
	@JsonManagedReference
	private List<Order> orders;

	protected Customer() {
	}

	public int getId() {
		return id;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getAddress1() {
		return address1;
	}

	public String getAddress2() {
		return address2;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZip() {
		return zip;
	}

	public String getCountry() {
		return country;
	}

	public short getRegion() {
		return region;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public int getCreditcardtype() {
		return creditcardtype;
	}

	public String getCreditcard() {
		return creditcard;
	}

	public String getCreditcardexpiration() {
		return creditcardexpiration;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public short getAge() {
		return age;
	}

	public int getIncome() {
		return income;
	}

	public String getGender() {
		return gender;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setRegion(short region) {
		this.region = region;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setCreditcardtype(int creditcardtype) {
		this.creditcardtype = creditcardtype;
	}

	public void setCreditcard(String creditcard) {
		this.creditcard = creditcard;
	}

	public void setCreditcardexpiration(String creditcardexpiration) {
		this.creditcardexpiration = creditcardexpiration;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setAge(short age) {
		this.age = age;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

}
