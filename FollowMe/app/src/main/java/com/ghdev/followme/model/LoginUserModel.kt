package com.ghdev.followme.model

import androidx.databinding.BaseObservable
import org.json.JSONObject

/*
MVVM 패턴의 Model
Model은 View에 표시할 데이터를 의미. 즉, View에서 이 Model을 가져다가 뿌려준다는 의미.
View는 보여주는 일만, Model은 데이터만 담당하게 만들기!
 */


//BaseObservable 을 상속받는 Data Class만들기.
//BaseObservable은 DataBinding 라이브러리 클래스이다. 이는 자동으로 업데이트 하기 위해 사용한다.
class LoginUserModel(private var email:String, private var password:String) : BaseObservable() {


    fun getEmail():String{
        return email
    }

    fun getPassword():String{
        return password
    }

    fun setEmail(email: String){
        this.email = email
    }

    fun setPassword(password: String){
        this.password = password
    }
}