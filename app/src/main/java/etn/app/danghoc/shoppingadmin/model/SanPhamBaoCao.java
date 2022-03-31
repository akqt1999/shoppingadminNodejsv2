package etn.app.danghoc.shoppingadmin.model;

public class SanPhamBaoCao {
    private String   IdUser,TenSP,MoTa,hinh;
    private int IdSP,trangthai;
    private float GiaSP;

    public SanPhamBaoCao(String idUser, String tenSP, String moTa, String hinh, int idSP, int trangthai, float giaSP) {
        IdUser = idUser;
        TenSP = tenSP;
        MoTa = moTa;
        this.hinh = hinh;
        IdSP = idSP;
        this.trangthai = trangthai;
        GiaSP = giaSP;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

    public String getIdUser() {
        return IdUser;
    }

    public void setIdUser(String idUser) {
        IdUser = idUser;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String tenSP) {
        TenSP = tenSP;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String moTa) {
        MoTa = moTa;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public int getIdSP() {
        return IdSP;
    }

    public void setIdSP(int idSP) {
        IdSP = idSP;
    }

    public float getGiaSP() {
        return GiaSP;
    }

    public void setGiaSP(float giaSP) {
        GiaSP = giaSP;
    }
}
