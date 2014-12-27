package in.apeiro.debateassistant;



import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ToggleButton;

public class SocietyAP extends Activity {
	
	public void motiongenerator(TextView motion1, TextView motion2, TextView motion3)
	{
		String motions[] = {"This House believes that Facebook is a reflection of urban loneliness",
				"This House believes mixed gender residences are preferable over single sex residences at universities",
				"This House believes that countries with an imbalanced male/female ratio skewed towards males should encourage parents to produce girls",
				"This House believes African cities need to invest more in housing to replace slums",
				"This House believes men should do half the cooking",
				"This House believes that cannabis should be legalized",
				"This House believes that the EU should offer asylum to women from countries which have legislation that discriminates against women. ",
				"This House believes that the people's republic of China should abandon the one-child policy",
				"This house regrets the rise of teen idols",
				"This House would ban the burqa",
				"This House believes that the feminist movement should seek a ban on pornography"
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