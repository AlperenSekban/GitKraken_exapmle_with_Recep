package com.example.gitkraken_example_with_recep.ui.base

import android.app.ProgressDialog
import androidx.fragment.app.Fragment
import android.widget.Toast
import com.example.gitkraken_example_with_recep.hideLoadinginUtilty
import com.example.gitkraken_example_with_recep.showLoadingDialog

abstract class BaseFragment : Fragment(),MvpView {
lateinit var progressDialog: ProgressDialog


    override fun showLoading() {
        progressDialog = showLoadingDialog(requireContext())
    }

    override fun hideLoading() {
        hideLoadinginUtilty(progressDialog)
    }

    override fun showText(string: String) {
        Toast.makeText(requireContext(), string, Toast.LENGTH_LONG)
    }

}