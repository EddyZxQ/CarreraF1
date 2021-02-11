class ELC_f1 extends ELC_terrestre {
	
int aerodinamica=0;	//Random en metros que suma a su desplazamiento
int iCaballos=0;

//CONSTRUCTORES

	public ELC_f1(){
		super(1,1,4);
		this.aerodinamica=(int)(Math.random()*(100-0)+0);
		
	}


}