package com.Unistmo.Engine.ag;

public class RelacionPM {

	public int idProfesor;
	public int idMateria;
	public String nombreP;
	public String nombreM;
		public RelacionPM(){
		}
		public RelacionPM(int idP,int idM,String nP,String nM){
			this.idProfesor=idP;
			this.idMateria=idM;
			this.nombreP=nP;
			this.nombreM=nM;
		}
	
	public String toString(){	
		return "["+String.valueOf(idProfesor)+"]";//+"-"+String.valueOf(idMateria)+"]";//+"Np:"+nombreP+"Nm:"+nombreM;
	}
		
		
	
}
