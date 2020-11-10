package SingletonTP1.tp1.entities;

import java.util.ArrayList;
import java.util.List;

public class Singleton
{
	private List<Entity1> result = new ArrayList<Entity1>();
	
	private Singleton(){

    }
     
    private static Singleton INSTANCE = null;
     
    public static synchronized Singleton getInstance()
    {           
        if (INSTANCE == null)
        {   INSTANCE = new Singleton(); 
        	getEntity1s().add();
        }
        return INSTANCE;
    }
    
	public List<Entity1> getResult() {
		return result;
	}

	public void setResult(List<Entity1> result) {
		this.result = result;
	}
    
}