package dev.rinaldo.java9;

public class TryWithResources {

	public static void main(String[] args) {
		try (Recurso1 r1 = new Recurso1(); 
			 Recurso2 r2 = new Recurso2()) {
			System.out.println("TryWithResources.main() try");
		} catch (Exception e) {
			System.out.println("TryWithResources.main() catch");
		}
	}
	
	static class Recurso1 implements AutoCloseable {
		@Override
		public void close() throws Exception {
			System.out.println("TryWithResources.Recurso1.close()");
		}
	}
	
	static class Recurso2 implements AutoCloseable {
		@Override
		public void close() throws Exception {
			System.out.println("TryWithResources.Recurso2.close()");
		}
	}
	
}
