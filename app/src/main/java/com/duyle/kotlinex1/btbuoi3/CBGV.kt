package com.duyle.kotlinex1.btbuoi3

class CBGV (hoten: String, tuoi: Int?, quequan: String?, mssv: String, var luongcung: Float, var lThuong: Float?, var lPhat: Float?) : NguoiModel(
    hoten,
    tuoi,
    quequan,
    mssv
) {
    var lThuclinh : Float = 0.0f
        get() = luongcung + (lThuong?:0f) - (lPhat?:0f)

    override fun toString(): String {
        return "CBGV(hoten=${hoten}, msgv=${mssv}, luongcung=$luongcung, lThuong=$lThuong, lPhat=$lPhat, lThuclinh=$lThuclinh)"
    }

}