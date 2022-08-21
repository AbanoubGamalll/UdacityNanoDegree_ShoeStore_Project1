package com.fwd.shoestoreapp.home

import android.util.Log
import androidx.databinding.BindingAdapter
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ShoListViewModel : ViewModel() {
    private var _list = MutableLiveData<MutableList<ShoeModel>>()

    private var _items = MutableLiveData<Int>()
    val items: LiveData<Int>
        get() = _items

    var Name: String = ""
    var Company: String = ""
    var Size: String = ""
    var Description: String = ""

    init {
        _list.value = mutableListOf()
    }

    fun addItem() {
        _list.value?.add(ShoeModel(Name, Company, Size, Description))
        _items.value = (_items.value?.plus(1)) ?: 0
        Name = ""
        Company = ""
        Size = ""
        Description = ""
    }


    fun lastItem(): ShoeModel {
        return (_list.value?.get(_items.value!!)) ?: ShoeModel("", "", "", "defult")
    }


}