package id.com.diaryme.meliasepti.menuexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    private fun showMessage(msg:String) {
        Snackbar.make(root_layout, msg, Snackbar.LENGTH_LONG).show()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item?.itemId) {
            R.id.menuFile -> {
                showMessage("Ini Merupakan Menu File")
                return true
            }
            R.id.menuEdit -> {
                showMessage("Ini Merupakan Menu Edit")
                return true
            }
            R.id.menuHelp -> {
                showMessage("Ini Merupakan Menu Help")
                return true
            }
            R.id.menuExit -> {
                showMessage("Ini Merupakan Menu Exit")
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}