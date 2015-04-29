package com.Unistmo.Engine.ag;



public class TestGeneracion {

	public static void main(String argv[]) {

		Evaluacion eval =new Evaluacion();
		Generacion G=eval.evaluar(1000);
	
		for (Individuo inv : G.getIx()) {
			
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 15; j++) {
				
					System.out.print(inv.getMat()[i][j].toString()+"|");						
				}
				
				System.out.println("\n");
			}
		
		//	System.out.println("Aptitud: "+inv.getAptitud());
		//	System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
			
			
		}
//		List<Double> x = new ArrayList<Double>();
//		for (Individuo inv : G.getIx()) {
//			x.add(inv.getAptitud());
//		}
//		Collections.sort(x);
//		
//		int y=0;
//		
//		for (Double double1 : x) {
//			if(double1.equals(1.0))
//				y++;
//		}
//		System.out.println(y);
//		
//		//System.out.println("-------------------------------------------");
		Individuo a=Cruza.cruza2puntos(G.getIx().get(0), G.getIx().get(1));

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 15; j++) {
			
				System.out.print(a.getMat()[i][j].toString()+"|");						
			}
			
			System.out.println("\n");
		}
		

	}

}
