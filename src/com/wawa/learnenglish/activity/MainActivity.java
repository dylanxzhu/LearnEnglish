package com.wawa.learnenglish.activity;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

import com.wawa.learnenglish.R;
import com.wawa.learnenglish.adapter.LetterGridAdapter;
import com.wawa.learnenglish.entity.Letter;
import com.wawa.learnenglish.util.CommonUtil;

public class MainActivity extends Activity{

	private static final String TAG = "MainActivity";
	
	private Context context;
	private GridView letterGridView;
	private LetterGridAdapter adapter;
	private List<Letter> letters = new ArrayList<Letter>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Log.i(TAG, "onCreate...");
		
		//设置不显示标题
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main);
        
        context = MainActivity.this;
        
        initViews();
        
        letters = addData();    
        adapter = new LetterGridAdapter(context, letters);
        letterGridView.setAdapter(adapter);
        letterGridView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				switch (position) {
				case 0:
					MediaPlayer.create(context, R.raw.a).start();
					break;
				case 1:
					MediaPlayer.create(context, R.raw.b).start();
					break;
				case 2:
					MediaPlayer.create(context, R.raw.c).start();
					break;
				case 3:
					MediaPlayer.create(context, R.raw.d).start();
					break;
				case 4:
					MediaPlayer.create(context, R.raw.e).start();
					break;
				case 5:
					MediaPlayer.create(context, R.raw.f).start();
					break;
				case 6:
					MediaPlayer.create(context, R.raw.g).start();
					break;
				case 7:
					MediaPlayer.create(context, R.raw.h).start();
					break;
				case 8:
					MediaPlayer.create(context, R.raw.i).start();
					break;
				case 9:
					MediaPlayer.create(context, R.raw.j).start();
					break;
				case 10:
					MediaPlayer.create(context, R.raw.k).start();
					break;
				case 11:
					MediaPlayer.create(context, R.raw.l).start();
					break;
				case 12:
					MediaPlayer.create(context, R.raw.m).start();
					break;
				case 13:
					MediaPlayer.create(context, R.raw.n).start();
					break;
				case 14:
					MediaPlayer.create(context, R.raw.o).start();
					break;
				case 15:
					MediaPlayer.create(context, R.raw.p).start();
					break;
				case 16:
					MediaPlayer.create(context, R.raw.q).start();
					break;
				case 17:
					MediaPlayer.create(context, R.raw.r).start();
					break;
				case 18:
					MediaPlayer.create(context, R.raw.s).start();
					break;
				case 19:
					MediaPlayer.create(context, R.raw.t).start();
					break;
				case 20:
					MediaPlayer.create(context, R.raw.u).start();
					break;
				case 21:
					MediaPlayer.create(context, R.raw.v).start();
					break;
				case 22:
					MediaPlayer.create(context, R.raw.w).start();
					break;
				case 23:
					MediaPlayer.create(context, R.raw.x).start();
					break;
				case 24:
					MediaPlayer.create(context, R.raw.y).start();
					break;
				case 25:
					MediaPlayer.create(context, R.raw.z).start();
					break;
				}
			}
		});
	}
	
	private void initViews() {
		letterGridView = (GridView) findViewById(R.id.letter_grid_view);
	}
	
	private List<Letter> addData(){
		List<Letter> list = new ArrayList<Letter>();
		Letter letter = new Letter();
		char[] letterArr = CommonUtil.getLetters();
		for (int i=0; i<letterArr.length; i++) {
			letter = new Letter();
			letter.setLetter(String.valueOf(letterArr[i]));
			list.add(letter);
		}
		return list;
	}	
}
