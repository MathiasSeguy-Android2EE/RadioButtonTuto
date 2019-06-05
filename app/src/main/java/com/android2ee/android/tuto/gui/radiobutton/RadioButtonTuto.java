/**
* <ul>
* Android Tutorial, An <strong>Android2EE</strong>'s project.</br>
* Produced by <strong>Dr. Mathias SEGUY</strong> with the smart contribution of <strong>Julien PAPUT</strong>.</br>
* Delivered by <strong>http://android2ee.com/</strong></br>
* Belongs to <strong>Mathias Seguy</strong></br>
* ****************************************************************************************************************</br>
* This code is free for any usage but can't be distribute.</br>
* The distribution is reserved to the site <strong>http://android2ee.com</strong>.</br>
* The intelectual property belongs to <strong>Mathias Seguy</strong>.</br>
* <em>http://mathias-seguy.developpez.com/</em></br>
* </br>
* For any information (Advice, Expertise, J2EE or Android Training, Rates, Business):</br>
* <em>mathias.seguy.it@gmail.com</em></br>
* *****************************************************************************************************************</br>
* Ce code est libre de toute utilisation mais n'est pas distribuable.</br>
* Sa distribution est reservée au site <strong>http://android2ee.com</strong>.</br>
* Sa propriété intellectuelle appartient à <strong>Mathias Séguy</strong>.</br>
* <em>http://mathias-seguy.developpez.com/</em></br>
* </br>
* Pour tous renseignements (Conseil, Expertise, Formations J2EE ou Android, Prestations, Forfaits):</br>
* <em>mathias.seguy.it@gmail.com</em></br>
* *****************************************************************************************************************</br>
* Merci à vous d'avoir confiance en Android2EE les Ebooks de programmation Android.
* N'hésitez pas à nous suivre sur twitter: http://fr.twitter.com/#!/android2ee
* N'hésitez pas à suivre le blog Android2ee sur Developpez.com : http://blog.developpez.com/android2ee-mathias-seguy/
* *****************************************************************************************************************</br>
* com.android2ee.android.tuto</br>
* 25 mars 2011</br>
*/
package com.android2ee.android.tuto.gui.radiobutton;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;


/**
 * @author (Julien PAPUT sous la direction du Dr. Mathias Séguy)
 * @goals
 * This class aims to:
 * <ul><li>Ask to the User what he like and dislike and show the result.</li></ul>
 */
public class RadioButtonTuto extends Activity {	
	/******************************************************************************************/
	/** Attributes **************************************************************************/
	/******************************************************************************************/
	/**  The chocolate RadioButton */
	RadioButton radioButtonChocolate;
	/**  The hug RadioButton */
	RadioButton radioButtonHug;
	/**  The Santa RadioButton */
	RadioButton radioButtonSanta;
	/**  The War RadioButton */
	RadioButton radioButtonWar;
	/**  The Injustice RadioButton */
	RadioButton radioButtonInjustice;
	/**  The stockHolder RadioButton */
	RadioButton radioButtonStockHolder;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        /******************************************************************************************/
		/** radioButton instanciation ****************************************************************/
		/******************************************************************************************/
        // Instanciate the radio buttons for the first radioGroup
        radioButtonChocolate = (RadioButton)findViewById(R.id.chocolate);
        radioButtonHug = (RadioButton)findViewById(R.id.hug);
        radioButtonSanta = (RadioButton)findViewById(R.id.santaclaus);
       
        //Instanciate the radio buttons for the first radioGroup
        radioButtonWar = (RadioButton)findViewById(R.id.war);
        radioButtonInjustice = (RadioButton)findViewById(R.id.injustice);
        radioButtonStockHolder = (RadioButton)findViewById(R.id.stockholder);
        
        /******************************************************************************************/
		/** Retrieve the selection ****************************************************************/
		/******************************************************************************************/
        // Retrieve the button that show the Toaster
        Button btn = (Button) findViewById(R.id.btnShow);
        //add a listener on it
		btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				showChoices();							
			}			
		});		
    }
    
    /** * This method displays a Toast that resumes the choices of the user     */
    private void showChoices() {
		//Define the text message
		StringBuilder text = new StringBuilder( getString(R.string.ilike));
		text.append(" ");
		//Implement the text message for the stuffs "i like"
		if(radioButtonChocolate.isChecked()){
			//if the chocolate radioButton is checked, add "Chocolate" to the string
			text.append(getString(R.string.chocolate));
		}else if(radioButtonHug.isChecked()){
			//if the Hug radioButton is checked, add "Hug" to the string
			text.append(getString(R.string.hug));
		}else if(radioButtonSanta.isChecked()){		
			//if the Santa Claus radioButton is checked, add "Santa Claus" to the string
			text.append(getString(R.string.santaclaus));
		}
		//Implement the text message for the stuffs "i dislike"
		text.append(getString(R.string.idislike));
		text.append(" ");
		if(radioButtonWar.isChecked()){
			//if the war radioButton is checked, add "War" to the string				
			text.append(getString(R.string.war));
		}else if(radioButtonInjustice.isChecked()){
			//if the injustice radioButton is checked, add "Injustice" to the string
			text.append(getString(R.string.injustice));
		}else if(radioButtonStockHolder.isChecked()){
			//if the stockholder radioButton is checked, add "StockHolder" to the string
			text.append(getString(R.string.stockholder));
		}
		//Make and Show the Toaster
		Toast.makeText(RadioButtonTuto.this, text, Toast.LENGTH_LONG).show();
		
	}
}