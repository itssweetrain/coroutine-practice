package com.example.coroutine.chap2

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/*
global coroutine scope
A global CoroutineScope not bound to any job. Global scope is used to launch top-level coroutines which are operating on the whole application lifetime and are not cancelled prematurely.
Active coroutines launched in GlobalScope do not keep the process alive. They are like daemon threads.
 */
fun main() = runBlocking {
    repeat(3) {
        GlobalScope.launch {
            println("${Thread.currentThread()} has run.")
        }
    }
}
