package in.apeiro.debateassistant;



import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ToggleButton;

public class PoliticsAndIRBP extends Activity {
	
	public void motiongenerator(TextView motion)
	{
		String motions[] = {"TH regrets the Arab Spring",
				"This House would encourage the separation Muslims and Hindus in India",
				"THBT change comes through Molotov cocktails, not with a voting ballot",
				"THBT human shields are a legitimate tactic in war",
				"The house believes that to abstain is not democratic",
				"THBT the media should not report or comment upon terrorist incidents",
				"This House believes a democratic vote can only be legitimate if a majority of eligible voters take part",
				"This House believes Britain should join the Euro currency",
				"This House believes it is better to go for youthful dynamism over experience for political office",
				"THB the Protection of National Identity is a Legitimate Reason to Restrict Immigration",
				"This House believes the west should provide financial and military support to opposition groups in oppressive regimes",
				"This House believes a third world war is inevitable",
				"This House believes all nations have a right to nuclear weapons",
				"This House believes European NATO member governments should significantly reduce their armed forces",
				"This House believes NATO has succeeded in Afghanistan",
				"This House believes no election in Syria can be legitimate while Assad is a candidate",

				"This House believes only those who contribute more in taxes than they receive in benefits should vote",

				"This House believes Russia has the right to send troops into Crimea",

				"This house believes self-determination of peoples is a human right",

				"This house believes states are justified in waging war in response to terrorist acts",

				"This House believes that disbanding all militaries is necessary for global peace",

				"This House believes that drone strikes should be considered unlawful",

				"This House believes that elected representatives should not hold any additional posts while serving in government",

				"This House Believes Terrorism can be justified",

				"This House believes that firearms should be banned worldwide",

				"This House believes that governments should pay compensation for terrorist atrocities committed by their citizens",

				"This house believes that the benefits of war can outweigh the costs",

				"This house believes that the LGBT movement should not 'out' gay politicians that publicly profess homophobic views",

				"This House believes that violence can be a legitimate means of political expression",

				"This House believes the WHO should be able to overrule national agencies when responding to a pandemic",

				"This House favours a common EU foreign policy",
				"This House supports countries spying on each other",
				"This House believes that violent revolution is never justified",
				"This House believes the Arab Spring revolutions can create stable democracies. ",
				"This House would abolish the immunity of diplomats",
				"This house would allow prisoners to vote",
				"This House would consider a large scale cyber attack an act of war",
				"This House would introduce positive discrimination to put more women in parliament",
				"This House would let the Kashmiris decide whether to be a part of India or Pakistan",
				"This House would negotiate with terrorists",
				"This House would restrict the right to Habeas Corpus as part of efforts to combat terrorism",
				"This House would throw Russia out of the G8",
				"This House would use targeted sanctions to respond to cyber-attacks",
				"This House would use Unmanned Aerial Vehicles to strike terrorist targets",
				"THW ban negative political advertisements",
				"THW ban racist and extreme nationalist political parties",
				"THW pressure North Korea to come to a full armistice agreement with the UN",
				"THW ban private financing of election campaigns. ",
				"THW introduce compulsory military service",
				"THW shoot human shields used by the other side",
				"This House believes India is an idea, not just a country",
				"This House believes in a world government",
				"This House believes Jammu and Kashmir should be independent",
				"THBT, in countries with few female politicians, it is good to have a politically active first lady",
				"This House believes nations of the world should increase protection of the economic and social rights of migrants. ",
				"This House believes that the UN should restrict arms sales to rogue nations. ",
				"This house believes sanctions should be used to promote democracy",
				"This House believes that former colonial powers should pay reparations to former colonies",
				"This House believes that the United Nations has failed",
				"This House believes there needs to be more UN involvement in the post Arab spring Middle East",
				"This House prefers trade to aid",
				"This House would put taxes/revenue from oil into a trust fund independent of politicians influence",
				"THW prefer Chinese hegemony to American hegemony",
				"This House would stop sending development aid to India"};
		
		int length= motions.length;
		
		Random r = new Random();
		int a = r.nextInt(length);
		motion.setText(motions[a]);
		
		
	}
	
	public void onCreate(Bundle savedInstanceState) {
	       super.onCreate(savedInstanceState);
	       setContentView(R.layout.motions_bp);
	       
	       TextView motion = (TextView) findViewById(R.id.motion);
	       motiongenerator(motion);
	       
	       
	}
}