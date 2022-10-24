package it.fi.meucci;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class App2 {
    public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
        File file = new File("serializzazione.xml");
        XmlMapper xmlMapper = new XmlMapper();
        Classe value = xmlMapper.readValue(file, Classe.class);

        System.out.println("numero: "+value.getNumero());
        System.out.println("sezione: "+value.getSezione());
        System.out.println("aula: "+value.getAula());
    }
}
