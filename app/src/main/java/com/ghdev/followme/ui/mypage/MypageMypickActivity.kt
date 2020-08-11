package com.ghdev.followme.ui.mypage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.ghdev.followme.R
import com.ghdev.followme.data.test.PlaceInfo
import com.ghdev.followme.ui.HotPlaceRecyclerViewAdapter
import kotlinx.android.synthetic.main.activity_mypage_mypick.*
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.item_hot_place.*
import org.jetbrains.anko.verticalLayout

class MypageMypickActivity : AppCompatActivity(), View.OnClickListener{

    override fun onClick(v: View?) {
        when(v){
            //editmode 전환
            btn_mypick_editmode -> {
                Log.d("btn_mypick: ", "안녕??")
                //체크박스와 휴지통이미지 visibility
                btn_mypick_editmode_delete.visibility = View.VISIBLE
                btn_mypick_editmode_unchecked.visibility = View.VISIBLE

            }

        }

    }

    lateinit var hotPlaceRecyclerViewAdapter: HotPlaceRecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mypage_mypick)

        var dataList: ArrayList<PlaceInfo> = ArrayList()

        dataList.add(PlaceInfo("", "하", "서울시 노원구 공릉동 131313"))
        dataList.add(PlaceInfo("", "하", "서울시 노원구 공릉동 131313"))
        dataList.add(PlaceInfo("", "하", "서울시 노원구 공릉동 131313"))
        dataList.add(PlaceInfo("", "하", "서울시 노원구 공릉동 131313"))
        dataList.add(PlaceInfo("", "하", "서울시 노원구 공릉동 131313"))
        dataList.add(PlaceInfo("", "하", "서울시 노원구 공릉동 131313"))
        dataList.add(PlaceInfo("", "하", "서울시 노원구 공릉동 131313"))
        dataList.add(PlaceInfo("", "하", "서울시 노원구 공릉동 131313"))
        dataList.add(PlaceInfo("", "하", "서울시 노원구 공릉동 131313"))
        dataList.add(PlaceInfo("", "하", "서울시 노원구 공릉동 131313"))
        dataList.add(PlaceInfo("", "하", "서울시 노원구 공릉동 131313"))
        dataList.add(PlaceInfo("", "하", "서울시 노원구 공릉동 131313"))

        hotPlaceRecyclerViewAdapter = HotPlaceRecyclerViewAdapter(dataList)
        rv_mypick.adapter = hotPlaceRecyclerViewAdapter
        rv_mypick.layoutManager = GridLayoutManager(this, 2)

        //hello?

    }


}
