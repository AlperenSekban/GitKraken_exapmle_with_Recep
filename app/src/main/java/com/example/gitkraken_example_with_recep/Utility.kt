package com.example.gitkraken_example_with_recep

import android.app.Activity
import android.app.ProgressDialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable

val readTimeout: Long = 30
val connectTimeout: Long = 30

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
