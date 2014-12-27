package in.apeiro.debateassistant;



import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.Image;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

public class TimerAsian extends Activity {
	
	CountDownTimer timekeeper;
	
	 public void onCreate(Bundle savedInstanceState) {
	       super.onCreate(savedInstanceState);
	       setContentView(R.layout.timer);
	       
	        Button pause = (Button) findViewById(R.id.pause);
	        
	        Button next = (Button) findViewById(R.id.next);
	        
		    final TextView timer = (TextView) findViewById(R.id.timer); 
		    
		    
		    timekeeper = new CountDownTimer(60000, 1000) {

	    	     public void onTick(long millisUntilFinished) {
	    	         timer.setText(Integer.toString( (int)(millisUntilFinished / 1000)));
	    	     }

	    	     public void onFinish() {
	    	    	 //Game over
	    	    	 
	    	     }
	    	  }.start();
	 }
}
