import java.util.Date;
import java.util.EventListener;

public interface AlarmeIncendieListener extends EventListener {
	public String receptionIncendie(Date dateApparition, String localisation,int importance);

}
