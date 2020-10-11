package com.example.gitkraken_example_with_recep

import android.app.Activity
import android.app.ProgressDialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentTransaction

val readTimeout: Long = 30
val connectTimeout: Long = 30
val key = "position"
val timeOutConnect: Long = 10
val splashScreenSleepTime:Long=3000

fun hideLoadinginUtilty(progressDialog: ProgressDialog) {
    if (progressDialog != null) {
        if (progressDialog.isShowing) {
            progressDialog.dismiss()
        }
    }
}

fun showLoadingDialog(context: Context): ProgressDialog {
    var progressDialog: ProgressDialog = ProgressDialog(context)
    if (!(context as Activity).isFinishing) {
        progressDialog.show()
    }
    if (progressDialog.window != null) {
        progressDialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    }
    progressDialog.setContentView(R.layout.progress_dialog)
    progressDialog.isIndeterminate = true
    progressDialog.setCancelable(false)
    progressDialog.setCanceledOnTouchOutside(false)
    return progressDialog
}

fun createFragment(Location: Int, fragment: Fragment, context: Context) {
    (context as FragmentActivity).supportFragmentManager.beginTransaction()
        .replace(Location, fragment, null)
        .setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
        .addToBackStack(null)
        .commit()


}

fun sendStringData(key: String, data: String, fragment: Fragment) {
    val args = Bundle()
    args.putString(key, data)
    fragment.arguments = args
}

fun goFragment(location: Int,fragment: Fragment,context: Context){
    (context as FragmentActivity).supportFragmentManager.beginTransaction()
        .replace(location,fragment,null)
        .setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
        .commit()
}