package com.ghdev.followme.ui.base

import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ViewDataBinding

abstract class BaseActivity<VB: ViewDataBinding, VM : BaseViewModel> : AppCompatActivity(){

}