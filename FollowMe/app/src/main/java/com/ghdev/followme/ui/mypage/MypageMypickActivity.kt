package com.ghdev.followme.ui.mypage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.ghdev.followme.R
import com.ghdev.followme.data.test.PlaceInfo
import com.ghdev.followme.ui.HotPlaceRecyclerViewAdapter
import kotlinx.android.synthetic.main.activity_mypage_mypick.*
import kotlinx.android.synthetic.main.fragment_home.*
import org.jetbrains.anko.verticalLayout

class MypageMypickActivity : AppCompatActivity() {

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


    }
}
