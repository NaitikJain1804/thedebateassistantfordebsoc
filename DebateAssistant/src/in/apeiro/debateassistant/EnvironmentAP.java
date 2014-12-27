package in.apeiro.debateassistant;



import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ToggleButton;

public class EnvironmentAP extends Activity {
	
	public void motiongenerator(TextView motion1, TextView motion2, TextView motion3)
	{
		String motions[] = {"THBT developed countries should fund projects to mitigate the impact of climate change in developing countries",
				"This House believes global warming can still be prevented",
				"This House believes hydroelectric dams to be a part of the solution to global warming",
				"This House believes subsidies on fuel should be eliminated",
				"This house believes that developed countries have a higher obligation to combat climate change than developing countries",
				"This house believes that nuclear energy must be stopped. ",
				"This House would ban animal testing",
				"This House would ban gold mining",
				"This House believes Ethiopia is right to build a dam on the River Nile",
				"This house Believes People Should Not Keep Pets",
				"This House believes that countries affected by haze should pay Indonesia to stop slash and burn agriculture",
				"This House believes we're too late on global climate change",
				"This house believes that states should not subsidise the growing of tobacco",
				"This House believes that violent action to defend our environment is justified",
				"This House Does Not Trust the Market for Improvements in Energy Standards. ",
				"This House supports the use of genetically engineered plants in developing countries",
				"This House would ban flying for leisure purposes",
				"This house would ban private car ownership and would compel citizens to use the public eco friendly vehicles",
				"This House would cycle to work",
				"This House would give refugee status to environmental or climate refugees",
				"This House would put a lower tax on organic food in restaurants",
				"This house would encourage offshore drilling",
				"This House would pay the poor not to have children",
				"This House would subsidize renewable sources of energy",
				"THW use carbon capture and storage to curb carbon dioxide emissions from fossil fuels"
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