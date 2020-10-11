package com.example.gitkraken_example_with_recep.ui.splashScreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gitkraken_example_with_recep.MvpApp
import com.example.gitkraken_example_with_recep.R
import com.example.gitkraken_example_with_recep.goFragment
import com.example.gitkraken_example_with_recep.ui.base.BaseFragment
import com.example.gitkraken_example_with_recep.ui.category.CategoryFragment
import javax.inject.Inject

class SplashScreenFragment : BaseFragment(),SplashScreenMvpView {

    var instance:SplashScreenFragment?=null

    @Inject
    lateinit var presenter: SplashScreenMvpPresenter<SplashScreenMvpView>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_splash_screen, container, false)

        (requireActivity().application as MvpApp).viewComponents?.injectSplashFragment(this)

        presenter.onAttact(this)
        presenter.initPresenter()

        return view
    }

    override fun openCategoriesFragment(){
        goFragment(R.id.activity_mainActivity_frameLayout,CategoryFragment().getInstance(),requireContext())

    }

    override fun getInstance(): Fragment {
        if (instance == null) {
            instance = SplashScreenFragment()
        }
        return instance as SplashScreenFragment
    }


}