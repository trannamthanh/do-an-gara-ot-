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
public class tiencong {
    private int matc;
    private string loaitc;
    Object getloaitc;
    public int getMatc() {
        return matc;
    }

    public void setMatc(int matc) {
        this.matc = matc;
    }

    public string getLoaitc() {
        return loaitc;
    }

    public void setLoaitc(String loaitc) {
        this.loaitc = loaitc();
    }

    public Object[] toobject() {
        return new Object[] {
            getmatc(), getloaitc()
        };
        
        
    }

    int getmatc() {
        return matc; //To change body of generated methods, choose Tools | Templates.
    }

    string getloaitc() {
        return loaitc; //To change body of generated methods, choose Tools | Templates.
    }

    private string loaitc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
