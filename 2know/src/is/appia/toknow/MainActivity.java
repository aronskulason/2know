package is.appia.toknow;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		System.out.println("Hall� Aron");
		System.out.println("S�ll Siggi");
		System.out.println("S�lir b��ir tveir");
		System.out.println("HALLO");
		System.out.println("HALLO2");
		
		return true;
	}

}
