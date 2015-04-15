package com.Unistmo.uHorarios;

import java.util.StringTokenizer;

public interface RecursosConstantes {
	public static final String PATTERN_NOMBRE="(([A-Z]|[a-z])[a-zá-ú]+(([\\s]{1})|([\\s]{0})))+";
	public static final String PATTERN_NOMBREOLD="[A-Z][a-zá-ú]+[\\s]{1}[A-Z][a-zá-ú]+[\\s]{1}[A-Z][a-zá-ú]+";
	public static final String PATTERN_CORREO="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	public static final String PATTERN_TELEFONO="[0-9]{10}|[0-9]{13}";
	public static final String PATTERN_NOMINA=" ";
	public static final String PATTERN_CLAVE=" ";
	public static final String CUBICULOS [] ={"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13","14", "15", "16", "17", "18", "19", "20","21","23","24","24","25","26","27","28","29","30"};
	public static final String EDIFICIOS [] ={"1", "2"};
	public static final String CARRERAS [] ={"Lic. Informatica","Lic. Ciencias Empresariales","Lic. Administraci�n Publica","Lic. Derecho"};
    public static final String PATH_SOUND_FALL="sonidos\\FALL_01.MID";
    public static final String MENSAJE_JOPTIONPANE_ERROR_GUARDAR []={"Por favor verifique los datos que introdujo","Error al tratar de guardar los datos"};
    public static final String MENSAJE_JOPTIONPANE_ERROR_IMAGEN []={"Por favor verifique que escojio una imagen correcta","Error al tratar de asignar imagen"};
 
    //Metodo que resive un Sring Y regresa el String modificado con las primeras letras en mayusculas
    public static String ToUPPER(String str){
    	StringBuilder sb=new StringBuilder();
    	StringTokenizer tok=new StringTokenizer(str," ");
		String temp;
    	while(tok.hasMoreTokens()){
				temp=tok.nextToken();
				sb.append(String.valueOf(Character.toUpperCase((temp.charAt(0)))+temp.substring(1,temp.length())+" "));	
			}	
    	return sb.toString().trim();
    }
}
