
package ro.cloudgamingfree.app

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.graphics.Typeface
import android.view.Gravity
import android.widget.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.statusBarColor = Color.rgb(10, 14, 25)
        window.navigationBarColor = Color.rgb(10, 14, 25)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.setPadding(35, 45, 35, 30)
        layout.setBackgroundColor(Color.rgb(10, 14, 25))

        fun addText(text: String, size: Float, color: Int) {
            val view = TextView(this)
            view.text = text
            view.textSize = size
            view.setTextColor(color)
            view.setPadding(0, 15, 0, 15)
            layout.addView(view)
        }

        addText("CLOUD GAMING FREE", 25f, Color.CYAN)
        addText("YOUR GAMES. YOUR CLOUD.", 17f, Color.WHITE)
        addText("Virtual PC", 22f, Color.WHITE)
        addText("Server not connected", 16f, Color.YELLOW)

        val connect = Button(this)
        connect.text = "CONNECT TO CLOUD PC"
        connect.setOnClickListener {
            Toast.makeText(
                this,
                "Cloud server not configured yet",
                Toast.LENGTH_LONG
            ).show()
        }
        layout.addView(connect)

        addText("GAME LIBRARY", 22f, Color.CYAN)

        val games = listOf(
            "Steam",
            "Epic Games",
            "Farming Simulator 25",
            "GTA V",
            "Euro Truck Simulator 2"
        )

        for (game in games) {
            val button = Button(this)
            button.text = game
            button.setOnClickListener {
                Toast.makeText(this, game, Toast.LENGTH_SHORT).show()
            }
            layout.addView(button)
        }

        addText("Samsung Galaxy S20 FE 5G", 14f, Color.LTGRAY)

        setContentView(layout)
    }
}
