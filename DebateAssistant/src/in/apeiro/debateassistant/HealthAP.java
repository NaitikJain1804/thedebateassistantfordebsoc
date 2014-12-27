package in.apeiro.debateassistant;



import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ToggleButton;

public class HealthAP extends Activity {
	
	public void motiongenerator(TextView motion1, TextView motion2, TextView motion3)
	{
		String motions[] = {"THBT the beauty industry does more harm than good",
				"THBT the USA should increase funding to fight disease in developing nations",
				"This House believes that male infant circumcision is tantamount to child abuse",
				"This House believes that fast food restaurants bring more harm than good",
				"This House would allow parents to genetically screen foetuses for heritable diseases",
				"This House would allow pharmaceutical companies to advertise directly to consumers",
				"This house would ban cosmetic surgery",
				"THBT doctors should be allowed to change the sexual orientation of consenting subjects",
				"THBT the media should not publish news on suicides",
				"This House believes that cannabis should be legalized",
				"This House believes that we put too much faith in medical profession",
				"This House would allow donations of vital organs even at the expense of the donor's life",
				"This house would allow people to sell their organs on the open market",
				"This House would ban alcohol",
				"This House would make condom usage in the porn industry mandatory",
				"This House would send obese children to fat camp",
				"This House would grant those diagnosed with terminal illnesses the right to access treatments that have not completed clinical testing",
				"This House would legalize sex work",
				"This House would permit the use of performance enhancing drugs in professional sports",
				"THW compel doctors to reveal STDs to sexual partners of their patients",
				"THW force-feed anorexics"
};
		
		int length= motions.length;
		
		Random r = new Random();
		int a = r.nextInt(length);
		int b=r.nextInt(length);
		while(b==a)
		{
			b=r.nextInt(length);
		}
		int c=r.nextInt(length);
		while(c==b || c==a)
		{
			c=r.nextInt(length);
		}
		
		motion1.setText(motions[a]);
		motion2.setText(motions[b]);
		motion3.setText(motions[c]);
		
	}
	
	public void onCreate(Bundle savedInstanceState) {
	       super.onCreate(savedInstanceState);
	       setContentView(R.layout.motions_ap);
	       
	       TextView motion1 = (TextView) findViewById(R.id.motion1);
	       TextView motion2 = (TextView) findViewById(R.id.motion2);
	       TextView motion3 = (TextView) findViewById(R.id.motion3);
	       motiongenerator(motion1,motion2,motion3);
	       
	       
	}
}