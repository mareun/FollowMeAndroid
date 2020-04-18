package com.ghdev.followme.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.CallSuper
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel

//###internal abstract 가 무엇인지 알아보기!!
abstract class BaseFragment<VB : ViewDataBinding, VM : ViewModel> : Fragment() {

    abstract val layoutResId: Int

    lateinit var binding: VB

    abstract val viewModel: VM

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, layoutResId, container, false)
        binding.lifecycleOwner = this

        return binding.root
    }

    @CallSuper
    override fun onDestroyView() {
        super.onDestroyView()

    }
}