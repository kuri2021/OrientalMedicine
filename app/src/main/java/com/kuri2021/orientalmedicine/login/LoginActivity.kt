package com.kuri2021.orientalmedicine.login

import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.kuri2021.orientalmedicine.R
import com.kuri2021.orientalmedicine.databinding.ActivityLoginBinding
import com.kuri2021.orientalmedicine.login.viewmodel.LoginViewModel

class LoginActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityLoginBinding
    private val model: LoginViewModel by viewModels()
    private lateinit var login_layout: LinearLayout
    private lateinit var login_gradation:View

    private lateinit var fadeInAnim: Animation


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_login)

        mBinding.lifecycleOwner = this
        mBinding.loginviewmodel = model

        login_layout = findViewById(R.id.login_layout)
        login_gradation= findViewById(R.id.login_gradation)
        fadeInAnim()

    }

    fun fadeInAnim() {
        fadeInAnim = AnimationUtils.loadAnimation(this, R.anim.fade)
        login_gradation.startAnimation(fadeInAnim)
        Handler().postDelayed(Runnable {
            login_layout.visibility=View.VISIBLE
        }, 700) // 0.6초 정도 딜레이를 준 후 시작


    }
}