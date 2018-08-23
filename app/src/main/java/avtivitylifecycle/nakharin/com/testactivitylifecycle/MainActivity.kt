package avtivitylifecycle.nakharin.com.testactivitylifecycle

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val TAG = "999"
    private val TAG_CLASS = "MainActivity"

    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "$TAG_CLASS: onCreate")

        btnClick.setOnClickListener {
            val i = Intent(this, SecondActivity::class.java)
            startActivity(i)
        }

        count = 555
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "$TAG_CLASS: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "$TAG_CLASS: onResume")
        Log.i(TAG, "$TAG_CLASS: count: $count")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "$TAG_CLASS: onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "$TAG_CLASS: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "$TAG_CLASS: onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "$TAG_CLASS: onDestroy")
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        outState?.run {
            putInt("count", count)
        }
        Log.i(TAG, "$TAG_CLASS: onSaveInstanceState: ${outState?.toString()}")
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        count = savedInstanceState?.getInt("count", 0)!!
        Log.i(TAG, "$TAG_CLASS: onRestoreInstanceState: count = $count")
    }
}

