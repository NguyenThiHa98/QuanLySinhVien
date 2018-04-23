package qlysv;

import java.util.Scanner;

public class Khoi {
	public String chonKhoi() {
		Scanner sc = new Scanner(System.in);
		String khoi;
		khoi = sc.nextLine();
		switch (khoi.toLowerCase()) {
		case "a":
			khoi = "A: Toan, Ly, Hoa";
			break;
		case "b":
			khoi = "B: Toan, Hoa, Sinh";
			break;
		case "c":
			khoi = "C: Van, Su, Dia";
			break;
		case "d":
			khoi = "D: Toan, Van, Anh";
			break;
		default:
			System.out.println("Khong co khoi tuong ung!");
			break;
		}
		return khoi;
	}
}
