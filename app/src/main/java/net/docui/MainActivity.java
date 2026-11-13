package net.docui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.DocumentsContract;
import android.util.Log;

public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		try {
			this.startActivity(new Intent(Intent.ACTION_VIEW)
					.setType(DocumentsContract.Document.MIME_TYPE_DIR)
			);
		} catch (Exception e) {
			Log.w("DocumentsUI", "Failed to launch DocumentsUI", e);
		}
		this.finishAndRemoveTask();
	}
}
