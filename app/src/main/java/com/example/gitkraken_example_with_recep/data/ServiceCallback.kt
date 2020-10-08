package com.example.gitkraken_example_with_recep.data

interface ServiceCallback<T> {

    fun onSuccess(response:T?)
    fun onError(errorCode:Int,errorMessage:String)
}