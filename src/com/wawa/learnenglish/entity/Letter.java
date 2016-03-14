package com.wawa.learnenglish.entity;

import java.io.Serializable;

/**
 * 英文字母类
 * @author yuewawa 2016-03-14
 * */
@SuppressWarnings("serial")
public class Letter implements Serializable{

	private int id;
	private String letter;
	private String letterAudioPath; //对应的音频路径
	
	public Letter() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLetter() {
		return letter;
	}

	public void setLetter(String letter) {
		this.letter = letter;
	}

	public String getLetterAudioPath() {
		return letterAudioPath;
	}

	public void setLetterAudioPath(String letterAudioPath) {
		this.letterAudioPath = letterAudioPath;
	}
	
}
