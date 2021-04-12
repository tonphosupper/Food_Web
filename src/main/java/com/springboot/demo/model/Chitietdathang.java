package com.springboot.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "chitietdathang")
public class Chitietdathang {
	@Id
	//@Column(name = "SOHOADON")
	private long sohoadon;
	//@Id
	//@Column(name = "MAHANG")
	private long mahang;
	//@Column(name = "GIABAN")
	private double giaban;
	//@Column(name = "SOLUONG")
	private long soluong;
	//@Column(name = "MUCGIAMGIA")
	private double mucgiamgia;

	public Chitietdathang() {
		super();
	}

	public Chitietdathang(long sohoadon, long mahang, double giaban, long soluong, double mucgiamgia) {
		super();
		this.sohoadon = sohoadon;
		this.mahang = mahang;
		this.giaban = giaban;
		this.soluong = soluong;
		this.mucgiamgia = mucgiamgia;
	}

	public long getSohoadon() {
		return sohoadon;
	}

	public void setSohoadon(long sohoadon) {
		this.sohoadon = sohoadon;
	}

	public long getMahang() {
		return mahang;
	}

	public void setMahang(long mahang) {
		this.mahang = mahang;
	}

	public double getGiaban() {
		return giaban;
	}

	public void setGiaban(double giaban) {
		this.giaban = giaban;
	}

	public long getSoluong() {
		return soluong;
	}

	public void setSoluong(long soluong) {
		this.soluong = soluong;
	}

	public double getMucgiamgia() {
		return mucgiamgia;
	}

	public void setMucgiamgia(double mucgiamgia) {
		this.mucgiamgia = mucgiamgia;
	}

}
