package lambda.comparator;

public class City {

	public City(int p, String n, String s){
		this.name = n;
		this.state = s;
		this.population = p;
	}
	
	private String name;
	private String state;
	private Integer population;
	
	public String getName(){
		return name;
	}
	
	public String getState(){
		return state;
	}
	
	public int getPopulation(){
		return population;
	}
	
	@Override
	public String toString(){
		return name + "," + state;
	}
}
