package com.retos.screenplay.traductorGoogle.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleTraductorPage extends PageObject {
	
	
	public static final Target BOTON_LENGUAJE_ORIGEN = 
			Target.the("El botón para seleccionar el lenguaje origen").located(By.id("gt-sl-gms"));
	
	public static final Target BOTON_LENGUAJE_DESTINO = 
			Target.the("El botón para seleccionar el lenguaje destino").located(By.id("gt-tl-gms"));
	
	public static final Target OPCION_ESPANOL = 
			Target.the("El botón para seleccionar el lenguaje destino espanol").located(By.xpath("//div[@id=\":3q\"]"));

	public static final Target OPCION_INGLES = 
			Target.the("El botón para seleccionar el lenguaje origen ingles").located(By.xpath("//div[@id=\":1e\"]"));

	public static final Target AREA_DE_TRADUCCION = 
			Target.the("Area para ingresar el texto a traducir").located(By.id("source"));

	public static final Target AREA_TRADUCIDA = 
			Target.the("Area ver el texto traducido").located(By.id("gt-res-dir-ctr"));
	
	public static final Target BOTON_TRADUCIR = 
			Target.the("Boton para hacer la traduccion").located(By.id("gt-submit"));
}