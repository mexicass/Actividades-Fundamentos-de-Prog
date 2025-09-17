public class pratica_box {
	
	public static void main(String [] args){
	 
	char barrahorizontal='\u2500';
	char barravertical='\u2502';
	char esquinasuperiorizq='\u250C';
	char esquinainferiorizq='\u2514';
	char esquinasuperiorder='\u2510';
	char esquinainfder='\u2518';

	System.out.print( esquinasuperiorizq);
	System.out.print( barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal);
	System.out.println( esquinasuperiorder);

	System.out.println(barravertical+" Tecnologico Nacional de Mexico\t "+barravertical);
	System.out.println(barravertical+" Instituto Tecnologico de Leon\t\t "+barravertical);
	System.out.println(barravertical+" Fundamentos de Programacion\t\t "+barravertical);
	
	System.out.print( esquinainferiorizq);
	System.out.print( barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal);
	System.out.print(esquinainfder+""+"\n");

	}
}
