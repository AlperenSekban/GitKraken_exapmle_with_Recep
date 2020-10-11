package com.example.gitkraken_example_with_recep.ui.commandlist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentPagerAdapter
import com.example.gitkraken_example_with_recep.R
import com.example.gitkraken_example_with_recep.ui.adapters.CommandAdapter
import com.example.gitkraken_example_with_recep.ui.base.BaseFragment
import javax.inject.Inject


class CommandListFragment : BaseFragment(), CommandListMvpView {
    lateinit var adapter: CommandAdapter
    @Inject
    lateinit var presenter:CommandListMvpPresenter<CommandListMvpView>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_command_list, container, false)
    }

}