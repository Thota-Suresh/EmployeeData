package com.student.service.test;

import java.util.Arrays;

public class Test1 {
	/*
	 * check if two strings are anagrams.
	 * 
	 * Eg: s = "anagram", t = "nagaram"
	 */
	public static void main(String[] args) {
		System.out.println("welcome");
		String s1 = "rmammaa";
		String t1 = "nagaram";
		char[] sa1 = s1.toCharArray();
		char[] ta1 = t1.toCharArray();
		Arrays.sort(ta1);
		Arrays.sort(sa1);
		boolean value = Arrays.equals(sa1, ta1);
		if (ta1.length == sa1.length) {
			if (value) {
				System.out.println("anagram");
			} else {
				System.out.println("not anagram");
			}
		} else {
			System.out.println("not anagram");
		}
	}
}
