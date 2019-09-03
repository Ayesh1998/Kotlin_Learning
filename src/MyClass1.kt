import com.exmple.Car

fun main(args: Array<String>) {

//    Variables

    var no = 10
    var name = "Ayesh"
//    define and declare after that
    var NameMy: String
    NameMy = "Lakshan"

//    final in kotlin
    val fixedName = "Ayesh Lakshan"

//    println("Hi kotlin")
//    show("Ayesh")

    var person = Person()
    person.showDetails("Ayesh KOlla")
    person.names = "Ayeshs"
    person.show()

//    concatanation without plus sign
    println("Name with concatnation ${person.names}")

    var car = Car("Benz")
    car.display()

}

//    creating function
fun show(name:String){
    println(name)
}



//Creting a class and method inside it
class Person{

    var names:String = ""
    fun showDetails(name:String){
        println(name)
    }

    fun show(){
        println(names)
    }

}



