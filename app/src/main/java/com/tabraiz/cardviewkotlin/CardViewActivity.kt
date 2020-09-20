package com.tabraiz.cardviewkotlin

import android.os.Bundle
import androidx.fragment.app.FragmentActivity


class CardViewActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_view)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().add(R.id.container, CardViewFragment())
                .commit()
        }
    }

}