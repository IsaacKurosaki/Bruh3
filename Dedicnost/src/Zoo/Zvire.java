package Zoo;

	import java.time.LocalDate;
	import java.util.ArrayList;

	public class Zvire {
		private LocalDate datumNarozeni;
		private ArrayList hodinyKrmeni;
		private int pocetKrmeniZaDen;
		private String jmeno;
		boolean zijuVCesku;
		
		public Zvire(LocalDate datumNarozeni, ArrayList hodinyKrmeni, int pocetKrmeniZaDen, String jmeno, boolean zijuVCesku) {
			this.datumNarozeni = datumNarozeni;
			this.hodinyKrmeni = hodinyKrmeni;
			this.jmeno = jmeno;
			this.pocetKrmeniZaDen = pocetKrmeniZaDen;
			this.zijuVCesku = zijuVCesku;

	}
		public void vypisInformace() {
			System.out.println("Datum narozeni zvirete je: " +datumNarozeni+ ", hodiny krmení jsou: " +hodinyKrmeni+ ", pocet krmeni za den: " +pocetKrmeniZaDen+ ", jmeno zvirete je: "+jmeno+ " a v cesku" +zijuVCesku);
		}
		public LocalDate getDatumNarozeni() {
			return datumNarozeni;
		}
		public void setDatumNarozeni(LocalDate datumNarozeni) {
			this.datumNarozeni = datumNarozeni;
		}
		public ArrayList getHodinyKrmeni() {
			return hodinyKrmeni;
		}
		public void setHodinyKrmeni(ArrayList hodinyKrmeni) {
			this.hodinyKrmeni = hodinyKrmeni;
		}
		public int getPocetKrmeniZaDen() {
			return pocetKrmeniZaDen;
		}
		public void setPocetKrmeniZaDen(int pocetKrmeniZaDen) {
			this.pocetKrmeniZaDen = pocetKrmeniZaDen;
		}
		public String getJmeno() {
			return jmeno;
		}
		public void setJmeno(String jmeno) {
			this.jmeno = jmeno;
		}
		public boolean isZijuVCesku() {
			return zijuVCesku;
		}
		public void setZijuVCesku(boolean zijuVCesku) {
			this.zijuVCesku = zijuVCesku;
		}
}
