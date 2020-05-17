package com.ghdev.followme.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ghdev.followme.data.PostLoginResponse
import java.util.*

//android MVVM에서는 viewModel 생성시 viewModelProvider을 사용해야함.
//ViewModel을 위한 Factory를 만든 후 viewmodelProvider에게 전달.
//이렇게 하는 이유는 oncreate()에서 viewmodel을 초기화 할 시 viewmodel이 자칫 여러번 생성되거나 데이터 상태 손실이 발생하기 때문

class LoginViewModelFactory(private val listener: PostLoginResponse) : ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return LoginViewModel(listener) as T
    }
}