package com.mastermind.daggerhilt.model

import android.util.Log
import javax.inject.Inject

class Battery(var cobalt : Cobalt,var lithium : Lithium ) {
    //we don't own this class so we can't annotate it with @Inject
    init {
        Log.i("MyLog", "Battery: "+this)
    }
}