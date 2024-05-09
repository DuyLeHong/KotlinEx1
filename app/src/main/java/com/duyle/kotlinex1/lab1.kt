package com.duyle.kotlinex1

fun main () {
    println("Lab 1 - MD18305")

    // Khai báo biến: dùng val, var
    var a = 1
    a = 3
    val b = 2
    val c = a + b
    println("Tổng 2 số $a và $b là: $c")

    // Khai báo biến - ro kieu du lieu
    val sothunhat : Int
    sothunhat = 3
    var sothuhai : Float = 4f

    val mess : String = "Tich 2 so $sothunhat va $sothuhai la: ${sothunhat * sothuhai}"
    println(mess)

    val soA = 5f
    val soB = 6f

    println("Thuong 2 so $soA va $soB la: ${phepChia(soA, soB)}")

    val diachi = """
    Quận 12,
    TPHCM
    """

    println(diachi)
}

fun phepChia (soA: Float, soB : Float) : Float {

    if (soB == 0f) {
        return 0f
    }

    val thuong = soA / soB

    return thuong
}

class lab1 {
}