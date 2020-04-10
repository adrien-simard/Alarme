
public class CapteurRadiation extends Capteur{
	private int niveau;
	private int seuil;
	private MoniteurB moniteur;

	
	
	public CapteursRadiation(int id,String localisation,int seuil,MoniteurB moni) {
		super(id,localisation);
		this.niveau = 0;
		this.seuil = seuil;
		this.moniteur = moni;
	}

	public int getNiveau() {
		return niveau;
	}


	private AlarmeRadiation generateAlarmeRadiation(String local,int importance,int niveau) {
		return new AlarmeRadiation(new GregorianCalendar().getTime(),local,importance,niveau);
	}

}
