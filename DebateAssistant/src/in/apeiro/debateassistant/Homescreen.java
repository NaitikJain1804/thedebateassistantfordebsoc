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

public class Homescreen extends Activity {
	
	@Override
	   public void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.homescreen);
	       
		Button format = (Button) findViewById(R.id.format);
		
		format.setOnClickListener(new View.OnClickListener() {
            
	           @Override
	           public void onClick(View view) {
	        	   Intent format = new Intent("in.apeiro.debateassistant.CHOOSEFORMAT");
	   	           startActivity(format);		
	           }
	       });
        
	}
	}
