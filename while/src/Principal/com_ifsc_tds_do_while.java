package Principal;

public class com_ifsc_tds_do_while {

	public static void main(String[] args) {
		int contador=0;
		
		do {
			contador=contador+1;
			System.out.println(contador);    //do while vai fazer pelo menos uma execução, se for falso 1 rep, se for verdadeiro varios rep.
		}while(contador < 1000);

	}

}
