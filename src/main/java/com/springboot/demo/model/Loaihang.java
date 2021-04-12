package com.springboot.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loaihang")
public class Loaihang {
	@Id
	//@Column(name = "MALOAIHANG")
	private long maloai;
	//@Column(name = "TENLOAIHANG")
	private String tenloai;

	public Loaihang() {
		super();
	}

	public Loaihang(long maloai, String tenloai) {
		super();
		this.maloai = maloai;
		this.tenloai = tenloai;
	}

	public long getMaloai() {
		return maloai;
	}

	public void setMaloai(long maloai) {
		this.maloai = maloai;
	}

	public String getTenloai() {
		return tenloai;
	}

	public void setTenloai(String tenloai) {
		this.tenloai = tenloai;
	}

}
