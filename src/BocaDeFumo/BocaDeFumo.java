package BocaDeFumo;

import java.util.Date;

public class BocaDeFumo {

    private String  local;

    private String produtos;

    private String HoraFunc;

    private String tel;

    public BocaDeFumo(String local, String produtos, String horaFunc, String tel) {
        this.local = local;
        this.produtos = produtos;
        this.HoraFunc = horaFunc;
        this.tel = tel;
    }




    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getProdutos() {
        return produtos;
    }

    public void setProdutos(String produtos) {
        this.produtos = produtos;
    }



    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}


