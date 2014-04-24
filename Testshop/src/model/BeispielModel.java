package model;

public class BeispielModel {
	
	/*
	 * Hier gibts nichts Besonderes:
	 * 
	 * eine ganz normale Klasse mit Attributen, Gettern & Settern. 
	 */
	
	
	/*
	 * BeispielAttribute
	 */
	private int modelNummer;
	private String modelName;
	private String modelFarbe;
	
	
	/*
	 * Getter & Setter
	 */
	
	/**
	 * Gibt die Nummer des Models zurueck.
	 * @return
	 * Die Nummer des Models als <i>int<i/>.
	 */
	public int getModelNummer()
	{
		return modelNummer;
	}
	
	/**
	 * Setzt die Nummer des Models.
	 * @param modelNummer
	 * Die Nummer des Models als <i>int<i/>.
	 */
	public void setModelNummer(int modelNummer)
	{
		this.modelNummer = modelNummer;
	}
	
	/**
	 * Gibt den Namen des Models zurueck.
	 * @return
	 * Der Name des Models als <i>String<i/>.
	 */
	public String getModelName()
	{
		return modelName;
	}
	
	/**
	 * Setzt den Namen des Models.
	 * @param modelNummer
	 * Der name des Models als <i>String<i/>.
	 */
	public void setModelName(String modelName)
	{
		this.modelName = modelName;
	}
	
	/**
	 * Gibt die Farbe des Models zurueck.
	 * @return
	 * Die Farbe des Models als <i>String<i/>.
	 */
	public String getModelFarbe()
	{
		return modelFarbe;
	}
	/**
	 * Setzt die Farbe des Models.
	 * @param modelNummer
	 * Die Farbe des Models als <i>String<i/>.
	 */
	public void setModelFarbe(String modelFarbe)
	{
		this.modelFarbe = modelFarbe;
	}
}
