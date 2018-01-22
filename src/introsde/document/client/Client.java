package introsde.document.client;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import introsde.document.model.*;
import introsde.experienceadapter.soap.ExperienceAdapter;
import introsde.mapsadapter.soap.*;
import introsde.meteoadapter.soap.Meteo;
import introsde.meteoadapter.soap.MeteoAdapter;
import introsde.meteoadapter.soap.MeteoService;

public class Client {
    public static void main(String[] args) throws Exception {
    	/*
        URL url = new URL("http://192.168.1.102:6903/experienceadapter?wsdl");
        // 1st argument service URI, refer to wsdl document above
        // 2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://soap.experienceadapter.introsde/", "ExperienceService");
        Service service = Service.create(url, qname);
        ExperienceAdapter hello = service.getPort(ExperienceAdapter.class);
        
        
        Experience m = hello.getEventInfo("2018-06-12", "Milano", "Alcatraz Milano", "Rovereto Trento");
        System.out.println(m);
        */
    	
    	try {
    		MapsService ss = new MapsService();
    		MapsAdapter sa = ss.getMapsAdapterImplPort();
    	// (String venue, String city, String origin)
    		Maps m = sa.getMaps("Supercinema", "Rovereto", "Trento");
        	System.out.println(m.getDistance());
        	System.out.println(m.getDuration());
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
        
    	try {
	        MeteoService sss = new MeteoService();
	        MeteoAdapter ssa = sss.getMeteoAdapterImplPort();
	        Meteo mm = ssa.getMeteo("2018-06-06", "Trento");
	        System.out.println(mm.getPrecipitation()+" "+mm.getMaxTemperature()+"  "+mm.getMinTemperature());
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }
}