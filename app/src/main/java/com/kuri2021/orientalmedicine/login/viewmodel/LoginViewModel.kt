package com.kuri2021.orientalmedicine.login.viewmodel

import android.app.Application
import android.util.Log
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.kuri2021.orientalmedicine.R

class LoginViewModel(application: Application):AndroidViewModel(application) {

    private val context=getApplication<Application>().applicationContext
    var imag=MutableLiveData<Int>()
    //    애니매이션(in)

    val login_title="LOGIN"
    val login_id_edit_title="ID"
    val login_pw_edit_title="PASSWORD"


    init {
        imag.value=0
    }


    fun login(){
        Log.d("login","로그인 진행")
    }


}