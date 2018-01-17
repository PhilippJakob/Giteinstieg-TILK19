package schlösser;

public class kombinationsschloss
{
	public int bolzenbreite = 20;
	public boolean schließzustand = false;
	public int skombinationStelleEins = 4;
	public int skombinationStelleZwei = 0;
	public int skombinationStelleDrei = 4;

	public int gkombinationStelleEins = 9;
	public int gkombinationStelleZwei = 9;
	public int gkombinationStelleDrei = 9;

	public void kontrollierenKombination()
	{
		if(gkombinationStelleEins == skombinationStelleEins)
		{
			System.out.println("Klick");
			if(gkombinationStelleZwei == skombinationStelleZwei)
			{
				System.out.println("Klick");
				if(gkombinationStelleDrei == skombinationStelleEins)
				{
					System.out.println("Klick, geöffnet!");
				}
			}
		}
	}

}
