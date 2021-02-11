/*
	TITULO
	ELC_terrestre

	CONSTRUCTORES

	public ELC_terrestre(){
	public ELC_terrestre(int nR){
	public ELC_terrestre(int nR, int min, int max){
		
	SET/GET
	public int getNumNeumaticos(){
	public int getEstadoNeumaticos(int i){

	METODOS
	public  void estadoNeumaticos(){
	public void avanzar(int metros){
	public void iniciarNeumaticos(int nR){	

*/



class ELC_terrestre extends ELC_vehiculo{

	//Declaraciones
	int iNumRuedas=4;
	int iDurezaRueda=50; //Valor en %
	int[] iEstadoNeumatico; //valor en %

	

//**CONSTRUCTORES**********************

	public ELC_terrestre(){
		super();
		iniciarNeumaticos(4);
	}

	public ELC_terrestre(int nR){
		//super(1,5);
		iniciarNeumaticos(nR);
	}

	public ELC_terrestre(int nR, int min, int max){
		super(min,max);
		iniciarNeumaticos(nR);
	}



//**SET/GET******************************

	public void setDurezaRueda(int d){
		this.iDurezaRueda=d;
	}

	public int getDurezaRueda(){
		return this.iDurezaRueda;
	}

 	public int getNumNeumaticos(){
 	return iNumRuedas;
 	}

 	public int getEstadoNeumaticos(int i){
 	return iEstadoNeumatico[i];
 	}






//**METODOS*******************************************
	public  void estadoNeumaticos(){
		for (int i=0;i<iEstadoNeumatico.length;i++) {

			System.out.println(i+""+iEstadoNeumatico[i]); 
		}
	}


/*
	public void avanzar(int metros){
		System.out.println("CLASE TERRESTRE - Metodo en construccion");
	}
*/

	public void iniciarNeumaticos(int nR){
		this.iNumRuedas=nR;
		this.iEstadoNeumatico= new int[nR];

		for (int i=0;i<nR;i++) {
			this.iEstadoNeumatico[i]=(int)(Math.random()*(100-90)+90);
		}

	}


}