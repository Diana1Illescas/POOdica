package Personal;

import Personal.Docente;
import Personal.Administrativo;
import Personal.Limpieza;
import Personal.Tecnico;


public class Main {

	public static void main(String[] args) {
		//docente instanciandoi
		Docente docente1 =new Docente("sueldo 1", null, 8000, "trabajador", 30, null);
		Docente docente2 = new Docente("sueldo 2", null, 3000, "trabajador 2", 20, null);
		//tecnico
		Tecnico tecnico1 = new Tecnico("Producto 3", null, 200, null, 30, 0);
		Tecnico tecnico2 = new Tecnico("Producto 4", null, 200, null, 40, 0);
		Tecnico tecnico3 = new  Tecnico("Producto 5", null, 200, null, 50, 0);

		int sueldo = 5;
		double totalsueldo = 0.0;
		// 
		totalsueldo += docente1.suelditoPersonal(sueldo);
		System.out.println("Total de la comision del docente 1 es : " + totalsueldo);
		totalsueldo +=docente2.suelditoPersonal(sueldo);
		System.out.println("Total de la comision del docente 2 es: " + totalsueldo);
		totalsueldo +=tecnico1.suelditoPersonal(sueldo);
		System.out.println("Total de la comision del tecnico 1 es: " + totalsueldo);
		totalsueldo +=tecnico2.suelditoPersonal(sueldo);
		System.out.println("Total de la comision del tecnico 2 es: " + totalsueldo);
		totalsueldo +=tecnico3.suelditoPersonal(sueldo);
		System.out.println("Total de la comision del tecnico 3 es: " + totalsueldo);
		}

		}





















