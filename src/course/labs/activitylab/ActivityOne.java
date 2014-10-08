package course.labs.activitylab;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ActivityOne extends Activity 
{

	// Use these as keys when you're saving state between reconfigurations
	private static final String CREATE_KEY = "create";
	private static final String START_KEY = "start";
	private static final String RESUME_KEY = "resume";
	private static final String RESTART_KEY = "restart";
	

	// String for LogCat documentation
	private final static String TAG = "Lab-ActivityOne";

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
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_one);						// Layout setting

		// TextViews assignment to layout resources
		mTvCreate = (TextView) findViewById(R.id.create);			// Assigning TextView to create resource
		mTvStart = (TextView) findViewById(R.id.start);				// Assigning TextView to start resource
		mTvResume = (TextView) findViewById(R.id.resume);			// Assigning TextView to resume resource
		mTvRestart = (TextView) findViewById(R.id.restart);			// Assigning TextView to restart resource

		// Button assignment to layout resource
		Button launchActivityTwoButton = (Button) findViewById(R.id.bLaunchActivityTwo);	// Assigning Button to bLaunchActivityTwo resource
		launchActivityTwoButton.setOnClickListener(new OnClickListener() 
		{
			@Override
			public void onClick(View v) 
			{
				// TODO:
				// Launch Activity Two
				// Hint: use Context's startActivity() method
				
				// Create an intent stating which Activity you would like to
				// start
				Intent intent = new Intent(ActivityOne.this, ActivityTwo.class);
				
				// Launch the Activity using the intent
				startActivity(intent);

			}
		});

		// Has previous state been saved?
		if (savedInstanceState != null) 
		{
			// Restore value of counters from saved state
			mCreate = savedInstanceState.getInt(CREATE_KEY);			// Load saved Create count variable
			mStart = savedInstanceState.getInt(START_KEY);				// Load saved Start count variable
			mResume = savedInstanceState.getInt(RESUME_KEY);			// Load saved Resume count variable
			mRestart = savedInstanceState.getInt(RESTART_KEY);			// Load saved Restart count variable
		}

		// Emit LogCat message
		Log.i(TAG, "Entered the onCreate() method");

		// TODO:
		mCreate++;							// Update the Create count variable
		displayCounts();					// Update the user interface to show new count values

	}

	// Life-cycle callback overrides

	@Override
	public void onStart() 
	{
		super.onStart();

		// Emit LogCat message
		Log.i(TAG, "Entered the onStart() method");

		// TODO:
		mStart++;							// Update the Start count variable
		displayCounts();					// Update the user interface to show new count values

	}

	@Override
	public void onResume() 
	{
		super.onResume();

		// Emit LogCat message
		Log.i(TAG, "Entered the onResume() method");

		// TODO:
		mResume++;							// Update the Resume count variable
		displayCounts();					// Update the user interface to show new count values

	}

	@Override
	public void onPause() 
	{
		super.onPause();

		// Emit LogCat message
		Log.i(TAG, "Entered the onPause() method");
	}

	@Override
	public void onStop() 
	{
		super.onStop();

		// Emit LogCat message
		Log.i(TAG, "Entered the onStop() method");
	}

	@Override
	public void onRestart() 
	{
		super.onRestart();

		// Emit LogCat message
		Log.i(TAG, "Entered the onRestart() method");

		mRestart++;							// Update the Restart count variable
		displayCounts();					// Update the user interface to show new count values

	}

	@Override
	public void onDestroy() 
	{
		super.onDestroy();

		// Emit LogCat message
		Log.i(TAG, "Entered the onDestroy() method");
	}

	@Override
	public void onSaveInstanceState(Bundle savedInstanceState) 
	{
		// Save state information with a collection of key-value pairs
		savedInstanceState.putInt(CREATE_KEY, mCreate);				// Save Create count variable
		savedInstanceState.putInt(START_KEY, mStart);				// Save Start count variable
		savedInstanceState.putInt(RESUME_KEY, mResume);				// Save Resume count variable
		savedInstanceState.putInt(RESTART_KEY, mRestart);			// Save Restart count variable
		

	}

	// Updates the displayed counters
	public void displayCounts() 
	{
		mTvCreate.setText("onCreate() calls: " + mCreate);			// Set TextView to display mCreate
		mTvStart.setText("onStart() calls: " + mStart);				// Set TextView to display mStart
		mTvResume.setText("onResume() calls: " + mResume);			// Set TextView to display mResume
		mTvRestart.setText("onRestart() calls: " + mRestart);		// Set TextView to display mRestart

	}
}
