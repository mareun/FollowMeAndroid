package com.ghdev.followme.ui

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import com.ghdev.followme.R
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity(),  View.OnClickListener {

    override fun onClick(v: View?) {

        when (v) {
            //중복확인 버튼
            btn_id_check_sign_id_set_act -> {
                //##

            }

            //키보드 내리기
            rl_signup_act -> {
                downKeyboard(rl_signup_act)
            }

            //가입하기
            btn_agree_sign_id_set_act -> {

                val id = et_id_sign_up_act.text.toString()
                val gender = "M"
                val password = et_pw_check_sign_up_act.text.toString()
                //val deviceToken = singWithEmailPassword(email, password)

                val type = "type"
                val pushAllow = "true"

            }

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        init()
    }

    private fun init() {

        btn_id_check_sign_id_set_act.setOnClickListener(this)
        rl_signup_act.setOnClickListener(this)
        btn_agree_sign_id_set_act.setOnClickListener(this)

    }



    private fun downKeyboard(view : View) {
        val imm: InputMethodManager = applicationContext!!.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }

}
