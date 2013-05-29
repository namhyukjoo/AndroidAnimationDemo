package com.example;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {
  /** Called when the activity is first created. */
	
	private ImageView image;
	private Animation animFadeIn;
	private Animation animFadeOut;
	private Button btnFadeIn;
	private Button btnFadeOut;
	
  @Override
  public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
    
      btnFadeIn = (Button)findViewById(R.id.btn_fadein);
      btnFadeOut = (Button)findViewById(R.id.btn_fadeout);
      image = (ImageView)findViewById(R.id.my_image);
    
      animFadeIn = AnimationUtils.loadAnimation(this, R.anim.anim_fade_in);
      btnFadeIn.setOnClickListener(new Button.OnClickListener(){

   @Override
   public void onClick(View arg0) {
    // TODO Auto-generated method stub
    image.startAnimation(animFadeIn);
   }});
    
      animFadeOut = AnimationUtils.loadAnimation(this, R.anim.anim_fade_out);
      btnFadeOut.setOnClickListener(new Button.OnClickListener(){

   @Override
   public void onClick(View arg0) {
    // TODO Auto-generated method stub
    image.startAnimation(animFadeOut);
   }});
  }
}
