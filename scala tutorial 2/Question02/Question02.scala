object question02 {

    def main(args: Array[String]) = {
        var (a,b,c,d) = (2,3,4,5)
        var k = 4.3

        println( (b-1) * a + c * (d-1) )
        println( (a+1) )
        println( -2 * (9-k) + c)
        //println( c = (c+1) ) |method println in object Predef: (x: Any): Unit does not have a parameter c
        //println( c = (c+1) * (a+1) ) |method println in object Predef: (x: Any): Unit does not have a parameter c
    }

}