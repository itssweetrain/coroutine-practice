package com.example.coroutine.chap1

/*
어떤 때는 스레드가 순서대로 실행되는 것처럼 보이고 어떤 때는 콘텐츠가 여기저기 흩어져 있음.
스케줄러는 각 스레드에 일정 시간을 제공하고 스레드는 그 시간 내에 완료되거나 다른 시간을 받을 때까지 정지됨.
 */
fun main() {
    val states = arrayOf("Starting", "Doing Task 1", "Doing Task 2", "Ending")
    repeat(3) {
        Thread {
            println("${Thread.currentThread()} has run.")
            for (i in states) {
                println("${Thread.currentThread()} - $i")
                Thread.sleep(50)
            }
        }.start()
    }
}
