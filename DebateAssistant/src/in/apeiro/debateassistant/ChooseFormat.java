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

public class ChooseFormat extends Activity {

	@Override
	   public void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.choose_format);
	       
		Button asian = (Button) findViewById(R.id.asian);
		Button british = (Button) findViewById(R.id.british);
		
		asian.setOnClickListener(new View.OnClickListener() {
            
	           @Override
	           public void onClick(View view) {
	        	   
	        	   Intent asian = new Intent("in.apeiro.debateassistant.ASIAN");
	   	           startActivity(asian);		
	           }
	       });
		
		british.setOnClickListener(new View.OnClickListener() {
            
	           @Override
	           public void onClick(View view) {
	        	   
	        	   Intent british = new Intent("in.apeiro.debateassistant.BRITISH");
	   	           startActivity(british);		
	           }
	       });
	}
}
