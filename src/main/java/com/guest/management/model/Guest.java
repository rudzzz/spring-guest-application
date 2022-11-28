package com.guest.management.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "TB_GUESTS")
public class Guest implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Integer guestQuantity;
	
	public Guest() {
		
	}
	
	public Guest(Long id, String name, Integer guestQuantity) {
		this.id = id;
		this.name = name;
		this.guestQuantity = guestQuantity;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getGuestQuantity() {
		return guestQuantity;
	}
	public void setGuestQuantity(Integer guestQuantity) {
		this.guestQuantity = guestQuantity;
	}
	
}
