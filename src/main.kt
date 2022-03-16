fun main(){
  var y=intergerArray(arrayOf(4,6,8))
    println(y)

 var add=sumInterger(arrayOf(2,11,4,6,1,8,2.5))
 println(add)

 var f=arrayVowel(arrayOf('a','b','c','d'))




}
fun intergerArray(num:Array<Int>):Int{
    var product=1
    num.forEach{multiply->
        product*=multiply
    }
    return product
    }

fun sumInterger(mixedArray: Array<Any>):Int{
    var k=0.0
    mixedArray.forEach{a->
        if (a is Double)
            k+=a
    }
       return k
}
fun arrayVowel(mixedArray: Array<Char>):Int{
    var f=0
    mixedArray.forEach{vowel->
        if (vowel =='a' || vowel =='b' || vowel =='c' || vowel =='d' ){
            f++
        }
    }
    return f
}