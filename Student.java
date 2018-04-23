package qlysv;

import java.util.Scanner;


public class Student{
	public String sbd, hoten, dchi, uutien;
	public String khoi;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String sbd, String hoten, String dchi, String uutien, String khoi) {
		super();
		this.sbd = sbd;
		this.hoten = hoten;
		this.dchi = dchi;
		this.uutien = uutien;
		this.khoi = khoi;
	}
	public String getSbd() {
		return sbd;
	}
	public void setSbd(String sbd) {
		this.sbd = sbd;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getDchi() {
		return dchi;
	}
	public void setDchi(String dchi) {
		this.dchi = dchi;
	}
	public String getUutien() {
		return uutien;
	}
	public void setUutien(String uutien) {
		this.uutien = uutien;
	}
	public String getKhoi() {
		return khoi;
	}
	public void setKhoi(String khoi) {
		this.khoi = khoi;
	}

}
