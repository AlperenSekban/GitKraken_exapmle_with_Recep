package com.example.gitkraken_example_with_recep.ui.base

import android.app.ProgressDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.gitkraken_example_with_recep.R
import com.example.gitkraken_example_with_recep.hideLoadinginUtilty
import com.example.gitkraken_example_with_recep.showLoadingDialog

abstract class BaseFragment : Fragment(),MvpView {
lateinit var progressDialog: ProgressDialog

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_base, container, false)
    }

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