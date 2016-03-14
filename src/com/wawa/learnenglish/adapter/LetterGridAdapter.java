package com.wawa.learnenglish.adapter;

import java.util.ArrayList;
import java.util.List;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.wawa.learnenglish.R;
import com.wawa.learnenglish.entity.Letter;

public class LetterGridAdapter extends BaseAdapter{

	private List<Letter> letters = new ArrayList<Letter>();
	private LayoutInflater inflater;
	
	public LetterGridAdapter(Context context, List<Letter> letters) {
		this.letters = letters;
		inflater = LayoutInflater.from(context);
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return letters.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@SuppressLint("InflateParams")
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		LetterItem letterItem = null;
		if (convertView==null) {
			letterItem = new LetterItem();
			convertView = inflater.inflate(R.layout.letter_grid_item, null);
			letterItem.letterTxt = (TextView) convertView.findViewById(R.id.letter_txt);
			convertView.setTag(letterItem);
		}
		else {
			letterItem = (LetterItem) convertView.getTag();
		}
		
		if (letters!=null && letters.size()>0) {
			for (int i=0; i<letters.size(); i++) {
				letterItem.letterTxt.setText(letters.get(position).getLetter().toString());
			}
		}
		
		return convertView;
	}

	private class LetterItem{
		public TextView letterTxt;
	}
}
