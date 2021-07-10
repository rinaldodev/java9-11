package dev.rinaldo.java9;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class StringsMenores {

	public static void main(String[] args) throws InterruptedException {
		Instant inicio = Instant.now();
		Thread.sleep(10000);
		
		new Random().ints()
			.limit(500_000_000)
			.boxed()
			.map(i -> i.toString())
//			.collect(Collectors.joining())
			.forEach(String::hashCode);
		
		Thread.sleep(5000);
		Instant fim = Instant.now();
		System.out.println(Duration.between(inicio, fim));
	}
	
}
