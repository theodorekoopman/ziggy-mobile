package com.investec.ziggy;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

/**
 * Created by Theodore.Koopman on 2016/12/02.
 */
@RunWith(AndroidJUnit4.class)
public class BalanceActivityTest {

    @Rule
    public ActivityTestRule<BalanceActivity> balanceActivity = new ActivityTestRule<>(BalanceActivity.class);

    @Rule
    public ActivityTestRule<TransferActivity> transferActivity = new ActivityTestRule<TransferActivity>(TransferActivity.class);

    @Test
    public void shouldDisplayTitle() {
        onView(withId(R.id.title)).check(matches(isDisplayed()));
    }

    @Test
    public void shouldDisplayParentBalance() {
        onView(withId(R.id.parentBalance)).check(matches(isDisplayed()));
    }

    @Test
    public void shouldDisplayAccountNumber() {
        onView(withId(R.id.accountnumber)).check(matches(isDisplayed()));
    }

    @Test
    public void shouldDisplayChildren() {
        onView(withId(R.id.children)).check(matches(isDisplayed()));
    }

    @Test
    public void shouldLaunchTransferActivity() {
        onView(withId(R.id.children)).perform(click());
        onView(withId(R.id.title)).check(matches(isDisplayed()));
    }
}