package com.example.dogglers.data_source

import com.example.dogglers.R
import com.example.dogglers.model.Dogglers

class DataSource {

    fun loadDogglers(): List<Dogglers> {
        return listOf<Dogglers>(
            //doggler 1
            Dogglers(R.string.Doggler1, R.drawable.loki),
            //doggler 2
            Dogglers(R.string.Doggler2, R.drawable.juneau),
            //doggler 3
            Dogglers(R.string.Doggler3, R.drawable.pj),
            //doggler 4
            Dogglers(R.string.Doggler4, R.drawable.shanks),
            //doggler 5
            Dogglers(R.string.Doggler5, R.drawable.luna),
            //doggler 6
            Dogglers(R.string.Doggler6, R.drawable.lea)
        )
    }
}