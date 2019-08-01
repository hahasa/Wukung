package io.mountx.wukung.drawable

import android.os.Build
import android.os.Bundle
import android.view.View
import io.mountx.common.app.LogActivity
import io.mountx.wukung.R
import kotlinx.android.synthetic.main.activity_main.*

/**
 * @author Ha Sang
 * Created on 2019-07-31
 */
class CountdownActivity : LogActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_countdown)
        setSupportActionBar(toolbar)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        }
    }
}