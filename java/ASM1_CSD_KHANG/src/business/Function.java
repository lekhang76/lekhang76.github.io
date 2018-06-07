package business;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import entity.MyFile;

public class Function {
	static ArrayList<MyFile> list = new ArrayList<MyFile>();

	// b1 phuong thuc hien thi thu muc
	public static void displayTree(File file, int level) {
		System.out.println(Space(level) + "|" + file.getName());
		if (file.isFile()) {
			list.add(new MyFile(file.getName(), file.length(), file.getAbsolutePath()));
		}
		if (file.isDirectory()) {
			String[] subFolder = file.list();
			for (String filename : subFolder) {
				displayTree(new File(file, filename), level + 1);
			}
		}
	}

	// b2 sap xep selectionsort
	public static void selection_Sort(ArrayList<MyFile> a) {
		for (int i = 0; i < a.size(); i++) {
			int min = i;
			for (int j = i; j < a.size(); j++) {
				if (a.get(j).getSize() < a.get(min).getSize()) {
					min = j;
				}
			}
			MyFile x = a.get(i);
			a.set(i, a.get(min));
			a.set(min, x);
		}
	}

	// b2 sap xep insertionsort
	public static void insertion_Sort(ArrayList<MyFile> a) {
		for (int i = 0; i < a.size() - 1; i++) {
			while (((i + 1) > 0) && (a.get(i + 1).getSize() < a.get(i).getSize())) {
				MyFile x = a.get(i);
				a.set(i, a.get(i + 1));
				a.set(i + 1, x);
				i = i - 1;
			}
		}
	}

	// b3 tim tap tin co chua cac ky tu can tim
	public static boolean findText(String fullPath, String findString) throws IOException {
		boolean result = false;
		BufferedReader br = null;
		File file = new File(fullPath);
		String lineContent = null;
		try {
			br = new BufferedReader((new FileReader(file)));
			while ((lineContent = br.readLine()) != null) {
				if (lineContent.contains(findString)) {
					result = true;
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				br.close();
			}
		}
		return result;
	}

	// tao khoang trang
	private static String Space(int level) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= level; i++) {
			sb.append("\t");
		}
		return sb.toString();
	}

}
