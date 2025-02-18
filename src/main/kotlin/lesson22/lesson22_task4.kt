package org.example.lesson22


class MainScreenViewModel(
    private val mainScreenState: MainScreenState = MainScreenState(),
) {

    data class MainScreenState(
        val data: String = "",
        val isLoading: Boolean = false,
    )

    fun loadData() {
        var currentState = mainScreenState.copy(data = "отсутствие данных")
        println(currentState)
        println()
        currentState = mainScreenState.copy(data = "Загрузка данных", isLoading = true)
        println(currentState)
        println()
        currentState = mainScreenState.copy(data = "наличие загруженных данных", isLoading = false)
        println(currentState)
    }
}

fun main() {
    val screen = MainScreenViewModel()

    screen.loadData()
}