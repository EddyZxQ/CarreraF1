/*
	TITULO
	Libreria de carrera

	DESCRIPCION
	Utilidades para el diseño de la carrera

	SET
	public void setDistanciatotal(int d){

	GET
	public int getDistanciatotal(){

  	METODOS
	public void semaforo(){
	public void podium(String posicion1, String posicion2, String posicion3){
	public void circuitos(){


*/
 



import java.util.Scanner;
import java.util.Random;

class LibreriaCarrera {
	//Declaraciones
	Scanner sc=new Scanner(System.in);
	Random r=new Random();
	int distanciaTotal;



//**SET/GET******************************

	public void setDistanciatotal(int d){
		this.distanciaTotal=d;

	}

	public int getDistanciatotal(){
		return this.distanciaTotal;
	}





//	METODOS
	public void semaforo(){
		try {
			Thread.sleep(1000);
			System.out.println("  _______________________________ 	");
			System.out.println(" |                               |	");
			System.out.println(" | (   ) (   ) (   ) (   ) (   ) |	");
			System.out.println(" | (   ) (   ) (   ) (   ) (   ) |	");
			System.out.println(" | (   ) (   ) (   ) (   ) (   ) |	");
			System.out.println(" | (   ) (   ) (   ) (   ) (   ) |	");
			System.out.println(" | (   ) (   ) (   ) (   ) (   ) |	");
			System.out.println(" |_______________________________|	");
		
			Thread.sleep(1000);
			System.out.println("  _______________________________ 	");
			System.out.println(" |                               |	");
			System.out.println(" | (   ) (   ) (   ) (   ) (   ) |	");
			System.out.println(" | (   ) (   ) (   ) (   ) (   ) |	");
			System.out.println(" | ( X ) (   ) (   ) (   ) (   ) |	");
			System.out.println(" | ( X ) (   ) (   ) (   ) (   ) |	");
			System.out.println(" | ( X ) (   ) (   ) (   ) (   ) |	");
			System.out.println(" |_______________________________|	");
		
			Thread.sleep(1000);
			System.out.println("  _______________________________ 	");
			System.out.println(" |                               |	");
			System.out.println(" | (   ) (   ) (   ) (   ) (   ) |	");
			System.out.println(" | (   ) (   ) (   ) (   ) (   ) |	");
			System.out.println(" | ( X ) ( X ) (   ) (   ) (   ) |	");
			System.out.println(" | ( X ) ( X ) (   ) (   ) (   ) |	");
			System.out.println(" | ( X ) ( X ) (   ) (   ) (   ) |	");
			System.out.println(" |_______________________________|	");
		
			Thread.sleep(1000);
			System.out.println("  _______________________________ 	");
			System.out.println(" |                               |	");
			System.out.println(" | (   ) (   ) (   ) (   ) (   ) |	");
			System.out.println(" | (   ) (   ) (   ) (   ) (   ) |	");
			System.out.println(" | ( X ) ( X ) ( X ) (   ) (   ) |	");
			System.out.println(" | ( X ) ( X ) ( X ) (   ) (   ) |	");
			System.out.println(" | ( X ) ( X ) ( X ) (   ) (   ) |	");
			System.out.println(" |_______________________________|	");
		
			Thread.sleep(1000);
			System.out.println("  _______________________________ 	");
			System.out.println(" |                               |	");
			System.out.println(" | (   ) (   ) (   ) (   ) (   ) |	");
			System.out.println(" | (   ) (   ) (   ) (   ) (   ) |	");
			System.out.println(" | ( X ) ( X ) ( X ) ( X ) (   ) |	");
			System.out.println(" | ( X ) ( X ) ( X ) ( X ) (   ) |	");
			System.out.println(" | ( X ) ( X ) ( X ) ( X ) (   ) |	");
			System.out.println(" |_______________________________|	");
		
			Thread.sleep(1000);
			System.out.println("  _______________________________ 	");
			System.out.println(" |                               |	");
			System.out.println(" | (   ) (   ) (   ) (   ) (   ) |	");
			System.out.println(" | (   ) (   ) (   ) (   ) (   ) |	");
			System.out.println(" | ( X ) ( X ) ( X ) ( X ) ( X ) |	");
			System.out.println(" | ( X ) ( X ) ( X ) ( X ) ( X ) |	");
			System.out.println(" | ( X ) ( X ) ( X ) ( X ) ( X ) |	");
			System.out.println(" |_______________________________|	");
		
			Thread.sleep(1000);
			System.out.println("  _______________________________	");
			System.out.println(" |                               |	");
			System.out.println(" | (   ) (   ) (   ) (   ) (   ) |	");
			System.out.println(" | ( X ) ( X ) ( X ) ( X ) ( X ) |	");
			System.out.println(" | (   ) (   ) (   ) (   ) (   ) |	");
			System.out.println(" | (   ) (   ) (   ) (   ) (   ) |	");
			System.out.println(" | (   ) (   ) (   ) (   ) (   ) |	");
			System.out.println(" |_______________________________|	");

			System.out.println("\n------------------------------------");
			System.out.println("");

//			System.out.println("Arranca el Gran Premio de "+circuito.getPais()+"!!!");
			Thread.sleep(1000);
		}	catch (Exception e) {}

	}//semaforo

	public void podium(String posicion1, String posicion2, String posicion3){
		try {
			Thread.sleep(500);

			System.out.println("\n	*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*");
			System.out.println("	*.*.*.*.*.*.*.*.*.*.*.*.*.*. FIN DE LA CARRERA .*.*.*.*.*.*.*.*.*.*.*.*.*.*");
			System.out.println("	*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*");
			System.out.println("");

			Thread.sleep(500);

			System.out.println("");
			System.out.println("                                          "+posicion1+"");
			System.out.println("	                          ________________________");
			System.out.println("	                         |                        |        "+posicion2+"");
			System.out.println("	         "+posicion3+"        |                        |________________________");
			System.out.println("	 ________________________|   .----------------.                            |");
			System.out.println("	|                           | .--------------. |      .----------------.   |");
			System.out.println("	|   .----------------.      | |     __       | |     | .--------------. |  |");
			System.out.println("	|  | .--------------. |     | |    /  |      | |     | |    _____     | |  |");
			System.out.println("	|  | |    ______    | |     | |    `| |      | |     | |   / ___ `.   | |  |");
			System.out.println("	|  | |   / ____ `.  | |     | |     | |      | |     | |  |_/___) |   | |  |");
			System.out.println("	|  | |   `'  __) |  | |     | |    _| |_     | |     | |   .'____.'   | |  |");
			System.out.println("	|  | |   _  |__ '.  | |     | |   |_____|    | |     | |  / /____     | |  |");
			System.out.println("	|  | |  | \\____) |  | |     | |              | |     | |  |_______|   | |  |");
			System.out.println("	|  | |   \\______.'  | |     | '--------------' |     | |              | |  |");
			System.out.println("	|  | |              | |      '----------------'      | '--------------' |  |");
			System.out.println("	|  | '--------------' |                               '----------------'   |");
			System.out.println("	|   '----------------'                                                     |");
			System.out.println("	|__________________________________________________________________________|");

			Thread.sleep(250);

			System.out.println("\n	*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*");
			System.out.println("	*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.* CLASIFICACION *.*.*.*.*.*.*.*.*.*.*.*.*.*.*");
			System.out.println("	*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*");
			System.out.println("");

		} catch (Exception e) {	
		}
	}//podium

	

	public void circuitos(){
		//Declaraciones
		int selectorCarrera=0;

		//Inicio
		System.out.println("Que circuito eliges? : ");
		System.out.println("\t1.- Albert Park (GP Australia)");
		System.out.println("\t2.- Sakhir (GP Bahrein");
		System.out.println("\t3.- Shangai (GP China)");
		System.out.println("\t4.- Baku (GP Azerbaiyan");
		System.out.println("\t5.- Catalunya (GP Spain)");
		System.out.println("\t6.- Monte Carlo (GP Monaco)");
		System.out.println("\t7.- Guilles Villeneuve (GP Canada)");
		System.out.println("\t8.- Paul Ricard (GP Francia)");
		System.out.println("\t9.- Red Bull Ring (GP Austria)");
		System.out.println("\t10.- Silverstone (GP Great Britain)");
		System.out.println("\t11.- Hockenheim (GP Alemania)");
		System.out.println("\t12.- Hungaroring (GP Hungria)");
		System.out.println("\t13.- Spa-Francorchamps (GP Belgica)");
		System.out.println("\t14.- Monza (GP Italia)");
		System.out.println("\t15.- Marina Bay (GP Singapur)");
		System.out.println("\t16.- Sochi (GP Rusia)");
		System.out.println("\t17.- Suzuka (GP Japon)");
		System.out.println("\t18.- Autodromo Hnos Rodriguez (GP Mexico)");
		System.out.println("\t19.- Autodromo Jose Carlos Pace (GP Brasil)");
		System.out.println("\t20.- Yas Marina (GP Abu Dhabi)");
		selectorCarrera=sc.nextInt();
		System.out.println("\n\n\n");

		//Declaraciones
		int vueltas, distancia, maxDist, lapDist;

		switch (selectorCarrera) {
		case 1: 
			vueltas = 58;
			distancia = 5303;
			distanciaTotal = vueltas*distancia;
			maxDist = distanciaTotal;
			lapDist= distancia;
			System.out.println("                rRBBBBB7               .--------------------------------.");                                         
			System.out.println("              uBQP:..:SBBB:            |          GP AUSTRALIA          |");        
			System.out.println("          DBBBBr         EBBq          | Circuito:	Albert Park	|");                                           
			System.out.println("         .QI               iBBB.       | Vueltas:	"+vueltas+"		|");                                            
			System.out.println("         BB                  DB        | Dist Vuelta:	"+distancia+"m		|");                                        
			System.out.println("        JB.                  BB        | Dist Total:	"+distanciaTotal+"m		|");                                         
			System.out.println("        BI                   .BB       '--------------------------------'");                                                
			System.out.println("       BQ                      BB.");                                              
			System.out.println("       Bg                       RB1                :SPMQBBBQBBBQY");               
			System.out.println("      .B.                        iBBs             QBgK1sri:...i5BBBq.");          
			System.out.println("      :Bb                          7BBBgji::iivjqQB               rBBBM:");        
			System.out.println("       .BBU                           iqQBBBQBBQd7                   :dBBX");      
			System.out.println("         :BQ7                                                           BB");      
			System.out.println("           LBr                                                         PB");      
			System.out.println("           BQ                                                         :B7");       
			System.out.println("         .BB                                                .BBgji    QB");        
			System.out.println("          ugBQBBgILri::.::rr77.                             PB7uQBBB BB");         
			System.out.println("              .75gBBQBBBBBBBBBQB:                           bB     '.'");           
			System.out.println("                               gB7:iUdZbZdDDggRQJ.BBBQBBBQBQBQ");                  
			System.out.println("                                SBBBQBBBQBRQgP1j7v5K55U2uuss:");                   
            break;
		case 2: 
			vueltas = 57;
			distancia = 5412;
			distanciaTotal = vueltas*distancia;
			maxDist = distanciaTotal;
			lapDist= distancia;
			System.out.println("             DB5.");                                                               
			System.out.println("             B :QD                   vs                .--------------------------------.");         
			System.out.println("            YQ   7B7                Bq7QK              |           GP BAHREIN           |");        
			System.out.println("            Qs     gQ:             Bv   5B             | Circuito:	Sakhir		|");       
			System.out.println("            B       .bRq          BM     iB            | Vueltas:	"+vueltas+"		|");     
			System.out.println("           .B          :B.       :B       rB           | Dist Vuelta:	"+distancia+"m		|");        
			System.out.println("           IB           B7       Bi        jB          | Dist Total:	"+distanciaTotal+"m		|");         
			System.out.println("           Br          .Q        5Q         dQ         '--------------------------------'");         
			System.out.println("           B            B7        iMgs:      Bq");                 
			System.out.println("          :B             uQK.        75gMK    BY");                  
			System.out.println("          ZE                EEi          iBY   Bi");                 
			System.out.println("          B:     :EZPqI17i.  .QB           Br   B.");                 
			System.out.println("          B     gB.       r7L7vi           rB   .B");                            
			System.out.println("          ZI    B27v                    v7YB7    :B");                             
			System.out.println("           B     .::rirrrrrrrrrrrrrr7r7rrrr       rB");                            
			System.out.println("          :B                                       JR");                           
			System.out.println("        iBd                                         B:");                          
			System.out.println("       7Br                                        rBP");                           
			System.out.println("        iJI2S2Zq2J1sJsusJYjLJRBBPvsJJsuYJsus1uSDXS5.");                            
			break;
		case 3:
			vueltas = 56;
			distancia = 5451;
			distanciaTotal = vueltas*distancia;
			maxDist = distanciaTotal;
			lapDist= distancia;
			System.out.println("                                      :7r::.:r7");                                 
			System.out.println("                                     Lr       vr");                               
			System.out.println("                                    q:    v:i.r     ..:irirrr:.");                 
			System.out.println("                                   5j    .7    .:iii.'       .iqSL.");             
			System.out.println("                                  .D      ':r..'    ..::.        'uXS7.");         
			System.out.println("                                 .b.             .Kqs   sXS27:       .rB:");       
			System.out.println("                                 s7             1M.        .iLIS5vi  .7Q:");       
			System.out.println("                                7X             rB                :7juY:.");        
			System.out.println("                                P.             B.");                            
			System.out.println("                               Yv              B        .-------------------------------.");                        
			System.out.println("                              rB               sM       |           GP CHINA            |");             
			System.out.println("                              Br                JQ      | Circuito:	Shangai		|");                           
			System.out.println("                             PB                  .B     | Vueltas:	"+vueltas+"		|");                               
			System.out.println("                            .B                    B:    | Dist Vuelta:	"+distancia+"m		|");                            
			System.out.println("                            Br                   vB     | Dist Total:	"+distanciaTotal+"m		|");                     
			System.out.println("                           PB                :YXXL      '-------------------------------'");                              
			System.out.println("                           B             :jKKL:");                                 
			System.out.println("                          Br         .7K5Y:                           vBS7");      
			System.out.println("                         UB          UR                             .BI.ibBv");    
			System.out.println("                         B           .B.                             Br    Bi");   
			System.out.println("                        BL            7u22II52S2SIS25221I1UjusYJEqX2sUB.   7B");   
			System.out.println("      .IBEbZEgEZXPMMRBZBB                                                  DB");   
			System.out.println("    qBKi                                                                  PB");    
			System.out.println("   .BBLJ1SI511j1u1gZ11jUJI2dbdEZdZdDdEdZbEdDgRgEPdPDDRgRgMgMgMgMggggggDMBBD");                                                          
			break;
		case 4: 
			vueltas = 51;
			distancia = 6003;
			distanciaTotal = vueltas*distancia;
			maxDist = distanciaTotal;
			lapDist= distancia;
			System.out.println("	               .--------------------------------.");
			System.out.println("	               |          GP AZERBAIYAN         |");
			System.out.println("	               | Circuito:	Baku		|");
			System.out.println("	               | Vueltas:	"+vueltas+"		|");
			System.out.println("	               | Dist Vuelta:	"+distancia+"m		|");
			System.out.println("	               | Dist Total:	"+distanciaTotal+"m		|");
			System.out.println("	               '--------------------------------'");
			System.out.println("                                                                        ");
			System.out.println("         7R5IU212U5SPPPdi                                .bss77ii:..");            
			System.out.println("       :BZ             B7                                :Q.:irLs12KKEPPqSUj7r:"); 
			System.out.println("     .DQ.             ..Pg..                             rQ              ..::dB"); 
			System.out.println("     B7                  Rq                              1P                  7E"); 
			System.out.println("    Bu                   B.          iKsSSXXqXP5I1UsY7. :Bj                  qU"); 
			System.out.println("   Pg                    B         .:B5:           ..::iii                   B:"); 
			System.out.println("  1Q                    rBvKEDQQBQBBBQ5S2255Ijuv7ii:..                      rB."); 
			System.out.println("  QQ                    7BQPjJr:.            ..::ir7vj15IqqPEdEgZb.        .1B");  
			System.out.println("   LB                 :Mg                                     ..:.i.rL1X1.LQR"); 
			System.out.println("    iB.         .rsXPZBi");              
			System.out.println("     .B:    .UgZX7i.");                           
			System.out.println("      .BU .gM7");                                 
			System.out.println("        gQBi");    
			break;
		case 5: 
			vueltas = 66;
			distancia = 4655;
			distanciaTotal = vueltas*distancia;
			maxDist = distanciaTotal;
			lapDist= distancia;
			System.out.println("	                   .--------------------------------.");
			System.out.println("	                   |            GP SPAIN            |");
			System.out.println("	                   | Circuito:		Catalunya   |");
			System.out.println("	                   | Vueltas:		"+vueltas+"	    |");
			System.out.println("	                   | Dist Vuelta:	"+distancia+"m	    |");
			System.out.println("	                   | Dist Total:	"+distanciaTotal+"m	    |");
			System.out.println("	                   '--------------------------------'");
			System.out.println("                                                                 ");
			System.out.println("       .:JPgMMMgMgMMRgRMMZP.");                                                    
			System.out.println("     .DBB                'vBB          dBBQq:                 vQQBb7");            
			System.out.println("    2BE                     Br       vBg..iSBBQi             BB:.:uQBBgr");        
			System.out.println("   IB.                     BB       ZB:      .uBBD:         iB.      .YQBd");      
			System.out.println("   B7         ..::::i:iiYQB5       BB           .SBBq.       UBQ2:      rB.");     
			System.out.println("  .B:       rBBBBBQBQBQQZL       .BQ               :EBBj       rPBBB.   .B.");     
			System.out.println("   EB.     iB:                  7B2                   rQBQr        MB   .B.");     
			System.out.println("    UBg.   .BP.                vQi                       JQBd:      BQ  .Bv.");   
			System.out.println("      dBBr   JBBgi             QB                          .KQB5.   .Br  jMZB.");  
			System.out.println("        vBQZ.  .2BBgi          KB                             :DBBY  bB     DB");  
			System.out.println("          .JBB    .2BBM5jLYYus1Bg                                iMBQBg     BK");  
			System.out.println("             BS       i2SK5X22u:                                           JBi");  
			System.out.println("             gB                                                           sBB");   
			System.out.println("              RBBBBBBBQBBBBBBBBBBBQBBBBBBBBBBBBBPI25SIQGGBBBQQMQBBBBQBQBBBQs");                                                                                  
			break;
		case 6: 
			vueltas = 78;
			distancia = 3340;
			distanciaTotal = vueltas*distancia;
			maxDist = distanciaTotal;
			lapDist= distancia;                                            
			System.out.println("                                                         iSZ7B");                   
			System.out.println("                                                      iSgU.  E Br:.rB");            
			System.out.println("                                                   iPQPL.  .:B Q  :B7");            
			System.out.println("                                                 .BX:      ':BsP  BY");             
			System.out.println("                                                  B             .B.");              
			System.out.println("                                                  2g          .BB");                
			System.out.println("                                                  .B         IBM");                 
			System.out.println("                  iQIJU5S1uLvri..   ..i7vii.      .B.       BBj");                  
			System.out.println("                 MB            '7I11Y     rYsUu1s12.    .2QBB.");                   
			System.out.println("               :Bj  dg111YJvr::rSULL7i:.            vBBBBQP:");                     
			System.out.println("              IB.  BS                  Jv2PUUIU2sJv7iL:");                          
			System.out.println("             QQ  iBi");                                                             
			System.out.println("            Q5  jB");                                                              
			System.out.println("           QB.  PX");                                                              
			System.out.println("          QJ::  QS         .-------------------------------------.");                                                     
			System.out.println("         .B 7  qB          |              GP MONACO              |");                       
			System.out.println("         RYr .XB           | Circuito:		Monte Carlo      |");                        
			System.out.println("         Q 7QUv            | Vueltas:		"+vueltas+"		 |");                          
			System.out.println("        PX LQ              | Dist Vuelta:	"+distancia+"m		 |");                   
			System.out.println("        B. .B              | Dist Total:	"+distanciaTotal+"m		 |");              
			System.out.println("        Br .Q              '-------------------------------------'");             
			System.out.println("       rB   B");                            
			System.out.println("      .B    dS");                              
			System.out.println("       vPvX  iB.");                           
			System.out.println("         .rQJ7M");                    
			break;
		case 7: 
			vueltas = 70;
			distancia = 4361;
			distanciaTotal = vueltas*distancia;
			maxDist = distanciaTotal;
			lapDist= distancia;
			System.out.println("          v7YdSr                                     .-----------------------------------------.");               
			System.out.println("           RQ  B24..                                 |                GP CANADA                |");                               
			System.out.println("            QSP   DgMI2QPJr                          |  Circuito:	Guilles Villeneuve     |");                                
			System.out.println("              PgQZ     dRBBBDY.                      |  Vueltas:	"+vueltas+"		       |");                                
			System.out.println("                 iXBB      5ugBBBEs.                 |  Dist Vuelta:	"+distancia+"m		       |");                                
			System.out.println("                    vBB.        :IRBBBMu:            |  Dist Total:	"+distanciaTotal+"m		       |");                                
			System.out.println("                      IBB            .JgBBB5:        '-----------------------------------------'");                                
			System.out.println("                        EBg               iZBBBS:");                 
			System.out.println("                          BBq                 ibBQBR:");            
			System.out.println("                            QB::                 :JKQBI.");                    
			System.out.println("                            .BE                      EBB");                  
			System.out.println("                           vJBB:                       rEBBBS:");               
			System.out.println("                              EBE                         IMBBBBu:");              
			System.out.println("                               .BBg.                         iXBDQBv.");        
			System.out.println("                                  RBB:                            :dBv.   MQ2du");
			System.out.println("                                    KBBK         7                  rBBBdXL BdB"); 
			System.out.println("                                      iQBBS.   JRBBr                       QDXi"); 
			System.out.println("                                         iRBBSugB iBBX.       7Y     .vMQB5vL7");  
			System.out.println("                                             KBB.   :ZBBQIqgBBBBBEKBBQEr");        
			System.out.println("                                                       .iBXr.    5D:");           
			break;
		case 8:
			vueltas = 70;
			distancia = 4412;
			distanciaTotal = vueltas*distancia;
			maxDist = distanciaTotal;
			lapDist= distancia;                                                                       
			System.out.println("                EBY.2B");                                                          
			System.out.println("                Bd   UB");                                                         
			System.out.println("                 7QU  B                          .----------------------------------.");                               
			System.out.println("                   BJ B.                         |            GP FRANCIA            |");                               
			System.out.println("                   B7 :B:                        | Circuito:	Paul Ricard         |");                               
			System.out.println("                    QK  gR.                      | Vueltas:	"+vueltas+"		    |");                               
			System.out.println("                     SB. :Bb                     | Dist Vuelta:	"+distancia+"m		    |");                               
			System.out.println("                      .B7  LBv                   | Dist Total:	"+distanciaTotal+"m		    |");                               
			System.out.println("                        BU   EB:                 '----------------------------------'");                               
			System.out.println("                         B:   .BR");                                               
			System.out.println("                         .B:    iBI");                                             
			System.out.println("                          .BQL:   JQ7");                                           
			System.out.println("                            iXMMQP  DB.");                                         
			System.out.println("                                 dB  .BE");                                        
			System.out.println("                                  5B   sBj.");                                     
			System.out.println("                                   ZB    qB:");                                    
			System.out.println("                                    BZ     BQ");                                   
			System.out.println("                                     Bu     iBq");                                 
			System.out.println("                                      Br      jB7");                               
			System.out.println("                                       Q.       RQ:");                             
			System.out.println("                                       .B        .BM");                            
			System.out.println("                                        iB         rBU");                          
			System.out.println("                                         uB          KBr");                        
			System.out.println("                                          PB           RB.");                      
			System.out.println("                                           QQ           :BP");                     
			System.out.println("                                            BB            JBs");                   
			System.out.println("                                             BQ             bB:");                 
			System.out.println("                                              BX    .        .BR");                
			System.out.println("                                               Br jBBBQ7       rBK");              
			System.out.println("                                               .BBb.  .Br        2Br");            
			System.out.println("                                                        Bv         gB");           
			System.out.println("                                                         BB.        :B.");         
			System.out.println("                                                          sBBK  qMZ  rB");         
			System.out.println("                                                             vgUr sB BU");         
			System.out.println("                                                                 7B jB");          
			System.out.println("                                                              .BB1 .B");           
			System.out.println("                                                            .BQr   B");            
			System.out.println("                                                           vBi    Bi");            
			System.out.println("                                                           BL    BK");             
			System.out.println("                                                            Qd7vBR");              
			System.out.println("                                                             IPgv");               
			break;
		case 9: 
			vueltas = 71;
			distancia = 4326;
			distanciaTotal = vueltas*distancia;
			maxDist = distanciaTotal;
			lapDist= distancia;                                                               
			System.out.println("       iZqDMRQQBBBBQgq17:                               .--------------------------------.");                        
			System.out.println("       IB            :7uKgRQQDE1j7i::..                 |           GP AUSTRIA           |");                        
			System.out.println("        :BU                   :rLJ1dbZQQRQBQgMRbS       |  Circuito:	Red Bull Ring	 |");                        
			System.out.println("          BB.                                   .Q:     |  Vueltas:	"+vueltas+"		 |");                        
			System.out.println("           rBS                                  LB      |  Dist Vuelta:	"+distancia+"m		 |");                        
			System.out.println("             QB                               .BB       |  Dist Total:	"+distanciaTotal+"m		 |");                        
			System.out.println("              rBI          YPQQdXs:.       .sBBr        '--------------------------------'");                        
			System.out.println("                BB       iB2:   iLPZQQQQBMQD2.");                                  
			System.out.println("                 JB      B.");                                                     
			System.out.println("                  SB     B");                                                
			System.out.println("                   QB    2B");                                                     
			System.out.println("                    Bg    MQ            .7EZDDgZgDgDgDgDgDgDgZggMggZgL");          
			System.out.println("                     BJ    BB         sBq7v:                         rB");         
			System.out.println("                      B:    BM      .BB                               BQ");        
			System.out.println("                      .B     BB:  .QBr                                 B");        
			System.out.println("                       iB     7gZ1QY                                   BK");       
			System.out.println("                        1B                                             BB");       
			System.out.println("                         RB                                            .Br");      
			System.out.println("                          BB                                        :SQEd");       
			System.out.println("                           QB                                 .iJKMBBRv.");        
			System.out.println("                            5B.                        .:72gBBBBgPYi");            
			System.out.println("                             :BB                .:7dgERBQZqYr");                   
			System.out.println("                               BBr       ..7udQBBBQKqRD");                         
			System.out.println("                                MBr.r1dQBBBBg27");                                 
			System.out.println("                                 D5BBM5v");                                        
			break;
		case 10: 
			vueltas = 52;
			distancia = 5901;
			distanciaTotal = vueltas*distancia;
			maxDist = distanciaTotal;
			lapDist= distancia;
			System.out.println("                     iiii");                         
			System.out.println("                    7IS SJUi");                       
			System.out.println("                   qM:   rQQP7");                                   
			System.out.println("                   Bb      5BMbg.");                                                
			System.out.println("                    QB      i7PBBP.");                                         
			System.out.println("                 :iqMr        .5BB2                      ::i.");                   
			System.out.println("               iSQg7            .RB:                   iub5YI7.");                 
			System.out.println("            .:IBRi                rBBQMr.              ZvgL7PBQ2:");              
			System.out.println("          :7sBQ7                    rBBBR:            r B7    YBg          .------------------------------------.");
			System.out.println("       : rQQBj                        rBBi            7:iPS2r   YBPi       |          GP GREAT BRITAIN          |"); 
			System.out.println("      vjJR7.                           7g              i::i.BE    KB.      |  Circuito:		Silverstone	|");     
			System.out.println("     :5rB                              1g                 s B1     UB      |  Vueltas:		"+vueltas+"			|");     
			System.out.println("      rvqQ7                           iBD                :.gB       Q.     |  Dist Vuelta:	"+distancia+"m		|");      
			System.out.println("          IBg.                        MB7i             .77Bq        B:     |  Dist Total:	"+distanciaTotal+"m		|");     
			System.out.println("            7BBU                      sB              7rXB:         B:     '------------------------------------'");     
			System.out.println("              7BBBi                    BB:          :77QZ           B:");          
			System.out.println("                 PBBq.                  BBi        rrPB:            B:");          
			System.out.println("                   iBBB7                 sBs.    i7jBI              B:");          
			System.out.println("                      5BBQ:               iB     iBQ                B:");          
			System.out.println("                        :QBBU        .QS2sr     EQr                 B:");          
			System.out.println("                           2BBQi     vB5:.   :KB1                   B:");          
			System.out.println("                             :BBB      .rYISqS7                     B:");          
			System.out.println("                               1BB                                 SB:");          
			System.out.println("                                IBR   uBBBBj.     .ñBRQZZbPXKKDQBBBB:");           
			System.out.println("                                 rBBBBQU  7BQBBBQgjuUXKddDgMggEP");                
			System.out.println("                                   PMX7");                                         
			break;
		case 11: 
			vueltas = 67;
			distancia = 4573;
			distanciaTotal = vueltas*distancia;
			maxDist = distanciaTotal;
			lapDist= distancia;
			System.out.println("                           .i7UbQBBBQBBB.");                                       
			System.out.println("                 .:ruKgBBBBBBBRP27i.  BB.");                                       
			System.out.println("              7BBBBBMd2vi:.          gBi                .-------------------------------.");                                
			System.out.println("             MBK:                   rBU                 |          GP ALEMANIA          |");                                
			System.out.println("            7Bj                      BB.                |  Circuito:	Hockenheim	|");                                
			System.out.println("            BQ.                       BQ.               |  Vueltas:	"+vueltas+"		|"); ;                                
			System.out.println("           .BK                         BQ.              |  Dist Vuelta:	"+distancia+"m		|");                                
			System.out.println("           UB:                          BB.             |  Dist Total:	"+distanciaTotal+"m		|");                                
			System.out.println("           BB                            BBr            '-------------------------------'");                               
			System.out.println("          :Q2                             gBX");                                   
			System.out.println("          PB:   rBBBQ.                     YBB.");                                 
			System.out.println("          BQ   .BQ .BM                      .BBq");                                
			System.out.println("         rBJ   QBi  BB                        iBBS ");                             
			System.out.println("         RB.  .BM   QQ                          .gBgi");                           
			System.out.println("         BZ    XBU  bB.                        u2r:UBBML.");                       
			System.out.println("        uB7     IBY 2Q:                      vBBKBBr  YQBBQui");                   
			System.out.println("        BB      rBs 7Bi                      BB   JBBi   .7bBBBRui");             
			System.out.println("        BQ      UB7 .Bb                     :BM     1BBr      .rqQBBRui");         
			System.out.println("        7BBq2I1PBB.  XBP                    XB2       jBBr          :1ZQQS");      
			System.out.println("         .LPZEZKv     rBBBBBBBBBBBBBBBBBBBBBB2          2QBDSU2uuLLrrrvSBQ7");     
			System.out.println("                         'i77vvLvY7v77rri'                .L25IXSqKPKqSS1i");      
			break;
		case 12: 
			vueltas = 70;
			distancia = 4381;
			distanciaTotal = vueltas*distancia;
			maxDist = distanciaTotal;
			lapDist= distancia;			
			System.out.println("                     .7PgRgESJr:.");                                               
			System.out.println("                  .:XBBs      QBBBB:");                                            
			System.out.println("                  .:BB           :BR.");                                           
			System.out.println("                    iBRr          :QBq     .2ZMv");                        
			System.out.println("                      UBBQr.        .QBBiuBBZ7ZB2");                       
			System.out.println("                        iBBB7          1BB1    LB7 ");                       
			System.out.println("                           QB                   sB:");                      
			System.out.println("                           iB                    uBJ");                       
			System.out.println("                           YB                     :BBBZJ:");                       
			System.out.println("                           .B.                      ij2EBQg         .--------------------------------.");            
			System.out.println("                            Bd                           .BB        |           GP HUNGRIA           |");               
			System.out.println("                            XQ                            BB        |  Circuito:	Hungaroring	 |");               
			System.out.println("                            .Bi                           BD        |  Vueltas:		"+vueltas+"		 |");                
			System.out.println("                             BB                           BL        |  Dist Vuelta:	"+distancia+"m		 |");               
			System.out.println("                             vB                          .Qi        |  Dist Total:	"+distanciaTotal+"m		 |");               
			System.out.println("                              Bv                         :B.        '--------------------------------'");               
			System.out.println("                              BB                         iB");                     
			System.out.println("                              PB.                        vB");                     
			System.out.println("                              'BBj.                      5B");                     
			System.out.println("                                iPBBB1.                  PB");                     
			System.out.println("                                     BQ:     .MBdEdEQBBBgB'");                     
			System.out.println("                                     BB7      BB ");                       
			System.out.println("                    .XBBBBBBBBBBBBBBQP:.      :ZBBBBQRDBgi");                      
			System.out.println("                  iQBQr                                 dQ.");                     
			System.out.println("                 bQK                                    BB");                      
			System.out.println("                 sBQQBBBBBBBBBBBBBBBBQBQBBB7BBBBBQBBBQBBB.");
			break;
		case 13: 
			vueltas = 44;
			distancia = 7004;
			distanciaTotal = vueltas*distancia;
			maxDist = distanciaTotal;
			lapDist= distancia;                                                                       
			System.out.println("                                      ugMQDiivqQRQBBBQBBMIvi:.");                            
			System.out.println("                               .:DMBBBK7iirSKSv:     :sZQBBBBBKSIbj7:.");                    
			System.out.println("                        .7u1BBQEK7:.    7:                 .:vgQBBBBBBBQKvi");               
			System.out.println("                     .:1QBDr.                                       .:7IDBBBb");             
			System.out.println("                   :ZDPi                                                   7B");             
			System.out.println("                  .DQELsKUU21rsDPgKXY                                       BR2u.");         
			System.out.println("                                   .BB                                        ':BB");        
			System.out.println("                                    7BQg2sri:.              .2gBQBQBBBi.        iB.");        
			System.out.println("                                         'BQBBBBBQs         PgB     .7PBBBBBQs  iQ2");       
			System.out.println("                                              .75BBB7       qBI           .rBBS  QB");       
			System.out.println("                                                  iQBM      gBB              BI  1B.");      
			System.out.println("                                                   .PBB.     gBg             BE  uB:");      
			System.out.println("                                                     IBB.     bBB:           rB. iB");       
			System.out.println("       .----------------------------------.           .QB      EQBu            r2b.");       
			System.out.println("       |            GP BELGICA            |            7B        XBB:");                     
			System.out.println("       |  Circuito:	Spa-Francorchamps |            vB         vBQ");                     
			System.out.println("       |  Vueltas:	"+vueltas+"		  |            7B        IBB1");                     
			System.out.println("       |  Dist Vuelta:	"+distancia+"m		  |            7B       ZBj");                       
			System.out.println("       |  Dist Total:	"+distanciaTotal+"m		  |            :B       BB");                        
			System.out.println("       '----------------------------------'             Bs       BB");                       
			System.out.println("                                                        .B        PB");                      
			System.out.println("                                                         jB        gB");                     
			System.out.println("                                                          bB.    .iBQ"); 
			System.out.println("                                                           LQBRBBBK:");
			break;
		case 14: 
			vueltas = 53;
			distancia = 5794;
			distanciaTotal = vueltas*distancia;
			maxDist = distanciaTotal;
			lapDist= distancia;
			System.out.println("     .ouqgRBBBB.");                                                                
			System.out.println("   .rBBgd2J7i:iBB                     .---------------------------.");                                                      
			System.out.println("   .BE'        'QB                    |         GP ITALIA         |");                                                      
			System.out.println("    B5           BB                   |  Circuito:	Monza	  |");                                                                         
			System.out.println("    vB.           QB                  |  Vueltas:	"+vueltas+"	  |");                                                                  
			System.out.println("     BB            BB                 |  Dist Vuelta:	"+distancia+"m	  |");                                     
			System.out.println("     .BL            BB                |  Dist Total:	"+distanciaTotal+"m	  |");                                        
			System.out.println("      PB             BB.              '---------------------------'");                                           
			System.out.println("       BR             5BB");                                                    
			System.out.println("       iBJ              RQR");                                           
			System.out.println("        iBB              .BBE ");                                                  
			System.out.println("         .Bi               .BBZ");                                                   
			System.out.println("          BS                 .BBd");                                                   
			System.out.println("          BB                   .BBD");                                                  
			System.out.println("          1B                     .BBd");                                                  
			System.out.println("          iB:                      .BBBQBQ.");                                                
			System.out.println("           B1                         ::.EBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBR:");     
			System.out.println("           BB                                                            UB:");    
			System.out.println("           sB:                                                           .Qr");    
			System.out.println("            BB                                                          7BM");     
			System.out.println("             BBL          .dg                                      .rSMBQ7");      
			System.out.println("              7BBg.    .:IB 'BBBBBBBBQBBBQBBBBBBBIKQPPBBBBBBBBBBBBBBBBS.");        
			System.out.println("                .1ZBBBBBQM:");                                                     
			break;
		case 15: //Seguir modificando para que quede bien
			vueltas = 61;
			distancia = 5072;
			distanciaTotal = vueltas*distancia;
			maxDist = distanciaTotal;
			lapDist= distancia;
			System.out.println("       .---------------------------------.");
			System.out.println("       |           GP SINGAPUR           |");
			System.out.println("       |  Circuito:	Marina Bay	 |");
			System.out.println("       |  Vueltas:	"+vueltas+"		 |");
			System.out.println("       |  Dist Vuelta:	"+distancia+"m		 |                  .:Ii");               
			System.out.println("       |  Dist Total:	"+distanciaTotal+"m		 |                 :BBQI.");            
			System.out.println("       '---------------------------------'                :Bi 'XZY.");           
			System.out.println("                                                          EB   :7BX");             
			System.out.println("                                                          RB     5r");             
			System.out.println("                             57                            Bu    bd ");            
			System.out.println("                          v:BBBBQv.                        iB.   IBi");            
			System.out.println("                 BBBg    riBB   XQQBr                       QB   rB7s");           
			System.out.println("               .BM  PBR  :BQ       rBBMi                     B.  ig7J");           
			System.out.println("               BDr    'acii'          YBBgI7:.              .B.   7vL.");         
			System.out.println("             .BE7i                     .YugRRQBBBBBQBBBBBQBBBBr   Is1i");          
			System.out.println("            .BLii       .BBQ.                                     5B:Y");          
			System.out.println("           sBX:        JB.:YBBK.                                  rBiu");          
			System.out.println("          jBZ         :Bu    .PBQYiv                               BJi");          
			System.out.println("         7B:         .BMP       uBBBBQr       7QQgMsi r.  . . .   .ZB");           
			System.out.println("         BB          :B:            rBEJsY7riLQg7rYURB:    ...    YBM");           
			System.out.println("         YBR         qB            .vjMQBBBBBBB      BBPRSIQBBYvLBBv");            
			System.out.println("           QB:       BR                               iUv7777sUdZEL ");            
			System.out.println("            IB       B7");
			System.out.println("            :BI     rB");
			System.out.println("             rBQP   gQ");
			System.out.println("               iBBi B5"); 
			System.out.println("                 iBBB:");
			System.out.println("                   Yr ");
			break;
		case 16: 
			vueltas = 53;
			distancia = 5872;
			distanciaTotal = vueltas*distancia;
			maxDist = distanciaTotal;
			lapDist= distancia;
			System.out.println("     .--------------------------.");				
			System.out.println("     |         GP RUSIA         |");
			System.out.println("     |  Circuito:	Sochi	|                                       ..");          
			System.out.println("     |  Vueltas:	"+vueltas+"	|                                   rBQBBPi");      
			System.out.println("     |  Dist Vuelta:	"+distancia+"m	|                                 rBd. rLgBg");    
			System.out.println("     |  Dist Total:	"+distanciaTotal+"m |                                LBE    .EB:");    
			System.out.println("     '--------------------------'                               LB7    :gB.");     
			System.out.println("                                                               sB     :gB.");       
			System.out.println("                                                              :B     :EB.");       
			System.out.println("                          .:rrri:.                            Bi    :ZB.");  
			System.out.println("                     .rPRBgP2UuIXEgQEJ                        B:   :EB.");    
			System.out.println("                 iSgBgXr.           .uBQ7                      PB :bB.");     
			System.out.println("              rBdXr.                   .KBbi           r       MS.5B.");     
			System.out.println("              7Q                          iPBgKvi.:i1gBBB     BS.UB:");            
			System.out.println("               ZQ                            .:Y2qK5v:  QR  :BX:DB:");             
			System.out.println("                B7      rIEEEKY.                         7QgBDBQd");               
			System.out.println("                 B    qBd7...:LMB7                      LPBBDS:");                 
			System.out.println("                 ZM  BQ         .BQ                .vqBQQJ.");                     
			System.out.println("                 Bs DB            Bb          .vKQBg1i");                          
			System.out.println("            .:r7KB  B              B:    .7qQQg2r.");
			System.out.println("     i5PDQQREPUYi   B.             iBrIRBR5r. ");  
			System.out.println("     Bv..           JB              757. ");   
			System.out.println("    iB               QB");                  
			System.out.println("    gD                BK ");            
			System.out.println("    Bs                 Br");         
			System.out.println("    PB              .1BD.");      
			System.out.println("     B:           7BB5");       
			System.out.println("     .B        iRQd.");         
			System.out.println("      uB    .dBRi");            
			System.out.println("       MB:UBBv");               
			System.out.println("        rqu.");             
			break;
		case 17: 
			vueltas = 56;
			distancia = 4573;
			distanciaTotal = vueltas*distancia;
 			maxDist = distanciaTotal;
			lapDist= distancia;                                                          
			System.out.println("                                         S7vrr7PgBQQ2U7i7gE");       
			System.out.println("                                  irYuPPPDuQ2gPi          B7.");     
			System.out.println("                               DQIM55PiP            .iiirKBi");      
			System.out.println("                             .B7r                JEBqLYvsr'");       
			System.out.println("                             KQ   rus     .QMRq QB:");               
			System.out.println("                            :Bi gBL.rQ7  .B7  'ir");                 
			System.out.println("                           7B7 BL     QQqBi");                       
			System.out.println("                           IB :Q");                                  
			System.out.println("                            B rB");                                  
			System.out.println("               ..           SK B.");                                  
			System.out.println("               XPQ7         .B :Q");                                 
			System.out.println("               EB Pd.        gL gD");                                
			System.out.println("                DP JQB.      Eb  Bu");                               
			System.out.println("                 qB  :DMS:  .Q:  BJ");                               
			System.out.println("                  vB    :J2vQM :Bj");                                
			System.out.println("                   qg     qB:.Zgr");                                 
			System.out.println("                   :Qi  bBs");                                       
			System.out.println("                  .Q  EBu            .--------------------------.");                                     
			System.out.println("              .:rUD UBv              |         GP JAPON         |");                                     
			System.out.println("       is5ZDgb2r  gZi                |  Circuito:	Suzuka	|");                                     
			System.out.println("     BBX7i     :ZZ.                  |  Vueltas:	"+vueltas+"	|");                                    
			System.out.println("   .Br       vBg.                    |  Dist Vuelta:	"+distancia+"m	|");                                     
			System.out.println("   BS      XBb                       |  Dist Total:	"+distanciaTotal+"m |");                                     
			System.out.println("   bB.  .dB2                         '--------------------------'");                                     
			System.out.println("    igEZQu");
			break;
		case 18: 
			vueltas = 71;
			distancia = 4580;
			distanciaTotal = vueltas*distancia;
			maxDist = distanciaTotal;
			lapDist= distancia;
			System.out.println("        .ubZMB7iiiiivuL7riii77v7vr7777LvYvLvYvYvvr7rrr77Yvv7R5r7vvLvL7i.");        
			System.out.println("      5BQui'                                                          .rL");       
			System.out.println("     2B                                                                 U");       
			System.out.println("     B      sB.                                                         r7 ");     
			System.out.println("    .BPPQEQB' B                                                          is");     
			System.out.println("              B.                                                         .s");     
			System.out.println("              EB                                                         i:");     
			System.out.println("               B                                                         g");      
			System.out.println("              .5QgQQQQBQQQBBS1IU2Jsr:.                                  5r");      
			System.out.println("                                  .:7uISJ:                             r5");       
			System.out.println("                                        .IM                           .Z ");       
			System.out.println("                                          IE                          g");         
			System.out.println("                                           LEuYYsYJsI.               P.");         
			System.out.println("                                            . ....  iB:             17 ");         
			System.out.println("                                              . ..    Qs           r5 ");          
			System.out.println("                                                      .rSXL       .g ");           
			System.out.println("                                                          iB.     M");            
			System.out.println("      .-------------------------------------------.        gi    d:");             
			System.out.println("      |                 GP MEXICO                 |        Ei   dv");              
			System.out.println("      |  Circuito:	Autodromo Hnos Rodriguez  |        D:  LQ ");              
			System.out.println("      |  Vueltas:	"+vueltas+"			  |        D: .Q ");               
			System.out.println("      |  Dist Vuelta:	"+distancia+"m			  |        g. Q2 ");               
			System.out.println("      |  Dist Total:	"+distanciaTotal+"m			  |        g.  .Pj.");             
			System.out.println("      '-------------------------------------------'        Q.  :Dr");              
			System.out.println("                                                           Ri ZI ");               
			System.out.println("                                                           .Su. ");
			break;
		case 19: 
			vueltas = 71;
			distancia = 4309;
			distanciaTotal = vueltas*distancia;
			maxDist = distanciaTotal;
			lapDist= distancia;
			System.out.println("                                                     .---------------------------------------------.");
			System.out.println("                        QBKQZ7                       |                  GP BRASIL                  |");
			System.out.println("                       RB   :UBDu.                   |  Circuito:	Autodromo Jose Carlos Pace |");
			System.out.println("                      iB       .jgR5.                |  Vueltas:	"+vueltas+"			   |"); 
			System.out.println("                      B.           7gQS:             |  Dist Vuelta:	"+distancia+"m			   |"); 
			System.out.println("        .:.         MD               iEQPi           |  Dist Total:	"+distanciaTotal+"m			   |");
			System.out.println("       JBgBu         B:                  :PQDr       '---------------------------------------------'");
			System.out.println("      BB   ZB:       BU                     .1Ddr"); 
			System.out.println("     BQ     :Bg       BI                      .r2Qg7 ");
			System.out.println("    7B        IB:      gB                         .IMgr");
			System.out.println("    B:         .Bb      rQv                          .2Mgi"); 
			System.out.println("   iQ            SB       BQ                            .IBQ."); 
			System.out.println("   QP             iB       UB.                             UBQ.");
			System.out.println("   Bi              B.       .B2                              dB.");
			System.out.println("   Q:             RQ          QB                              sB"); 
			System.out.println("   Bi           iBD            LB:                            rB ");         
			System.out.println("   PQ      .::UBQ.  .:7Yi.      .BU                           QZ ");         
			System.out.println("    B.    :1PPr     LMdIqq        QQ                         UB ");          
			System.out.println("    iB.   BB    .vQQ2    bB        ER                       vB:");           
			System.out.println("     .Bd.  'UKPdKJ'      BJ         B.                     iQ:");            
			System.out.println("       idRS.            BX         rB                      B. ");            
			System.out.println("          .JPEY.       Br         5Bi.                     B:");             
			System.out.println("              rKQPr    Pj7i:..:7KQu                         Q5");           
			System.out.println("               :irsRZ:. .:jYPUK7i                           .B");            
			System.out.println("                     7gB                                   EB:");            
			System.out.println("                       i:i:iQGRBOD7MGBPsILCVNGPRTAYSBQALHSIP'");
			break;
		case 20: 
			vueltas = 55;
			distancia = 5554;
			distanciaTotal = vueltas*distancia;
			maxDist = distanciaTotal;
			lapDist= distancia;
			System.out.println("                    .:55XqXPqPPEbEPEbEbEdDEgZDDgdEEDdDEDZDEgEgZgZEK1KRdPBM. ");     
			System.out.println("                    'i.       .                                    uBKD5RX'");      
			System.out.println("                    iB.  rEqi                                    .iB ");           
			System.out.println("                 :XBb. :Bb.rB.                                 rBBZ:");            
			System.out.println("                 BM.  dB.   .B                             7XQRS.");               
			System.out.println("                BS  iQ7      iB                   UPDbEEDEBSi");                   
			System.out.println("               BY   BQ        YB                7BIL.");                           
			System.out.println("              B7     B2        IB              :B ");                              
			System.out.println("             B7       B7        EB             BJ ");                              
			System.out.println("            B2         B:        ZZ            Br");                               
			System.out.println("           BR          .B.        MI          .BJ");                               
 			System.out.println("          7B    Lgr     PQ.       .BY        LBK.");                               
			System.out.println("          Q  :RBJSBS    2B         .Qr    LQB1 ");                                 
			System.out.println("         QP rBU    BDBQM1.           BJJRQ5.");                                    
			System.out.println("        .B  QX                       iS2.");                                       
			System.out.println("        B2 :B");                         
			System.out.println("        B  IB");                        
			System.out.println("       vB   KB               .------------------------------.");
			System.out.println("       Bu    BI              |         GP ABU DHABI         |");
			System.out.println("       B:     Bi             |  Circuito:	Yas Marina  |");
			System.out.println("       B       B             |  Vueltas:	"+vueltas+"	    |");
			System.out.println("       Q       .B            |  Dist Vuelta:	"+distancia+"m	    |");
			System.out.println("       B. :su57.BM           |  Dist Total:	"+distanciaTotal+"m	    |");
			System.out.println("       QQZQS2:v2r            '------------------------------'");
			break;
		}//switch


	}


	

}//class