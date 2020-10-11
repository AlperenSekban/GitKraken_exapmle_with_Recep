package com.example.gitkraken_example_with_recep.ui.category

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gitkraken_example_with_recep.MvpApp
import com.example.gitkraken_example_with_recep.R
import com.example.gitkraken_example_with_recep.data.models.CategoriesModel
import com.example.gitkraken_example_with_recep.createFragment
import com.example.gitkraken_example_with_recep.sendStringData
import com.example.gitkraken_example_with_recep.ui.adapters.CategoryAdapter
import com.example.gitkraken_example_with_recep.ui.adapters.SendId
import com.example.gitkraken_example_with_recep.ui.base.BaseFragment
import com.example.gitkraken_example_with_recep.ui.commandlist.CommandListFragment
import com.example.gitkraken_example_with_recep.ui.splashScreen.SplashScreenFragment
import kotlinx.android.synthetic.main.fragment_category.*
import javax.inject.Inject


class CategoryFragment : BaseFragment(), CategoryfragmentMvpView, SendId {

    lateinit var adapter: CategoryAdapter
    var instance:CategoryFragment?=null

    @Inject
    lateinit var presenter: CategoryFragmentMvpPresenter<CategoryfragmentMvpView>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view = inflater.inflate(R.layout.fragment_category, container, false)

        (requireActivity().application as MvpApp).viewComponents?.injectCategoryFragment(this)
        adapter = CategoryAdapter(requireContext(),this)
        presenter.onAttact(this)
        presenter.initPresenter()

        return view
    }

    override fun loadDataCategoryList(categorylist: List<CategoriesModel>) {
        adapter.setData(categorylist)
        fragment_about_category_rcyclerView.layoutManager=LinearLayoutManager(requireContext())
        fragment_about_category_rcyclerView.adapter=adapter

    }


    override fun openCommandListFragment(key: String, id: String) {
        var commanListFragment = CommandListFragment().getInstance()
        sendStringData(key, id, commanListFragment)
        createFragment(R.id.activity_mainActivity_frameLayout, commanListFragment, requireContext())
    }

    override fun onItemClick(position: Int) {
        presenter.setCommandListFragment(position, requireContext())
    }

    override fun getInstance(): Fragment {
        if (instance == null) {
            instance = CategoryFragment()
        }
        return instance as CategoryFragment
    }


}