package com.comaye.codingchallenge1

import androidx.lifecycle.ViewModel
class MainActivityViewModel(startingInput : Int): ViewModel(){
//-----------------------------------------------------------------------------------------
    private var total: Int = 0
    //-----------------------------------------------------------------------------------------
    init {
        total = startingInput
    }
    //-----------------------------------------------------------------------------------------
    fun GetTotal(): Int {
        return total
    }

    //-----------------------------------------------------------------------------------------
    fun setTotal(input:Int) {
        total+=input

    }
//-----------------------------------------------------------------------------------------
}