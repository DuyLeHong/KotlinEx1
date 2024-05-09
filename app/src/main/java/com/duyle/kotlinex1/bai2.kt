package com.duyle.kotlinex1

fun main () {
    // khai báo và sử dụng mảng
    var arrX = intArrayOf(1, 2, 3, 4)

    println(arrX.asList())

    println("Các phần tử trong mảng X:")
    // cách 1
    for (x in arrX) {
        println(x)
    }

    arrX[0] = 5
    arrX[1] = 7
    arrX[arrX.size - 1] = 8

    // danh sách
    var listX = arrX.asList().toMutableList()
    listX.add(6)

    // cách 2
    for (i in listX.indices) {
        println("Phần tử thứ $i trong list x: ${listX[i]}")
    }

    val listY = mutableListOf(3, 4, 5, 6)
    listY.add(0, 1)
    listY.removeAt(listY.size - 1)
    println("ListY : $listY")

    println("Nhập ten SV:")
    var s = readLine()
    if (s != null) {
        println(getMssv(s))
    }
}

private val MAP_DSSV : Map<String, String> = mutableMapOf("Nguyen Van Long" to "PH11311", "Le The Anh" to "PH11456", "Nguyen Chi Phong" to "PH66451")

// cú pháp when trong kotlin (thay thế switch case)
fun getMssv (tenSV : String) : String? {

    when (tenSV) {
        "Nguyen Van Long" -> {
            val mssv = MAP_DSSV.get(tenSV)
            return mssv
        }
        "Le The Anh" -> {
            return "PH14531"
        }
    }

    return "Khong co du lieu"
}


class bai2 {
}