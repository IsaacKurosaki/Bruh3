package Zoo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Savec extends Zvire {
  
private final boolean TEPLOKREVNOST=true;
private double telesnaTeplota;
	public Savec(LocalDate datumNarozeni, ArrayList hodinyKrmeni, int pocetKrmeniZaDen, String jmeno,
			boolean zijuVCesku) {
		super(datumNarozeni, hodinyKrmeni, pocetKrmeniZaDen, jmeno, zijuVCesku);
        this.telesnaTeplota = telesnaTeplota;		
		
	}
public void vydejZvuk(String citoslovce) {
	System.out.println(citoslovce);
}    	
public double getTelesnaTeplota() {
	return telesnaTeplota;
}
public void setTelesnaTeplota(double telesnaTeplota) {
	this.telesnaTeplota = telesnaTeplota;
}
    }
	 

