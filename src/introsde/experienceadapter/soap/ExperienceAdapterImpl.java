package introsde.experienceadapter.soap;
import introsde.document.model.*;
import introsde.meteoadapter.soap.*;
import introsde.mapsadapter.soap.Maps;
import introsde.mapsadapter.soap.MapsAdapter;
import introsde.mapsadapter.soap.MapsService;

import javax.jws.WebService;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

//Service Implementation

@WebService(endpointInterface = "introsde.experienceadapter.soap.ExperienceAdapter", serviceName="ExperienceService")
public class ExperienceAdapterImpl implements ExperienceAdapter {

	// Merge Meteo and Maps
	
	@Override
	public Experience getEventInfo(String startdate, String city, String venue, String origin) {
		// TODO Auto-generated method stub
		try {
	        MeteoService meteoS = new MeteoService();
	        MeteoAdapter resource2 = meteoS.getMeteoAdapterImplPort();
	        meteoS.getPorts();
	        
	        MapsService mapsS = new MapsService();
	        MapsAdapter resource = mapsS.getMapsAdapterImplPort();
	        mapsS.getPorts();
	        
			Experience exp = new Experience();
			Maps map = resource.getMaps(venue, city, origin);
			Meteo meteo = resource2.getMeteo(startdate, city);
			
			exp.setDistance(map.getDistance());
			exp.setDuration(map.getDuration());
			exp.setMax_temperature(meteo.getMaxTemperature());
			exp.setMin_temperature(meteo.getMinTemperature());
			exp.setPrecipitations(meteo.getPrecipitation());

			return exp;
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return null;
			
	}
}