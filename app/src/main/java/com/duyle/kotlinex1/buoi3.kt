package com.duyle.kotlinex1

fun main () {
    val soA = 5
    val soB = 10

    val tinhTong2 = {soA: Int , soB : Int -> {
        val a = 10
        val b = 15
        val c = a + b
        (soA + soB)
        }
    }

    val chiaDoi = {soA : Float -> soA / 2}

    val nhanDoi : (Int) -> Int = {it * 2}

    println("Nhan doi so 5: ${nhanDoi(5)}")
    println("Chia doi so 5: ${chiaDoi(5f)}")

    //region scope function
    val a = 5
    val nhanDoi2 = a.let {
        it * 2
    }
    println("Nhan doi so $a = ${nhanDoi2}")

    fun tinhTong (soA : Int, soB : Int) : Int {
        return (soA + soB)
    }

    val tenSV = "nguyen van long"
    val tenInHoa = with(tenSV) {
        tenSV.toUpperCase()
    }

    println(tenInHoa)

    val xe1 = CarModel("Xe 1", 500f)
    println(xe1)
    xe1.apply {
        tenXe = "Xe 1 ban moi 2024"
        giaXe = 550f
    }
    println(xe1)

    //endregion

    println("Cach 1: tong 2 so la: ${tinhTong(soA, soB)}")
    println("Cach 2: tong 2 so la: ${tinhTong2(soA, soB)()}")

    val str = "Buoi 3 - Android Kotlin"
    println("Do dai chuoi $str : ${getStringLength(str)}")

    println("Do dai chuoi null : ${getStringLength(null)}")
}

fun getStringLength (str: String?) : Int? {
    return str?.run {
        if (isEmpty())
            return 0
        length
    }
}
