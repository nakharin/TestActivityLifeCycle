package avtivitylifecycle.nakharin.com.testactivitylifecycle

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SecondActivity : AppCompatActivity() {

    private val TAG = "999"
    private val TAG_CLASS = "SecondActivity"

    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.d(TAG, "$TAG_CLASS: onCreate")

        count = 999
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "$TAG_CLASS: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "$TAG_CLASS: onResume")
        Log.d(TAG, "$TAG_CLASS: count: $count")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "$TAG_CLASS: onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "$TAG_CLASS: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "$TAG_CLASS: onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "$TAG_CLASS: onDestroy")
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        outState?.run {
            putInt("count", count)
        }
        Log.d(TAG, "$TAG_CLASS: onSaveInstanceState: ${outState?.toString()}")
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        count = savedInstanceState?.getInt("count", 0)!!
        Log.d(TAG, "$TAG_CLASS: onRestoreInstanceState: count = $count")
    }
}

