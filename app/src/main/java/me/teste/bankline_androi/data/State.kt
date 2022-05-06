package me.teste.bankline_androi.data

import android.webkit.ConsoleMessage

sealed class State<out T>{
    data class Success<out R>(val data: R? = null) :State<R?>()
    data class Error(val message: String? = null) :State<Nothing>()
    object Wait : State<Nothing>()
}
