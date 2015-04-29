package com.Unistmo.uHorarios;

import java.util.StringTokenizer;
/**
 * 
 * @author Cosijopii
 * Interfaz que implementa Constantes para toda la aplicacion uHorarios
 */
public interface RecursosConstantes {
	/**
	 * Expresion regular patron nombre materia
	 */
	public static final String PATTERN_CODIGO_MATERIA="[0-9]+";
	/**
	 * Expresion regular Patron Nombre Profesor
	 */
	public static final String PATTERN_NOMBRE="(([A-Z]|[a-z])[a-zá-ú]+(([\\s]{1})|([\\s]{0})))+";
	/**
	 * @deprecated
	 * Expresion regular Patron Nombre Profesor
	 */
	public static final String PATTERN_NOMBREOLD="[A-Z][a-zá-ú]+[\\s]{1}[A-Z][a-zá-ú]+[\\s]{1}[A-Z][a-zá-ú]+";
	/**
	 * Expresion regular Patron Correo electronico
	 */
	public static final String PATTERN_CORREO="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	/**
	 * Expresion regular Patron Numero telefonico
	 */
	public static final String PATTERN_TELEFONO="[0-9]{10}|[0-9]{13}";
	/**
	 * Expresion regular Patron de Nomina
	 */
	public static final String PATTERN_NOMINA="[0-9]+";
	/**
	 * Cubiculos de profesores
	 */
	public static final String CUBICULOS [] ={"1", "2","3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13","14", "15", "16", "17", "18", "19", "20","21","23","24","24","25","26","27","28","29","30"};
	/**
	 * Edificios de profesores
	 */
	public static final String EDIFICIOS [] ={"1", "2"};
	/**
	 * Carreras que imparte la universidad
	 */
	public static final String CARRERAS [] ={"Lic. Informatica","Lic. Ciencias Empresariales","Lic. Administraci�n Publica","Lic. Derecho"};
    /**
     * Ruta relativa del archivo Sonido ERROR
     */
	public static final String PATH_SOUND_FALL="sonidos\\FALL_01.MID";
	/**
	 * Mensajes de error al Guardar datos
	 */
	public static final String MENSAJE_JOPTIONPANE_ERROR_GUARDAR []={"Por favor verifique que relleno todos los campos","Error al tratar de guardar los datos"};
    /**
     * Mensajes de error al Tratar con Imagenes
     */
	public static final String MENSAJE_JOPTIONPANE_ERROR_IMAGEN []={"Por favor verifique que escojio una imagen correcta","Error al tratar de asignar imagen"};
	/**
	 * Mensajes de error cuando el profesor esta duplicado 
	 */
	public static final String MENSAJE_JOPTIONPANE_ERROR_PROFESOR_DUPLICADO[]={"Por favor utilize otro numero de nomina ya que la actual esta en uso","Numero de nomina ya existente"};
	/**
	 * Mensaje de alerta al eliminar profesor
	 */
	public static final String MENSAJE_JOPTIONPANE_ALERTA_ELIMINAR_PROFESOR[]={"Desea dar de baja del sistema al profesor(a)","Dar de baja profesor"};
    /**
     * Numero de semestres que tiene la universidad 
     */
	public static final String SEMESTRES []={"1","2","3","4","5","6","7","8","9","10"};
   /**
    * Mensajes de error cuando la materia esta duplicada
    */
	public static final String MENSAJE_JOPTIONPANE_ERROR_MATERIA_DUPLICADA[]={"Por favor utilize otro codigo para la materia ya que la actual esta en uso","Materia ya existente"};

	/**
	 * Mensaje de alerta al eliminar materias
	 */
	public static final String MENSAJE_JOPTIONPANE_ALERTA_ELIMINAR_MATERIA[]={"Desea eliminar esta materia","Eliminar materia"};

	
    /**
     * Metodo que resive un String y regresa el String modificado con las primeras letras en mayusculas
     * por ejemplo "hola sol", Salida "Hola Sol" 
     * @param str String a formatear
     * @return String ya formateado con las primeras letras de cada palabra en mayusculas
     */
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
    
    public static int Buscar(Object i,Object[] t)
	{
		for (int j = 0; j<t.length; j++) {
			if(i.equals(t[j])){
				return j;
			}
		}	
		return -1;
	}
}
