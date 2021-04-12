package com.springboot.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "khachhang")
public class Khachhang {
	@Id
	//@Column(name = "MAKHACHHANG")
	private Long makhachhang;
	//@Column(name = "TENCONGTY")
	private String tencongty;
	//@Column(name = "TENKHACHHANG")
	private String tenkhachhang;
	//@Column(name = "DIACHI")
	private String diachi;
	//@Column(name = "EMAIL")
	private String email;
	//@Column(name = "DIENTHOAI")
	private String dienthoai;

	public Khachhang() {
	}

	public Khachhang(String tencongty, String tenkhachhang, String diachi, String email, String dienthoai) {
		super();
		this.tencongty = tencongty;
		this.tenkhachhang = tenkhachhang;
		this.diachi = diachi;
		this.email = email;
		this.dienthoai = dienthoai;
	}

	public String getTencongty() {
		return tencongty;
	}

	public void setTencongty(String tencongty) {
		this.tencongty = tencongty;
	}

	public String getTenkhachhang() {
		return tenkhachhang;
	}

	public void setTenkhachhang(String tenkhachhang) {
		this.tenkhachhang = tenkhachhang;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDienthoai() {
		return dienthoai;
	}

	public void setDienthoai(String dienthoai) {
		this.dienthoai = dienthoai;
	}

	public void setMakhachhang(Long makhachhang) {
		this.makhachhang = makhachhang;
	}

}
