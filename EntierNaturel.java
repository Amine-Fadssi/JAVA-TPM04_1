package tp04_1;

public class EntierNaturel {
    int val;
    public EntierNaturel(int val) throws NombreNegatifException {
        if(val<0)
            throw new NombreNegatifException();
        this.val = val;
    }
    public int getVal() {
        return this.val;
    }
    public void setVal(int val) throws NombreNegatifException {
        if(val<0)
            throw new NombreNegatifException();
        this.val = val;
    }
    public void decrement() throws NombreNegatifException {
        if(this.val==0)
            throw new NombreNegatifException();
        this.val--;
    }
}
