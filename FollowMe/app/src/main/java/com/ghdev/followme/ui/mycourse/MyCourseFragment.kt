package com.ghdev.followme.ui.mycourse

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import com.ghdev.followme.R


class MyCourseFragment : Fragment() {
    //recyclerview MVVM 구현 방법 알아보기


    //일단, fragment의 ui를 짭시다..!
    //그 후, 데이터가 바뀌면서 UI에 영향을 주는 것들에 대해 생각해보기
    //databinding 및 viewmodel에 적용
    //fragment와 viewmodel이어주기


    private val viewModel : MyCourseViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? { // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_course, container, false)
    }

    companion object {

        private const val ARG_PARAM1 = "param1"
        private const val ARG_PARAM2 = "param2"




        fun newInstance(param1: String?, param2: String?): MyCourseFragment {
            val fragment = MyCourseFragment()
            val args = Bundle()
            args.putString(ARG_PARAM1, param1)
            args.putString(ARG_PARAM2, param2)
            fragment.arguments = args
            return fragment
        }
    }
}