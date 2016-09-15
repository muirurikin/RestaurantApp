package restaurant.com.restaurant;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by alexona on 9/14/16.
 */
public class MainActivityTest1 {

    @Rule

    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void validatedEditText(){
        onView(withId(R.id.edt1)).perform(typeText("Nairobi"))
                .check(matches(withText("Nairobi")));
    }

    @Test
    public void locationIsSentToMainActivity(){
        String location = "Nairobi";
        onView(withId(R.id.edt1)).perform(typeText(location));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.mytest)).check(matches(withText(location)));
    }





}
