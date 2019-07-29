package com.atishay.practice.string;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Amazon Interview Question.
public class ArrangeJunctionBoxes {

	public static void main(String[] args) {
		// First value is Identifier and other values are version information.
		// We don't have to sort new version box, we have to simply add them.
		// Example of old version box.
		String s = "236 cat dog rabbit snake";
		// Example of new version box.
		String s2 = "o65 12 14 6";
		String s3 = "eo first qpx";
		String s4 = "az0 first qpx";
		String s5 = "ab first qpx";
		String s6 = "abd first qpx";
		List<String> boxList = new ArrayList<>();
		boxList.add(s);
		boxList.add(s2);
		boxList.add(s3);
		boxList.add(s4);
		boxList.add(s5);
		boxList.add(s6);

		// to maintain insertion order.
		List<String> newerVersionLst = new LinkedList<>();
		Map<String, String> map = new HashMap<>();
		List<String> finalSortedLst = new LinkedList<>();

		Iterator<String> itr = boxList.iterator();

		while (itr.hasNext()) {
			String newVersionBox = itr.next();
			// Adding new version box in other list and removing them from original list
			if (removeAndAddNewVersion(newVersionBox)) {
				newerVersionLst.add(newVersionBox);
				itr.remove();
			} else {
				String[] arr = newVersionBox.split(" ", 2);
				map.put(arr[0], arr[1]);
			}
		}

		final Comparator<Map.Entry<String, String>> valueComparator = Map.Entry.comparingByValue();

		Map<String, String> sorted = map.entrySet().stream().sorted(valueComparator)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

		for (Map.Entry<String, String> entry : sorted.entrySet()) {
			finalSortedLst.add(entry.getKey() + " " + entry.getValue());
		}

		for (String str : newerVersionLst) {
			finalSortedLst.add(str);
		}

		System.out.println(finalSortedLst);
	}

	private static boolean removeAndAddNewVersion(String boxString) {
		String[] arr = boxString.split(" ", 2);
		// String will have Numeric values and space only.
		return arr[1].matches("([0-9]*\\)*\\(*\\s*)+");
	}

}
