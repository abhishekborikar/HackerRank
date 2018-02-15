//problem link 
//https://www.hackerrank.com/contests/womenscup/challenges/magical-string-1/problem
package MagicalString

import java.util.*
import kotlin.collections.ArrayList

fun main(args: Array<String>){

    val sc = Scanner(System.`in`)
    var t:Int = sc.nextInt()
    var S:String
    var arr  = formString()

    while(t-->0){
       var T:Char = sc.next()[0]
        var N:Int = sc.nextInt()

        if(T == '1'){
            println(arr[N-1])
        }
        else{
            println(N - arr[N-1])
        }
    }
}

fun formString():IntArray{

    var ones = IntArray(10000000)
    val sb = StringBuilder()
    ones[0] = 1
    ones[1] = 1
    ones[2] = 1
    var S:String = "122"
    var i:Int = 2
    var j:Int = 2
    sb.append(S)


    while(sb.length<=5000000 || j<=5000000){
        if(sb[i++] == '2'){
            if(sb[j]=='1'){
                sb.append("22")
                ones[++j] = ones[j-1]
                ones[++j] = ones[j-1]
            }
            else{
                sb.append("11")
                ones[++j] = ones[j-1]+1
                ones[++j] = ones[j-1]+1
            }
        }
        else{
            if(sb[j]=='1'){
                sb.append("2")
                ones[++j] = ones[j-1]

            } else{
                sb.append("1")
                ones[++j] = ones[j-1]+1

            }
        }
    }
    
    //best ways to count occurances of some character in least time is make array and store after every or some specific index
    return ones
}
