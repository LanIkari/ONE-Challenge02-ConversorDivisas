package com.one.challenge02.model;

import java.util.ArrayList;
import java.util.List;

public class datosCbxTemperatura {
    List<String> ListaTemp= new ArrayList<>();
    public void DatosComboBox(){
        // Esca las de Temperaturas
        ListaTemp.add("CELCIUS");
        ListaTemp.add("KELVIN");
        ListaTemp.add("FAHRENHEIT");
    }

}
