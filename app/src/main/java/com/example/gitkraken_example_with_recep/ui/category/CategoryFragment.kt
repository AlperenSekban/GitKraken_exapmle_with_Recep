package com.example.gitkraken_example_with_recep.ui.category

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gitkraken_example_with_recep.MvpApp
import com.example.gitkraken_example_with_recep.R
import com.example.gitkraken_example_with_recep.ui.base.BaseFragment
import javax.inject.Inject


class CategoryFragment : BaseFragment(),CategoryfragmentMvpView {

    @Inject
    lateinit var presenter:CategoryFragmentMvpPresenter<CategoryfragmentMvpView>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view =inflater.inflate(R.layout.fragment_category, container, false)

        (requireActivity().application as MvpApp).viewComponents?.injectCategoryFragment(this)

        presenter.onAttact(this)
        presenter.initPresenter()

        return view
    }


}