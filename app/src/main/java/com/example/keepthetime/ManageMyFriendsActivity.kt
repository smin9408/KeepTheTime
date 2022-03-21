package com.example.keepthetime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.UserData
import androidx.databinding.DataBindingUtil
import com.example.keepthetime.databinding.ActivityManageMyFriendsBinding
import com.example.keepthetime.datas.BasicResponse
import com.example.keepthetime.utils.ContextUtil
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ManageMyFriendsActivity : BaseActivity() {

    lateinit var binding: ActivityManageMyFriendsBinding

    val mFriendList = ArrayList<UserData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_manage_my_friends)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
    }

    override fun setValues() {
        getMyFriendListFromServer()
    }

    fun getMyFriendListFromServer() {

        apiList.getRequestFriendList(
            ContextUtil.getLoginUserToken(mContext),
            "my" // 수락 완료된 친구목록만 불러오기
        ).enqueue(object : Callback<BasicResponse> {
            override fun onResponse(call: Call<BasicResponse>, response: Response<BasicResponse>) {
            }

            override fun onFailure(call: Call<BasicResponse>, t: Throwable) {
            }
        })

    }
}