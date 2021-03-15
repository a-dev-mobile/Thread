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
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var unList = ArrayList<UN>()
    fun click(view: View) {



            val dbInstance = ThreadDB.getThreadDataBase(this)
            GlobalScope.launch {


                unList = ArrayList(dbInstance?.getUNDao()?.loadAll())
                Log.d(TAG, unList[2].toString())
            }








    }


}