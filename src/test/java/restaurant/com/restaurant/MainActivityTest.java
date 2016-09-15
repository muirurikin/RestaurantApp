package restaurant.com.restaurant;

import android.os.Build;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static junit.framework.Assert.assertTrue;

@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
@RunWith(RobolectricGradleTestRunner.class)
/**
 * Created by alexona on 9/14/16.
 */
public class MainActivityTest {
    private MainActivity activity;

    @Before
    public void setup(){
        activity = Robolectric.setupActivity(MainActivity.class);

    }
    @Test
    public void validateTextViewContent(){
        TextView appname = (TextView) activity.findViewById(R.id.mytest);
        assertTrue("fala".equals(appname.getText().toString()));
    }
}
