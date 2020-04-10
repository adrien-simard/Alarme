import java.util.GregorianCalendar;

public class CapteurIncendie extends Capteur{
	

	private boolean fumee;
	private int intensite;
	private MoniteurA moniteur;
	
	public CapteurIncendie(int id,String local,MoniteurA moni) {
		super(id,local);
		this.fumee = false;
		this.intensite = 0;
		this.moniteur = moni;
	}
		
	public boolean isFumee() {
		return fumee;
		}
	public int getIntensite() {
		return intensite;
	}

	public void setIntensite(int intensite) {
		this.intensite = intensite;
	}
	private AlarmeIncendie genererAlarmeIncendie(String local,int importance) {
		return new AlarmeIncendie(new GregorianCalendar().getTime(),local,importance);
	}

}

