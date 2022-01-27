package com.udacity.shoestore.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe

class ShoeViewModel: ViewModel() {
    private var _shoes = MutableLiveData(mutableListOf<Shoe>())

    val shoes: LiveData<MutableList<Shoe>>
        get() = _shoes

    fun addShoe(name: String, company: String, size: String, description: String) {
        _shoes.value?.add(Shoe(name, size.toDouble(), company, description))
    }
}