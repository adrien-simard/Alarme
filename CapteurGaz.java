
public class CapteurGaz extends Capteur {
	private String type;
	private MoniteurA moniteurA;
	private MoniteurB moniteurB;

	
	
	public CapteursGaz(int id,String localisation,MoniteurA moniA, MoniteurB moniB) {
		super(id,localisation);
		this.type = "";
		this.moniteurA = moniA;
		this.moniteurB = moniB;
	}


	public String getType() {
		return type;
	}

	
	
	private AlarmeGaz generateAlarmeGaz(String local,int importance,String type) {
		return new AlarmeGaz(new GregorianCalendar().getTime(),local,importance,type);
	}

}
