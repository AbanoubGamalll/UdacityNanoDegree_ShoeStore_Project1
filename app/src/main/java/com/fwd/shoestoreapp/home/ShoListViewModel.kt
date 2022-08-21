package com.fwd.shoestoreapp.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ShoListViewModel : ViewModel() {
    private var _list = MutableLiveData<MutableList<ShoeModel>>()

    private var _items = MutableLiveData<Int>()
    val items: LiveData<Int>
        get() = _items

    init {
        _list.value = mutableListOf()
    }

    fun addItem(s: ShoeModel) {
        _list.value?.add(s)
        _items.value = (_items.value?.plus(1)) ?: 0
    }

    fun lastItem(): ShoeModel {
        return (_list.value?.get(_items.value!!)) ?: ShoeModel("", "", "", "defult")
    }

}