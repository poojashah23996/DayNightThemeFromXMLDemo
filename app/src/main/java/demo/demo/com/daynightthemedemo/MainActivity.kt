package demo.demo.com.daynightthemedemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        PreferenceHelper.initialize(this)
        if (!PreferenceHelper.getInstance().getBoolean("theme")) {
            setTheme(R.style.FeedActivityThemeLight)
        } else {
            setTheme(R.style.FeedActivityThemeDark)
        }
        setContentView(R.layout.activity_main)
        btn.setOnClickListener {
            if (PreferenceHelper.getInstance().getBoolean("theme")) {
                PreferenceHelper.getInstance().setBoolean("theme", false)
            } else {
                PreferenceHelper.getInstance().setBoolean("theme", true)
            }
          //  setTheme(R.style.FeedActivityThemeLight)
            this.recreate()

        }
    }

}

