package com.example.keepthetime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.keepthetime.databinding.ActivityMainBinding
import com.example.keepthetime.datas.BasicResponse
import com.example.keepthetime.utils.ContextUtil
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : BaseActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
    }

    override fun setValues() {

//        GET - /user 접근해서, 내 정보 조회.
//        토큰값이 필요함. => 로그인 성공시 토큰 저장, ContextUtil 에서 추출해서 사용.
        apiList.getRequestMyInfo(ContextUtil.getLoginUserToken(mContext)).enqueue( object : Callback<BasicResponse>{
            override fun onResponse(call: Call<BasicResponse>, response: Response<BasicResponse>) {
            }

            override fun onFailure(call: Call<BasicResponse>, t: Throwable) {
            }

        })

    }
}