package com.ghdev.followme.ui

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import com.ghdev.followme.R
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.startActivity

class LoginActivity : AppCompatActivity(), View.OnClickListener {


    override fun onClick(v: View?) {
        when(v) {

            //둘러보기 버튼
            btn_look_login_act -> {
                //ApplicationData.loginState = false

            }

            //회원가입하기
            btn_signup_login_act -> {
                startActivity<SignUpActivity>()
            }

            //키보드 다운
            rl_login_act -> {
                downKeyboard(rl_login_act)
            }

            //로그인하기
            btn_login_act -> {
            }

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        init()
    }

    private fun init() {

        btn_look_login_act.setOnClickListener(this)
        btn_signup_login_act.setOnClickListener(this)
        rl_login_act.setOnClickListener(this)
        btn_login_act.setOnClickListener(this)

    }


    private fun downKeyboard(view : View) {
        val imm: InputMethodManager = applicationContext!!.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }

}
