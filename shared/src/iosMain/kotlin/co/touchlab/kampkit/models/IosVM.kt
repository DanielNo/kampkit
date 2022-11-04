package co.touchlab.kampkit.models

actual abstract class IosVM: AllyViewModel() {
    public actual final val name: String = "Daniel"

    protected actual override fun testMethod(){
        print("hello from ios")
    }
}