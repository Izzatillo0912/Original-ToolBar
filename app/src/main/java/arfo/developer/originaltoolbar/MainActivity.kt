package arfo.developer.originaltoolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)

        toolbar.setNavigationOnClickListener {
            Toast.makeText(this, "Hello I am NavigationDrawer", Toast.LENGTH_SHORT).show()
        }
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.top_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId) {
            R.id.hi -> Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show()
            R.id.hoy -> Toast.makeText(this, "How are you", Toast.LENGTH_SHORT).show()
            R.id.tmp -> Toast.makeText(this, "The my project", Toast.LENGTH_SHORT).show()
        }
        return false
    }

}