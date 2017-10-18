/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trung;

/**
 *
 * @author ManhCuong
 */
public class HX {
    private int mahx;
    private String tenhx;
    Object gettenhx;
    

    public int getMahx() {
        return mahx;
    }

    public void setMahx(int mahx) {
        this.mahx = mahx;
    }

    public String getTenhx() {
        return tenhx;
    }

    public void setTenhx(String tenhx) {
        this.tenhx = tenhx;
    }

    public Object[] toobject() {
        return new Object[] {
            getmahx(), gettenhx()
        };
        
        
    }

    int getmahx() {
        return mahx; //To change body of generated methods, choose Tools | Templates.
    }

    String gettenhx() {
        return tenhx; //To change body of generated methods, choose Tools | Templates.
    }

//    void setmahx(String text) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

//    void settenhx(String text) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

//    void setTenhx() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    
    
    
}
