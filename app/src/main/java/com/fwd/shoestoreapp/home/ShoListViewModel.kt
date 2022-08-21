package com.fwd.shoestoreapp.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ShoListViewModel : ViewModel() {
    private var _list = MutableLiveData<MutableList<ShoeModel>>()
    val list: LiveData<MutableList<ShoeModel>>
        get() = _list


    fun addItem(s: ShoeModel) {
        _list.value?.add(s)
    }

}