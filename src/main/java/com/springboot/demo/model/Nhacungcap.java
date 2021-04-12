package com.springboot.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nhacungcap")
public class Nhacungcap {
	@Id
	//@Column(name = "macongty")
	private long macongty;
	//@Column(name = "TENCONGTY")
	private String tencongty;
	//@Column(name = "TENGIAODICH")
	private String tengiaodich;
	//@Column(name = "DIACHI")
	private String diachi;
	//@Column(name = "DIENTHOAI")
	private String dienthoai;
	//@Column(name = "EMAIL")
	private String email;

	public Nhacungcap() {
		super();
	}

	public Nhacungcap(long macongty, String tencongty, String tengiaodich, String diachi, String dienthoai,
			String email) {
		super();
		this.macongty = macongty;
		this.tencongty = tencongty;
		this.tengiaodich = tengiaodich;
		this.diachi = diachi;
		this.dienthoai = dienthoai;
		this.email = email;
	}

	public long getMacongty() {
		return macongty;
	}

	public void setMacongty(long macongty) {
		this.macongty = macongty;
	}

	public String getTencongty() {
		return tencongty;
	}

	public void setTencongty(String tencongty) {
		this.tencongty = tencongty;
	}

	public String getTengiaodich() {
		return tengiaodich;
	}

	public void setTengiaodich(String tengiaodich) {
		this.tengiaodich = tengiaodich;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getDienthoai() {
		return dienthoai;
	}

	public void setDienthoai(String dienthoai) {
		this.dienthoai = dienthoai;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
