package business;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import entity.MyFile;
import ui.Menu;

public class Manager {

	static Scanner scan = new Scanner(System.in);
	static boolean check = false;

	public static void displayFolder() {
		System.out.print("Output: ");
		for (MyFile x : Menu.listFile) {
			System.out.print("\t" + x.getName());
		}
		System.out.println();
	}

	public static void Search() {
		boolean test = false;
		String text = scan.nextLine();
		System.out.println("Cac file chua noi dung: '" + text + "' la: ");
		for (MyFile li : Menu.listFile) {
			try {
				check = Function.findText(li.getFullpath(), text);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (check == true) {
				System.out.println(li.getName() + "\t");
				test = true;
			}
		}
		if (test == false) {
			System.out.println("Khong co file chua noi dung: '" + text + "' can tim.");
		}
	}

	public static File CurFolder() {
		System.out.println("Nhap duong dan cua file:");
		File file = new File(scan.nextLine());
		return file;
	}

	public static void addFileTxt(File a) {
		String[] listChild = a.list();
		File tmp = null;
		for (String x : listChild) {
			tmp = new File(a, x);
			if (tmp.isFile()) {
				if (tmp.getAbsolutePath().endsWith(".txt")) {
					MyFile b = new MyFile(tmp.getName(), tmp.length(), tmp.getPath());
					Menu.listFile.add(b);
				}
			} else {
				addFileTxt(tmp);
			}
		}
	}
}
