import java.util.Scanner;

class ELC_carrera{

	//DECLARACIONES

	//METODOS************************************************************************
	public static void esperar(int s){
		s=s*1000;

		try{
			Thread.sleep(s);

		}catch(InterruptedException e){

		}

	}

	public static void velocidadporvuelta(int s){
		s=s*100;

		try{
			Thread.sleep(s);

		}catch(InterruptedException e){

		}

	}

	public static void velocidadcargacoche(int s){
		s=s*10;

		try{
			Thread.sleep(s);

		}catch(InterruptedException e){

		}

	}
	



	public static void main(String[] args) {

		//DECLARACIONES******************************************************************
		Scanner sc=new Scanner(System.in);
		int iNumCoches=0;
		int vueltas=0;
		char confirmacion='n';
		ELC_f1[] cochef1;
		int iSeleccion=0;
		int contador=0;
		String p1="", p2="", p3="";
		int acabar=0;


		LibreriaCarrera carrera = new LibreriaCarrera();
		cochef1= new ELC_f1[iNumCoches];


		//INICIO*************************************************************************
		System.out.println("Sea bienvenido a la carrera de coches de formula uno.");

		System.out.println();



		//MENU***************************************************************************
		
		do {

			System.out.println();

			System.out.println("-------------------MENU-INICIO---------------------");

			System.out.println();

			System.out.println("\t"+"1.Generar vehiculos");

			System.out.println("\t"+"2.Seleccione el circuito");

			System.out.println("\t"+"3.Empezar la carrera");
			
			System.out.println("\t"+"4.Salir");

			System.out.println();

			System.out.println("---------------------------------------------------");

			System.out.println();

			System.out.println("Seleccione que accion desea realizar: ");
			iSeleccion=sc.nextInt();

			switch (iSeleccion){

				case 1:

					//GENERAMOS LOS COCHES***********************************************************

					do{

						System.out.print("Cuantos coches de formula1 desea generar: ");
						iNumCoches=sc.nextInt();
						cochef1= new ELC_f1[iNumCoches];


						System.out.println("-----------VEHICULOS------------");

						for (int i=0;i<iNumCoches;i++) {
							cochef1[i]= new ELC_f1();

							System.out.println("--------------------------------");
							System.out.println("Vehiculo "+i);
							System.out.println("Matricula: "+cochef1[i].getMatricula());
							System.out.println("Deposito: "+cochef1[i].getDeposito());
							System.out.println("Marca: "+cochef1[i].getMarca());
							System.out.println("--------------------------------");
							System.out.println(" ");
						}



						System.out.println("Estos son los vehiculos que ha generado para la carrera:");

						System.out.print("Desea volverlos a generar (s/n):");
						confirmacion=sc.next().charAt(0);

						System.out.println();

					} while (confirmacion!='n');
					
					System.out.println();

					break;


				case 2:

					carrera.circuitos();

					break;

				case 3:


					break;

				case 4:

					System.exit(0);

					break;
			
			}

		} while (iSeleccion<3);

	




		//SUBEN PASAJEROS****************************************************************
					
			System.out.println();

			System.out.println("Los pasajeros van a subir");

			for (int i=0;i<iNumCoches;i++ ) {
				cochef1[i].subirPasajero(1);
				System.out.println("En el coche con matricula "+cochef1[i].getMatricula()+"acaba de subir el piloto");

			}

			System.out.println();


		//ARRANCAN TODOS LOS VEHICULOS***************************************************
					
			for (int i=0;i<iNumCoches;i++) {
				cochef1[i].arrancar();
				esperar(1);
			}

			System.out.println();

		//EMPIEZA LA CARRERA*************************************************************

			carrera.semaforo();

			do {

				vueltas++;

				System.out.println("---Vuelta"+vueltas+"--------------------------------------------------------------------------");
				System.out.println();
				System.out.println("\t"+"Metros"+"\t"+"Deposito");

				for (int i=0;i<iNumCoches;i++) {

					if (cochef1[i].getEncendido()==true) {
						
						if (cochef1[i].getDeposito()>13) {
							if (cochef1[i].getODO()<carrera.getDistanciatotal()) {
							cochef1[i].avanzar((int)(Math.random()*(1000-500)+500));
							System.out.println(cochef1[i].getMatricula()+"\t"+cochef1[i].getODO()+"\t"+cochef1[i].getDeposito());		
							
							} 

							if (cochef1[i].getODO()>=carrera.getDistanciatotal()) {
								contador++;
								cochef1[i].apagar();
								if (p1=="") {
									p1=cochef1[i].getMatricula();
								}else if (p2=="") {
									p2=cochef1[i].getMatricula();
								}else if (p3=="") {
									p3=cochef1[i].getMatricula();
								} else if (contador>=iNumCoches) {
									acabar=cochef1[i].getODO();
									
								}
							}

						} else if (cochef1[i].getDeposito()<13){
							System.out.println(cochef1[i].getMatricula()+"\t"+cochef1[i].getODO()+"\t"+"Repostando.......");
							cochef1[i].repostarGasolina(100);
						}

						

					}

					velocidadcargacoche(4);
				}


				System.out.println("\n");

			velocidadporvuelta(8);

			}while (acabar<carrera.getDistanciatotal());


			System.out.println("La distancia total de la carrera es"+carrera.getDistanciatotal());


			carrera.podium(p1,p2,p3);


			System.out.println("FIN DE LA CARRERA");
	}
	
}



