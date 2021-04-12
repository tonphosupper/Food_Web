package com.springboot.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dondathang")
public class Dondathang {
	@Id
	//@Column(name = "SOHOADON")
	private long sohoadon;
	//@Column(name = "MAKHACHHANG")
	private long makhachhang;
	//@Column(name = "MANHANVIEN")
	private long manhanvien;
	//@Column(name = "NGAYDATHANG")
	private Date ngaydathang;
	//@Column(name = "NGAYGIAOHANG")
	private Date ngaygiaohang;
	//@Column(name = "NGAYCHUYENHANG")
	private Date ngaychuyenhang;
	//@Column(name = "NOIGIAOHANG")
	private String noigiaohang;

	public Dondathang() {
		super();
	}

	public Dondathang(long makhachhang, long manhanvien, Date ngaydathang, Date ngaygiaohang, Date ngaychuyenhang,
			String noigiaohang) {
		super();
		this.makhachhang = makhachhang;
		this.manhanvien = manhanvien;
		this.ngaydathang = ngaydathang;
		this.ngaygiaohang = ngaygiaohang;
		this.ngaychuyenhang = ngaychuyenhang;
		this.noigiaohang = noigiaohang;
	}

	public long getSohoadon() {
		return sohoadon;
	}

	public void setSohoadon(long sohoadon) {
		this.sohoadon = sohoadon;
	}

	public long getMakhachhang() {
		return makhachhang;
	}

	public void setMakhachhang(long makhachhang) {
		this.makhachhang = makhachhang;
	}

	public long getManhanvien() {
		return manhanvien;
	}

	public void setManhanvien(long manhanvien) {
		this.manhanvien = manhanvien;
	}

	public Date getNgaydathang() {
		return ngaydathang;
	}

	public void setNgaydathang(Date ngaydathang) {
		this.ngaydathang = ngaydathang;
	}

	public Date getNgaygiaohang() {
		return ngaygiaohang;
	}

	public void setNgaygiaohang(Date ngaygiaohang) {
		this.ngaygiaohang = ngaygiaohang;
	}

	public Date getNgaychuyenhang() {
		return ngaychuyenhang;
	}

	public void setNgaychuyenhang(Date ngaychuyenhang) {
		this.ngaychuyenhang = ngaychuyenhang;
	}

	public String getNoigiaohang() {
		return noigiaohang;
	}

	public void setNoigiaohang(String noigiaohang) {
		this.noigiaohang = noigiaohang;
	}

}
