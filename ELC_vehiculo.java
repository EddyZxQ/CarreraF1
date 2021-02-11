/*
	TITULO
	ELC_VEHICHULO


		TITULO
	ELC_VEHICHULO


	CONSTRUCTORES
	public ELC_vehiculo(){
	public ELC_vehiculo(int n){
	public ELC_vehiculo(String marca, String modelo, int minP, int maxP) {
	public ELC_vehiculo(int minP, int maxP){
	public ELC_vehiculo(int minP, int maxP){
		
	SET
	public void setMatricula(String m) {
	public void setMarca(String str){
	public void setModelo(String str){
	public void setAceite(int a){
	public void setId(String str){

	GET
	public String getMatricula() {
	public int getPasajeros(){
	public String getMarca(){
	public String getModelo(){
	public int getAceite(){
	public String getId(){
	public float getDeposito(){	
	public boolean getEncendido(){

 	METODOS
	public void arrancar(){
	public void apagar(){
	public void avanzar(int metros){
	public void retroceder(int metros){
	public int subirPasajero(int n){
	public int bajarPasajeros(int n){
	public String generarMarca(){
	public float repostarGasolina(float g){
	private static String generarMatricula(){
	

	AUTOR
	Edgar Lopez Calomarde

*/

import java.util.Scanner;

class ELC_vehiculo {
	//ATRIBUTOS
	private String id;
	private String sMatricula, sMarca, sModelo;
	private String sColor;
	private int iMaxPasajeros=5, iMinPasajeros=1, iPasajeros=0;
	private int iODO=0, iCuentaKilometros=0;
	private float fConsumo100=0, fDeposito=0;
	private int iAceite=0;
	private boolean estaEncendido=false;
	

	



//**CONSTRUCTORES**********************

	public ELC_vehiculo(){
		this.sMatricula=generarMatricula();

	}

	public ELC_vehiculo(int n){
		this.sMatricula=generarMatricula();
		this.iMaxPasajeros=n;

	}


	public ELC_vehiculo(String marca, String modelo, int minP, int maxP) {
		this.sMatricula=generarMatricula();
		this.sMarca=marca;
		this.sModelo=modelo;
		this.iMinPasajeros=minP;
		this.iMaxPasajeros=maxP;
	}

	public ELC_vehiculo(int minP, int maxP){
		this.sMatricula=generarMatricula();
		this.iMinPasajeros=minP;
		this.iMaxPasajeros=maxP;
		this.fConsumo100=(int)(Math.random()*(13-7)+7);
		this.fDeposito=(int)(Math.random()*(110-100)+100);
		this.sMarca=generarMarca();
	}




//**SET/GET******************************


	//SET
	public void setMatricula(String m) {		

		this.sMatricula=m;
	}

	public void setMarca(String str){
		this.sMarca=str;
	}

	public void setModelo(String str){
		this.sModelo=str;
	}

	public void setAceite(int a){
		this.iAceite=a;
	}

	public void setId(String str){
		this.id=str;
	}

	//GET

	public String getMatricula() {
		return this.sMatricula;	
	}

	public int getPasajeros(){
		return iPasajeros;
	}

	public String getMarca(){
		return this.sMarca;
	}

	public String getModelo(){
		return this.sModelo;
	}

	public int getAceite(){
		return this.iAceite;

	}

	public String getId(){
		return this.id;
	}

	public int getODO(){
		return this.iODO;
	}

	public float getDeposito(){
		return this.fDeposito;
	}

	public boolean getEncendido(){
		return this.estaEncendido;
	}



//**METODOS*******************************************

	public void arrancar(){
		if (estaEncendido==true) {
			System.out.println("El coche esta encendido");
		}else{
			System.out.println("Encendiendo.....");
			estaEncendido=true;
		}

	}

	public void apagar(){
		if (estaEncendido==false) {
			System.out.println("El coche esta apagado");
		}else {
			System.out.println("Apagando.....");
			estaEncendido=false;
		}
	}


	public void avanzar(int metros){
		if (estaEncendido==true) {
			float consumoO;
			this.iCuentaKilometros+=metros;
			this.iODO+=metros;

			metros=metros/1000;
			consumoO=(metros*fConsumo100)/100;
			fDeposito=fDeposito-fConsumo100;	
		
				

			//System.out.println(this.sMatricula+"Avanza: "+metros);
			//System.out.println(this.sMatricula+"ODO: "+iODO);
		}else{

			System.out.println(this.sMatricula+"JEFE EL VEHICULO ESTA APAGADO");
		}

	}

	public void retroceder(int metros){
		if (estaEncendido==true) {
			float consumoO;
			this.iCuentaKilometros-=metros;
			this.iODO+=metros;


			metros=metros/1000;
			consumoO=(metros*fConsumo100)/100;
			fDeposito=fDeposito-fConsumo100;	

		
			System.out.println(this.sMatricula+"Retrocede: "+metros);
			System.out.println(this.sMatricula+"ODO: "+iODO);
		} else {
			System.out.println(this.sMatricula+"JEFE EL VEHICULO ESTA APAGADO");
		}
	
	}


	public int subirPasajero(int n){
		if (n<=iMaxPasajeros-iPasajeros) {
			iPasajeros+=n; //iPasajeros=n+ipasajeros
			return n;
		} else {
			System.out.println("ERROR - solo pueden subir: "+(iMaxPasajeros-iPasajeros));
			return -1;
		}
	}


	public int bajarPasajeros(int n){
		//Declaraciones
		int temporal;

		if (n<iPasajeros) {
			iPasajeros-=n;
			return n;
		}else {
			temporal=iPasajeros;
			iPasajeros=0;
			return temporal;
		}
		
	}

	public String generarMarca(){
		String[] marca=new String[10]; 

		marca[0]="Ferrari";
		marca[1]="Renault";
		marca[2]="McLaren";
		marca[3]="Mercedes";
		marca[4]="Scuderia";
		marca[5]="ToroRosso";

		sMarca=marca[(int)(Math.random()*(6-0)+0)];

		return sMarca;
	}


	public float repostarGasolina(float g){
		return fDeposito=g;
	}


	private static String generarMatricula(){
		//Declaraciones
		final String letras="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String sMatricula="";

		//Generar 4 numeros de la matricula
		for (int i=1;i<=4; i++ ) {
			sMatricula=sMatricula+((int)(Math.random()*(10-0)+0));
		}

		//Generar 3 letras

		for (int i=1;i<=3;i++) {
			sMatricula=sMatricula+letras.charAt((int)(Math.random()*letras.length()));
			
		}

		return sMatricula;
	}


}//Class