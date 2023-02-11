package dev.tberghuis.touchlocktile.util

import android.util.Log
import dev.tberghuis.touchlocktile.BuildConfig

fun logd(s: String) {
  if (BuildConfig.DEBUG) {
    Log.d("xxx", s)
  }
}