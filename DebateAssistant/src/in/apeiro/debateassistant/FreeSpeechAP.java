package in.apeiro.debateassistant;



import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ToggleButton;

public class FreeSpeechAP extends Activity {
	
	public void motiongenerator(TextView motion1, TextView motion2, TextView motion3)
	{
		String motions[] = {"This House believes access to the internet should be controlled",
				"This House believes the BBC should be free to blaspheme",
				"This House believes the imprisoned members of Pussy Riot should be considered political prisoners",
				"This House Supports India’s Ban on the Satanic Verses",
				"This House would allow celebrities to switch off the limelight",
				"This House would offer amnesty to bloggers currently prosecuted by their native states",
				"This House would show the darker side of the formation of the nation",
				"This House believes a nation's history and mythology is part of its national security",
				"This House believes in the Right to be forgotten",
				"This House Believes NSA Spying was Justified",
				"This House believes that it is sometimes right for the government to restrict freedom of speech",
				"This House believes that rumours about politicians should not be reported",
				"This House believes the expenditure of money should be protected as speech. ",
				"This House believes you have nothing to worry about surveillance if you have done nothing wrong. ",
				"This House would ban music containing lyrics that glorify violent and criminal lifestyles",
				"This House would regulate the press"
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