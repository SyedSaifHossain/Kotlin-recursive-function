fun main(args: Array<String>) {

    rec()
}
var i = 0
fun rec(){
    if(i<=5){
        i++
        println("Bangladesh")
        rec()
    }

}