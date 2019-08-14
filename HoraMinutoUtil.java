package br.univille.poo.programacaoestruturada.registro;

public class HoraMinutoUtil {
	

	public static void acrescentaMinutos(HoraMinuto h, int minutos) {
		h.minuto += minutos;
		
		while (h.minuto >= 60)
		{
			h.hora = h.hora + 1;
			h.minuto = h.minuto - 60;
		}	
		if (h.hora >= 24)
			h.hora = h.hora - 24;
	}


}
