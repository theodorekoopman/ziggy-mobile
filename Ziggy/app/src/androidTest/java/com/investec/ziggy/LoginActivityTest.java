package com.investec.ziggy;

import android.content.Intent;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Created by Theodore.Koopman on 2016/12/02.
 */
@RunWith(AndroidJUnit4.class)
public class LoginActivityTest {

    @Rule
    public ActivityTestRule<LoginActivity> loginActivityRule = new ActivityTestRule<>(LoginActivity.class);

    @Rule
    public ActivityTestRule<BalanceActivity> balanceActivityRule = new ActivityTestRule<BalanceActivity>(BalanceActivity.class, true, false);

    @Test
    public void shouldHavePasswordEditBox() {
        onView(withId(R.id.password)).check(matches(isDisplayed()));

    }

    @Test
    public void shouldLaunchBalanceActivity() {
        onView(withId(R.id.login_button)).perform(click());
        onView(withId(R.id.title)).check(matches(isDisplayed()));
    }


}