package qlysv;

import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		Scanner scInt = new Scanner(System.in);

		StudentTest stuTest = new StudentTest();

		int n = 0;
		int chon;
		Student[] std = null;

		do {
			System.out.println("Chon 1: De nhap n sinh vien");
			System.out.println("Chon 2: De hien thi thong tin sinh vien");
			System.out.println("Chon 3: De tim kiem sinh vien theo SBD");
			System.out.println("Chon 0: De ket thuc!");
			chon = scInt.nextInt();
			switch (chon) {
			case 1:
				System.out.println("Nhap so luong sinh vien:");
				n = scInt.nextInt();
				std = new Student[n];
				stuTest.input(std);
				break;
			case 2:
				int dem = 1;
				for (Student student : std) {
					System.out.println("Thong tin sinh vien thu "+dem);
					stuTest.showInfor(student);
					dem++;
					System.out.println("*******");
				}
				System.out.println("==========================");
				break;
			case 3:
				Student temp = new Student();
				temp = stuTest.searchStudent(std);
				if(temp!=null) {
					System.out.println("Tim thay sinh vien: ");
					stuTest.showInfor(temp);
				}else {
					System.out.println("Khong tim thay sinh vien");
				}
				System.out.println("==========================");
				break;
			default:
				break;
			}
		} while (chon != 0);

	}

	public void input(Student[] std) {
		Student stu = null;
		Khoi khois = new Khoi();

		String sbd, hoten, dchi, uutien, khoi = null;
		for (int i = 0; i < std.length; i++) {
			stu = new Student();
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap SBD:");
			sbd = sc.nextLine();
			stu.setSbd(sbd);
			System.out.println("Nhap ho ten:");
			hoten = sc.nextLine();
			stu.setHoten(hoten);
			System.out.println("Nhap dia chi:");
			dchi = sc.nextLine();
			stu.setDchi(dchi);
			System.out.println("Nhap che do uu tien:");
			uutien = sc.nextLine();
			stu.setUutien(uutien);
			System.out.println("Nhap khoi:");
			khoi = khois.chonKhoi();
			stu.setKhoi(khoi);
			std[i] = stu;
		}
	}

	public void showInfor(Student stu) {
		System.out.println("SBD: "+stu.getSbd());
		System.out.println("Ho ten: "+stu.getHoten());
		System.out.println("Dia chi: "+stu.getDchi());
		System.out.println("Uu tien: "+stu.getUutien());
		System.out.println("Khoi: "+stu.getKhoi());
	}

	public Student searchStudent(Student[] std) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap so bao danh cua sinh vien can tim:");
		String t = scan.nextLine();
		for (int i = 0; i < std.length; i++) {
			if (t.equalsIgnoreCase(std[i].getSbd())) {
				return std[i];
			}	
		}
		return null;

	}
}
