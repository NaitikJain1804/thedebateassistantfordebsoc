package in.apeiro.debateassistant;



import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ToggleButton;

public class LawAP extends Activity {
	
	public void motiongenerator(TextView motion1, TextView motion2, TextView motion3)
	{
		String motions[] = {"THB it is legitimate to use violence to defend private property",
				"This House believes criminal justice should focus more on rehabilitation. ",
				"This house believes homosexuality should be decriminalized",
				"This House believes parents should have the right to track their children",
				"This House believes that drone strikes should be considered unlawful",
				"This house believes in a right to self-defense",
				"This House believes that to achieve freedom some human rights can be violated",
				"This House would allow prisoners to choose death over life imprisonment",
				"This House would close Guantanamo Bay detention centre",
				"This House would as the United States ban assault weapons",
				"This House would ban the pardoning of those convicted of corruption",
				"This House would make fines relative to income",
				"This House believes the ICC (International Criminal Court) is biased against Africa",
				"This House believes the ICC(International Criminal Court) should have its own enforcement arm",
				"This House would legally require priests to report serious crimes that they hear of in confessions",
				"This House would use torture to obtain information from suspected terrorists"
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