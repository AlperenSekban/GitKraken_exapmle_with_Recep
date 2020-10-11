package com.example.gitkraken_example_with_recep.ui.commandlist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.FragmentPagerAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gitkraken_example_with_recep.MvpApp
import com.example.gitkraken_example_with_recep.R
import com.example.gitkraken_example_with_recep.data.models.CommandModel
import com.example.gitkraken_example_with_recep.key
import com.example.gitkraken_example_with_recep.ui.adapters.CommandAdapter
import com.example.gitkraken_example_with_recep.ui.base.BaseFragment
import com.example.gitkraken_example_with_recep.ui.category.CategoryFragment
import kotlinx.android.synthetic.main.fragment_command_list.*
import javax.inject.Inject


class CommandListFragment : BaseFragment(), CommandListMvpView {
    lateinit var adapter: CommandAdapter
    lateinit var position: String
    var instance:CommandListFragment?=null

    @Inject
    lateinit var presenter: CommandListMvpPresenter<CommandListMvpView>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        position = arguments?.getString(key).toString()
        (requireActivity().application as MvpApp).viewComponents?.injectCommandListFragment(this)
        presenter.onAttact(this)
        presenter.initPresenter()

        return inflater.inflate(R.layout.fragment_command_list, container, false)
    }

    override fun loadDataToList(response: List<CommandModel>) {
        adapter= CommandAdapter(requireContext(),response)
        adapter.setData(response)
        fragment_commandListFragment_rcyclerView.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayout.VERTICAL, false)
        fragment_commandListFragment_rcyclerView.adapter = adapter
    }

    override fun takePosition(): String {
        return position
    }

    override fun getInstance(): Fragment {
        if (instance == null) {
            instance = CommandListFragment()
        }
        return instance as CommandListFragment
    }

}