package com.springboot.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nhanvien")
public class Nhanvien {
	@Id
	private long manhanvien;
	//@Column(name = "HO")
	private String ho;
	//@Column(name = "TEN")
	private String ten;
	//@Column(name = "NGAYSINH")
	private Date ngaysinh;
	//@Column(name = "NGAYLAMVIEC")
	private Date ngaylamviec;
	//@Column(name = "DIACHI")
	private String diachi;
	//@Column(name = "DIENTHOAI")
	private String dienthoai;
	//@Column(name = "LUONGCOBAN")
	private double luongcoban;
	//@Column(name = "PHUCAP")
	private double phucap;

	public Nhanvien() {
		super();
	}

	public Nhanvien(long manhanvien, String ho, String ten, Date ngaysinh, Date ngaylamviec, String diachi,
			String dienthoai, double luongcoban, double phucap) {
		super();
		this.manhanvien = manhanvien;
		this.ho = ho;
		this.ten = ten;
		this.ngaysinh = ngaysinh;
		this.ngaylamviec = ngaylamviec;
		this.diachi = diachi;
		this.dienthoai = dienthoai;
		this.luongcoban = luongcoban;
		this.phucap = phucap;
	}

	public long getManhanvien() {
		return manhanvien;
	}

	public void setManhanvien(long manhanvien) {
		this.manhanvien = manhanvien;
	}

	public String getHo() {
		return ho;
	}

	public void setHo(String ho) {
		this.ho = ho;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public Date getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public Date getNgaylamviec() {
		return ngaylamviec;
	}

	public void setNgaylamviec(Date ngaylamviec) {
		this.ngaylamviec = ngaylamviec;
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

	public double getLuongcoban() {
		return luongcoban;
	}

	public void setLuongcoban(double luongcoban) {
		this.luongcoban = luongcoban;
	}

	public double getPhucap() {
		return phucap;
	}

	public void setPhucap(double phucap) {
		this.phucap = phucap;
	}

}
