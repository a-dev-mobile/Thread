package a.dev.mobile_thread

import a.dev.mobile_thread.database.ThreadDB
import a.dev.mobile_thread.models.UN
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    var unList = ArrayList<UN>()
    var unList2 = ArrayList<UN>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun click(view: View) {
        when (view.id) {
            R.id.btnUn -> clickUn()
            R.id.btnTr -> clickTr()
        }


    }

    private fun clickTr() {


        val dbInstance = ThreadDB.getThreadDataBase(this)
        GlobalScope.launch {

        }
    }

    private fun clickUn() {

        val dbInstance = ThreadDB.getThreadDataBase(this)
        GlobalScope.launch {


            unList = ArrayList(dbInstance?.getUNDao()?.loadAll())
            unList = ArrayList(dbInstance?.getUNDao()?.load("12"))

            Log.d(TAG, "==============================")
            Log.d(TAG, unList.toString())
            Log.d(TAG, "==============================")
            Log.d(TAG, unList2.toString())

        }

    }


}