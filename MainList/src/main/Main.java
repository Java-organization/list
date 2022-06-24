package main;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		int sum = 0;
		for (int j = 0; j < list.size(); j++) {
			sum = sum + list.get(j);

		}
		System.out.println(sum);
	}

}
