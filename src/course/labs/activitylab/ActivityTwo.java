package course.labs.activitylab;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ActivityTwo extends Activity 
{

	// Use these as keys when you're saving state between reconfigurations
	private static final String RESTART_KEY = "restart";
	private static final String RESUME_KEY = "resume";
	private static final String START_KEY = "start";
	private static final String CREATE_KEY = "create";

	// String for LogCat documentation
	private final static String TAG = "Lab-ActivityTwo";

	// Lifecycle counters

	// Life-cycle counters
	private int mCreate = 0;					// Counts number of calls of onCreate() method
	private int mStart = 0;						// Counts number of calls of onStart() method
	private int mResume = 0;					// Counts number of calls of onResume() method
	private int mRestart = 0;					// Counts number of calls of onRestart() method

	// You will need to increment these variables' values when their
	// corresponding life-cycle methods get called.

	private TextView mTvCreate;					// TextView that will display mCreate
	private TextView mTvStart;					// TextView that will display mStart
	private TextView mTvResume;					// TextView that will display mResume
	private TextView mTvRestart;				// TextView that will display mRestart

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_two);

		// TODO: Assign the appropriate TextViews to the TextView variables
		// Hint: Access the TextView by calling Activity's findViewById()
		// textView1 = (TextView) findViewById(R.id.textView1);


		
		
		
		
		Button closeButton = (Button) findViewById(R.id.bClose); 
		closeButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				// TODO:
				// This function closes Activity Two
				// Hint: use Context's finish() method

				
			
			}
		});

		// Has previous state been saved?
		if (savedInstanceState != null) {

			// TODO:
			// Restore value of counters from saved state
			// Only need 4 lines of code, one for every count variable


			
			
			
			
		}

		// Emit LogCat message
		Log.i(TAG, "Entered the onCreate() method");

		// TODO:
		// Update the appropriate count variable
		// Update the user interface via the displayCounts() method


		
		
	}

	// Lifecycle callback methods overrides

	@Override
	public void onStart() {
		super.onStart();

		// Emit LogCat message
		Log.i(TAG, "Entered the onStart() method");

		// TODO:
		// Update the appropriate count variable
		// Update the user interface


		
		
	}

	@Override
	public void onResume() {
		super.onResume();

		// Emit LogCat message
		Log.i(TAG, "Entered the onResume() method");

		// TODO:
		// Update the appropriate count variable
		// Update the user interface


	
	}

	@Override
	public void onPause() {
		super.onPause();

		// Emit LogCat message
		Log.i(TAG, "Entered the onPause() method");
	}

	@Override
	public void onStop() {
		super.onStop();

		// Emit LogCat message
		Log.i(TAG, "Entered the onStop() method");
	}

	@Override
	public void onRestart() {
		super.onRestart();

		// Emit LogCat message
		Log.i(TAG, "Entered the onRestart() method");

		// TODO:
		// Update the appropriate count variable
		// Update the user interface


	
	
	}

	@Override
	public void onDestroy() {
		super.onDestroy();

		// Emit LogCat message
		Log.i(TAG, "Entered the onDestroy() method");
	}

	@Override
	public void onSaveInstanceState(Bundle savedInstanceState) {

		// TODO:
		// Save counter state information with a collection of key-value pairs
		// 4 lines of code, one for every count variable



		
		
		
		
	}

	// Updates the displayed counters
	// This method expects that the counters and TextView variables use the
	// names
	// specified above
	public void displayCounts() {

		mTvCreate.setText("onCreate() calls: " + mCreate);
		mTvStart.setText("onStart() calls: " + mStart);
		mTvResume.setText("onResume() calls: " + mResume);
		mTvRestart.setText("onRestart() calls: " + mRestart);
	
	}
}
