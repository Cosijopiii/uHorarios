package com.Unistmo.Engine.ag;

public class RelacionPM {

	private int idProfesor;
	private int idMateria;
	private String nombreP;
	private String nombreM;
		public RelacionPM(){
		}
		public RelacionPM(int idP,int idM,String nP,String nM){
			this.idProfesor=idP;
			this.idMateria=idM;
			this.nombreP=nP;
			this.nombreM=nM;
		}
		public String toString(){	
		   	//return (idProfesor<10) ? "["+String.valueOf(idProfesor)+" "+"]" : "["+String.valueOf(idProfesor)+"]";
			//return (idProfesor<10) ? "["+nombreP+" "+"]" : "["+nombreP+"]";
			return nombreM+"->"+nombreP;
			//return "["+String.valueOf(idProfesor)+"]";  //+"-"+String.valueOf(idMateria)+"]";//+"Np:"+nombreP+"Nm:"+nombreM;
	}
		/**
		 * @return the idProfesor
		 */
		public int getIdProfesor() {
			return idProfesor;
		}
		/**
		 * @param idProfesor the idProfesor to set
		 */
		public void setIdProfesor(int idProfesor) {
			this.idProfesor = idProfesor;
		}
		/**
		 * @return the idMateria
		 */
		public int getIdMateria() {
			return idMateria;
		}
		/**
		 * @param idMateria the idMateria to set
		 */
		public void setIdMateria(int idMateria) {
			this.idMateria = idMateria;
		}
		/**
		 * @return the nombreP
		 */
		public String getNombreP() {
			return nombreP;
		}
		/**
		 * @param nombreP the nombreP to set
		 */
		public void setNombreP(String nombreP) {
			this.nombreP = nombreP;
		}
		/**
		 * @return the nombreM
		 */
		public String getNombreM() {
			return nombreM;
		}
		/**
		 * @param nombreM the nombreM to set
		 */
		public void setNombreM(String nombreM) {
			this.nombreM = nombreM;
		}
		
}
