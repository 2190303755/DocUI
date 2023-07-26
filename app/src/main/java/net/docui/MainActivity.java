package net.docui;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		try {
			startActivity(new Intent(Intent.ACTION_MAIN).setComponent(new ComponentName(
					new Intent(Intent.ACTION_OPEN_DOCUMENT_TREE).resolveActivity(this.getPackageManager()).getPackageName(),
					"com.android.documentsui.files.FilesActivity"
			)));
		} catch (Exception e) {
			Log.i("DocumentsUI", e.getMessage());
		}
		this.finish();
	}
}