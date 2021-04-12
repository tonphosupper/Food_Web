package com.springboot.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mathang")
public class Mathang {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long mahang;
	private String tenhang;
	private long macongty;
	private long maloaihang;
	private long soluong;
	private String donvitinh;
	private double giahang;

	public Mathang() {
		super();
	}

	public Mathang(String tenhang, long macongty, long maloaihang, long soluong, String donvitinh, double giahang) {
		super();
		this.tenhang = tenhang;
		this.macongty = macongty;
		this.maloaihang = maloaihang;
		this.soluong = soluong;
		this.donvitinh = donvitinh;
		this.giahang = giahang;
	}

	public String getTenhang() {
		return tenhang;
	}

	public void setTenhang(String tenhang) {
		this.tenhang = tenhang;
	}

	public long getMacongty() {
		return macongty;
	}

	public void setMacongty(long macongty) {
		this.macongty = macongty;
	}

	public long getMaloaihang() {
		return maloaihang;
	}

	public void setMaloaihang(long maloaihang) {
		this.maloaihang = maloaihang;
	}

	public long getSoluong() {
		return soluong;
	}

	public void setSoluong(long soluong) {
		this.soluong = soluong;
	}

	public String getDonvitinh() {
		return donvitinh;
	}

	public void setDonvitinh(String donvitinh) {
		this.donvitinh = donvitinh;
	}

	public double getGiahang() {
		return giahang;
	}

	public void setGiahan(double giahang) {
		this.giahang = giahang;
	}

	public long getMahang() {
		return mahang;
	}
}
