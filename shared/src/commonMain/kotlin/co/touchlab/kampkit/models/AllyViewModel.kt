package co.touchlab.kampkit.models

expect abstract class AllyViewModel {
    val name: String
    protected open fun testMethod()
}