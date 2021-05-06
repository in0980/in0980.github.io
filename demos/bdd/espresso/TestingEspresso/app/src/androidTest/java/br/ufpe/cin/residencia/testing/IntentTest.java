package br.ufpe.cin.residencia.testing;


import androidx.test.espresso.intent.rule.IntentsTestRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.intent.Intents.intended;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasExtra;
import static androidx.test.espresso.intent.matcher.IntentMatchers.toPackage;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anything;

@RunWith(AndroidJUnit4.class)
public class IntentTest {
    @Rule
    public final IntentsTestRule<MainActivity> main = new IntentsTestRule(MainActivity.class, true);

    @Test
    public void testClick() {


        onData(anything())
                .inAdapterView(withId(R.id.lista))
                .atPosition(12)
                .perform(click());

        intended(allOf(
                toPackage("br.ufpe.cin.residencia.testing"),
                hasExtra(MainActivity.KEY_NOME, "Gustavo"),
                hasExtra(MainActivity.KEY_LOGIN, "ghpc")));
    }


}
