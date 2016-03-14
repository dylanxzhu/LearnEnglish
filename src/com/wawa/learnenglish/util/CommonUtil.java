package com.wawa.learnenglish.util;

public class CommonUtil {

	/**
	 * 获取26个英文字母
	 * */
	public static char[] getLetters() {
		char[] letters = new char[26];
		for (int i=0; i<letters.length; i++) {
			int j = i+65;
			letters[i] = (char)j;
		}
		return letters;
	}

}
