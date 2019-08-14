package br.univille.poo.programacaoestruturada.registro;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HoraMinutoUtilTests {
	
	@Test
	public void acrescentaMinutos() {
		HoraMinuto h = new HoraMinuto();
		h.hora = 10;
		h.minuto = 0;
		HoraMinutoUtil.acrescentaMinutos(h, 10);
		assertEquals("Hora e minutos sao iguais",10,h.minuto);
	}
	
	@Test
	public void acrescentaMinutosEMudaHora() {
		HoraMinuto h = new HoraMinuto();
		h.hora = 10;
		h.minuto = 55;
		HoraMinutoUtil.acrescentaMinutos(h, 10);
		assertEquals("Minutus deve ser 05",05,h.minuto);
		assertEquals("Hora deve ser 11",11,h.hora);
	}
	
	@Test
	public void acrescentaMinutosEMudaHoraMeiaNoite() {
		HoraMinuto h = new HoraMinuto();
		h.hora = 23;
		h.minuto = 55;
		HoraMinutoUtil.acrescentaMinutos(h, 10);
		assertEquals("Minutus deve ser 05",05,h.minuto);
		assertEquals("Hora deve ser 11",00,h.hora);
	}
}
