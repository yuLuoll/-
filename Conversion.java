package test_3;

import java.util.ArrayList;

import test_2.Exercise_2;
public class Conversion {
	public void as(Exercise_2 e,ArrayList<String[]> list) {
		for (int i = 0; i < e.size(); i++) {
			String[] a = { "��" + (i + 1) + "��:", e.get(i).asString() };
			list.add(a);
		}
	}
	public void full(Exercise_2 e,ArrayList<String[]> list) {
		for (int i = 0; i < e.size(); i++) {
			String[] a = { "��" + (i + 1) + "��:", e.get(i).fullString() };
			list.add(a);
		}
	}
}
