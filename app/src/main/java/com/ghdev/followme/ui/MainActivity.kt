package com.ghdev.followme.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import com.ghdev.followme.R
import com.ghdev.followme.ui.base.BasePagerAdapter
import com.ghdev.followme.ui.mycourse.MyCourseFragment
import com.ghdev.followme.ui.mypage.MypageFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ViewPager
        viewpager.run {
            adapter = BasePagerAdapter(supportFragmentManager).apply {
                addFragment(HomeFragment())
                addFragment(SearchFragment())
                addFragment(MyCourseFragment())
                addFragment(CourseRecommendFragment())
                addFragment(MypageFragment())
            }
            offscreenPageLimit = 4
        }

        // TabLayout
        tablayout.run {
            val navigationLayout: View =
                LayoutInflater.from(this@MainActivity).inflate(R.layout.activity_main_navi, null, false)

            setupWithViewPager(viewpager)
            getTabAt(0)!!.customView =
                navigationLayout.findViewById(R.id.img_home_main_navi_act) as ImageView
            getTabAt(1)!!.customView =
                navigationLayout.findViewById(R.id.img_search_main_navi_act) as ImageView
            getTabAt(2)!!.customView =
                navigationLayout.findViewById(R.id.img_course_main_navi_act) as ImageView
            getTabAt(3)!!.customView =
                navigationLayout.findViewById(R.id.img_course_recommend_main_navi_act) as ImageView
            getTabAt(4)!!.customView =
                navigationLayout.findViewById(R.id.img_mypage_main_navi_act) as ImageView
        }
    }

}
