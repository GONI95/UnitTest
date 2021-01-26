package com.example.unittest

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class EspressoTest {
    @Rule @JvmField var activityTestRule
    = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun myTest(){
        // editText를 찾아 hello를 입력한다
      onView(withId(R.id.edit_text))
           .perform(typeText("hello"), closeSoftKeyboard())

        // textView를 찾아 현재 담긴 값이 hello인지 확인
        onView(withId(R.id.text_view))
            .check(matches(withText("hello")))

        // 버튼을 클릭하게하여 토스트 메시지가 나타나게 한다.
        onView(withId(R.id.btn_view))
            .perform(click())
    }

}