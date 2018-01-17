package türen;

public class BlyatTür 
{
	public final int maxTrefferpunkte = 100;
	public int trefferpunkte;

	/*
	 * Die Blyat Tür :D
	 */
	public BlyatTür() 
	{
		this.trefferpunkte = this.maxTrefferpunkte;
	}

	/*
	 * Die Blyat Tür mit einstellbaren Trefferpunkten
	 */
	public BlyatTür(int pTrefferpunkte) 
	{
		this.trefferpunkte = pTrefferpunkte;
	}
	
	/*
	 * Gibt die aktuellen Trefferpunkte aus
	 */
	public void ausgebenTrefferpunkte() 
	{
		System.out.println(String.format("Die Blyat Tür hat %1$s/%2$s Trefferpunkte", trefferpunkte, maxTrefferpunkte));
	}

	/*
	 * Repariert die Blyat Tür um x Trefferpunkte
	 */
	public void reparierenTür(int pTrefferpunkte) 
	{
		System.out.println(String.format("Die Blyat Tür wurde um %1$s Trefferpunkte repariert", pTrefferpunkte));
	}

	/*
	 * Zerstört die Blyat Tür
	 */
	public void zerstörenTür() 
	{
		System.out.println("Die Blyat Tür kann man nicht zerstören");
	}
}
