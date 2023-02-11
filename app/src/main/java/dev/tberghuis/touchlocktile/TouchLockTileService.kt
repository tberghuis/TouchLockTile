package dev.tberghuis.touchlocktile

import android.content.Context
import android.content.Intent
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.glance.Button
import androidx.glance.GlanceComposable
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.layout.Column
import androidx.glance.layout.padding
import androidx.glance.wear.tiles.GlanceTileService
import androidx.glance.wear.tiles.action.ActionCallback
import androidx.glance.wear.tiles.action.actionRunCallback
import dev.tberghuis.touchlocktile.util.logd

class TouchLockTileService : GlanceTileService() {
  @Composable
  @GlanceComposable
  override fun Content() {
    Column(
    ) {
      Button(
        "Touch Lock",
        onClick = actionRunCallback<EnableWetModeCallback>(),
        modifier = GlanceModifier.padding(20.dp)
      )
    }
  }
}

class EnableWetModeCallback : ActionCallback {
  override suspend fun onAction(context: Context, glanceId: GlanceId) {
    val intent = Intent("com.google.android.wearable.action.ENABLE_WET_MODE")
    context.sendBroadcast(intent)
  }
}