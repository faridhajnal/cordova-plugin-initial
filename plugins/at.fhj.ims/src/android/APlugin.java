import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaInterface;
import android.util.Log;
import android.provider.Settings;
import android.widget.Toast;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.provider.Settings.Secure;
 
public class APlugin extends CordovaPlugin {
 
public static final String TAG = "A Plugin";
 
/**
* Constructor.
*/
public APlugin() {}
 
/**
* Sets the context of the Command. This can then be used to do things like
* get file paths associated with the Activity.
*
* @param cordova The context of the main Activity.
* @param webView The CordovaWebView Cordova is running in.
*/
 
public void initialize(CordovaInterface cordova, CordovaWebView webView) {
super.initialize(cordova, webView);
Log.v(TAG,"Init APlugin");
}
 
public boolean execute(final String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
         
final int duration = Toast.LENGTH_SHORT;
// Shows a toast
Log.v(TAG,"APlugin received:"+ action);
 
         
cordova.getActivity().runOnUiThread(new Runnable() {
public void run() {


Toast.makeText(cordova.getActivity().getApplicationContext(), "Executing the runnable...", duration).show();

//setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

String s = "Device ID= "+ Secure.getString(cordova.getActivity().getApplicationContext().getContentResolver(), Secure.ANDROID_ID);

/*Toast toast = Toast.makeText(cordova.getActivity().getApplicationContext(), action +" FROM Dev:" + s, duration);
toast.show();
}*/
});
 
return true;



}
}