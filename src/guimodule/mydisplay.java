package guimodule;
import java.util.HashMap;
import java.util.Map;

//import de.fhpotsdam.unfolding.Map;
import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.PApplet;
import processing.core.PConstants;

public class mydisplay extends PApplet {
	
	UnfoldingMap map;
	Map<String , Float> lifeExpByCountry;
 

	public void setup()
	{

		/*size(800,600,OPENGL);
		map = new UnfoldingMap(this, 50, 50, 700, 500, new Google.GoogleMapProvider());
		MapUtils.createDefaultEventDispatcher(this, map);
		*/
		
		
		lifeExpByCountry = loadLifeExpectancyFromCSV("data/LifeExpectancyWorldBank.csv");
		
		
		
		
	}
	
	private Map<String, Float> loadLifeExpectancyFromCSV(String fileName) 
	{
		// TODO Auto-generated method stub
		Map<String , Float> lifeExpMap = new HashMap<String , Float>();
		String[] rows = loadStrings(fileName);
		
		for(String row : rows)
		{
			String[] columns = row.split(",");
			if (1 == 1 ) {
				float value = Float.parseFloat(columns[5]);
				lifeExpMap.put(columns[4], value);
				
			}
		}
		return lifeExpMap;  
	
	}

	public void draw()
	{
		//map.draw();
		
		
	}
	
}
