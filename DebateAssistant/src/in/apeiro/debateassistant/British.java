package in.apeiro.debateassistant;


import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class British extends Activity {

	@Override
	   public void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.motions_timer);
	       
		Button motions = (Button) findViewById(R.id.motions);
		Button timer = (Button) findViewById(R.id.timer);
		
		motions.setOnClickListener(new View.OnClickListener() {
            
	           @Override
	           public void onClick(View view) {
	        	   
	        	   Intent motions = new Intent("in.apeiro.debateassistant.MOTIONSBP");
	   	           startActivity(motions);		
	           }
	       });
		
		timer.setOnClickListener(new View.OnClickListener() {
            
	           @Override
	           public void onClick(View view) {
	        	   
	        	   Intent timer = new Intent("in.apeiro.debateassistant.TIMERBP");
	   	           startActivity(timer);		
	           }
	       });
	}
}
