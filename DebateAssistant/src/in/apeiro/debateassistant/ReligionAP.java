package in.apeiro.debateassistant;



import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ToggleButton;

public class ReligionAP extends Activity {
	
	public void motiongenerator(TextView motion1, TextView motion2, TextView motion3)
	{
		String motions[] = {"This House Would encourage the separation Muslims and Hindus in India",
				"TH regrets strong society norms in favour of monogamy",
				"This House believes that belief in God is irrational",
				"This house believes that the Catholic Church is justified in forbidding the use of barrier methods of contraception. ",
				"This House would (as a Christian Church) allow the ordination of gay and lesbian priests",
				"This House would ban religious symbols in public buildings",
				"This House would remove the requirement for Catholic Priests to take a vow of celibacy",
				"This House believes that marriage is an outdated institution",
				"This House would legally require priests to report serious crimes that they hear of in confessions",
				"This house would teach creationism in schools",
				"THW legalize multi-partner marriages for both men and women"
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