package org.ytheohar.dvdstore.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "orders")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "orderid", nullable = false)
	private int id;

	@Column(name = "orderdate", nullable = false, columnDefinition = "date")
	private Date date;

	@ManyToOne
	@JoinColumn(name = "customerid", referencedColumnName = "customerid")
	@JsonBackReference
	private Customer customer;

	@Column(nullable = false)
	private BigDecimal netamount;

	@Column(nullable = false)
	private BigDecimal tax;

	@Column(nullable = false)
	private BigDecimal totalamount;

	protected Order() {
	}

	public Order(int id, Date date, Customer customer, BigDecimal netamount, BigDecimal tax,
			BigDecimal totalamount) {
		this.id = id;
		this.date = date;
		this.customer = customer;
		this.netamount = netamount;
		this.tax = tax;
		this.totalamount = totalamount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public BigDecimal getNetamount() {
		return netamount;
	}

	public void setNetamount(BigDecimal netamount) {
		this.netamount = netamount;
	}

	public BigDecimal getTax() {
		return tax;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

	public BigDecimal getTotalamount() {
		return totalamount;
	}

	public void setTotalamount(BigDecimal totalamount) {
		this.totalamount = totalamount;
	}

}
