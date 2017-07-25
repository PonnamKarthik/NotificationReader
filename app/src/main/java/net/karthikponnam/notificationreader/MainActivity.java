package net.karthikponnam.notificationreader;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    String TAG = "GHM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PackageManager pm  = this.getPackageManager();
        List<ApplicationInfo> app_list = pm.getInstalledApplications(PackageManager.GET_META_DATA);

        Log.i(TAG, "onCreate: " + app_list.size());
        for( ApplicationInfo applicationInfo : app_list ) {
            Log.i(TAG, "onCreate: " + this.getPackageManager().getApplicationLabel(applicationInfo));
        }
    }
}
