package in.apeiro.debateassistant;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MotionsBritish extends Activity {
	
	@Override
	   public void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.theme_select);
	       
		Button education = (Button) findViewById(R.id.education);
		Button environment = (Button) findViewById(R.id.environment);
		Button freespeech = (Button) findViewById(R.id.freespeech);
		Button health = (Button) findViewById(R.id.health);
		Button law = (Button) findViewById(R.id.law);
		Button mixed = (Button) findViewById(R.id.mixed);
		Button politicsandir = (Button) findViewById(R.id.polandir);
		Button religion = (Button) findViewById(R.id.religion);
		Button society = (Button) findViewById(R.id.society);
		
		education.setOnClickListener(new View.OnClickListener() {
         
	           @Override
	           public void onClick(View view) {
	        	   Intent format = new Intent("in.apeiro.debateassistant.EDUCATIONBP");
	   	           startActivity(format);		
	           }
	       });
		
		environment.setOnClickListener(new View.OnClickListener() {
	         
	           @Override
	           public void onClick(View view) {
	        	   Intent format = new Intent("in.apeiro.debateassistant.ENVIRONMENTBP");
	   	           startActivity(format);		
	           }
	       });
		
		freespeech.setOnClickListener(new View.OnClickListener() {
	         
	           @Override
	           public void onClick(View view) {
	        	   Intent format = new Intent("in.apeiro.debateassistant.FREESPEECHBP");
	   	           startActivity(format);		
	           }
	       });
		
		health.setOnClickListener(new View.OnClickListener() {
	         
	           @Override
	           public void onClick(View view) {
	        	   Intent format = new Intent("in.apeiro.debateassistant.HEALTHBP");
	   	           startActivity(format);		
	           }
	       });
		
		law.setOnClickListener(new View.OnClickListener() {
	         
	           @Override
	           public void onClick(View view) {
	        	   Intent format = new Intent("in.apeiro.debateassistant.LAWBP");
	   	           startActivity(format);		
	           }
	       });
		
		mixed.setOnClickListener(new View.OnClickListener() {
	         
	           @Override
	           public void onClick(View view) {
	        	   Intent format = new Intent("in.apeiro.debateassistant.MIXEDBP");
	   	           startActivity(format);		
	           }
	       });
		
		politicsandir.setOnClickListener(new View.OnClickListener() {
	         
	           @Override
	           public void onClick(View view) {
	        	   Intent format = new Intent("in.apeiro.debateassistant.POLITICSANDIRBP");
	   	           startActivity(format);		
	           }
	       });
		
		religion.setOnClickListener(new View.OnClickListener() {
	         
	           @Override
	           public void onClick(View view) {
	        	   Intent format = new Intent("in.apeiro.debateassistant.RELIGIONBP");
	   	           startActivity(format);		
	           }
	       });
		
		society.setOnClickListener(new View.OnClickListener() {
	         
	           @Override
	           public void onClick(View view) {
	        	   Intent format = new Intent("in.apeiro.debateassistant.SOCIETYBP");
	   	           startActivity(format);		
	           }
	       });
     
	}

}
