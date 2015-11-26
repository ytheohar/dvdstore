package org.ytheohar.dvdstore.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "prod_id", nullable = false)
	private int id;

	@Column(nullable = false)
	private short category;

	@Column(nullable = false)
	private String title;

	@Column(nullable = false)
	private String actor;

	@Column(nullable = false)
	private BigDecimal price;

	@Column(nullable = false)
	private short special;

	@Column(name = "common_prod_id", nullable = false)
	private int commonId;

	protected Product() {
	}

	public Product(int id, short category, String title, String actor, BigDecimal price,
			short special, int commonId) {
		this.id = id;
		this.category = category;
		this.title = title;
		this.actor = actor;
		this.price = price;
		this.special = special;
		this.commonId = commonId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public short getCategory() {
		return category;
	}

	public void setCategory(short category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public short getSpecial() {
		return special;
	}

	public void setSpecial(short special) {
		this.special = special;
	}

	public int getCommonId() {
		return commonId;
	}

	public void setCommonId(int commonId) {
		this.commonId = commonId;
	}

}
