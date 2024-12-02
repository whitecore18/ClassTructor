class Car(val mass: Double, var speed: Double) {

    // Функция для движения автомобиля
    fun move() {
        if (speed > 0) {
            println("Автомобиль движется со скоростью $speed м/с.")
        } else {
            println("Автомобиль стоит на месте.")
        }
    }

    // Функция для остановки автомобиля
    fun stop() {
        speed = 0.0
        println("Автомобиль остановлен.")
    }
}