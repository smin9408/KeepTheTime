package com.example.keepthetime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.keepthetime.adapters.MainViewPagerAdapter
import com.example.keepthetime.databinding.ActivityMainBinding
import com.example.keepthetime.datas.BasicResponse
import com.example.keepthetime.utils.ContextUtil
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : BaseActivity() {

    lateinit var binding: ActivityMainBinding

    lateinit var mAdapter: MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
    }

    override fun setValues() {

        mAdapter = MainViewPagerAdapter( supportFragmentManager )
        binding.mainViewPager.adapter = mAdapter

        binding.mainTabLayout.setupWithViewPager(binding.mainViewPager)










//        GET - /user 접근해서, 내 정보 조회.
//        토큰값이 필요함. => 로그인 성공시 토큰 저장, ContextUtil 에서 추출해서 사용.
//        apiList.getRequestMyInfo(ContextUtil.getLoginUserToken(mContext)).enqueue( object : Callback<BasicResponse>{
//            override fun onResponse(call: Call<BasicResponse>, response: Response<BasicResponse>) {
//
//                if(response.isSuccessful){
//
////                    JSON 응답을 서버에서 보고, 파싱부터 진행. => 파싱된 변수들을 활용.
////                    이미 파싱해둔 구조를 재활용.
//                    val br = response.body()!! // 타이핑을 덜 하기 위해 옮겨담는 변수.
//
//                    binding.txtUserNickname.text = br.data.user.nick_name
//
//                }
//
//            }
//
//            override fun onFailure(call: Call<BasicResponse>, t: Throwable) {
//            }
//
//        })

    }
}