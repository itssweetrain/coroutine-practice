package com.example.coroutine.chap1

/*
kotlin 에서 멀티스레딩을 사용하여 새로운 스레드를 생성하고 시작.
스레드 스케줄링에 의해 메인 스레드와 새로운 스레드의 실행 순서는 정확하게 예측할 수 없음.
그렇기 때문에 각 실행마다 출력되는 결과가 다를 수 있음.
Thread.currentThread()는 현재 실행 중인 스레드를 나타내는 메소드. 이 메소드는 Thread 클래스의 정적 메소드로 현재 실행 중인 스레드를 반환.
Thread[Thread-0,5,main] has run.
"Thread-0"은 새로 생성된 스레드의 이름, "5"는 스레드의 우선순위이며, "main"은 스레드 그룹. 위의 결과에서는 "Thread-0"이라는 스레드에서 실행된 것.
 */
fun main() {
    val thread = Thread {
        println("${Thread.currentThread()} has run.")
    }
    thread.start()
}
