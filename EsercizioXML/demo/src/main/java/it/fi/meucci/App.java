package it.fi.meucci;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;


/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     * @throws IOException
     * @throws JsonMappingException
     * @throws JsonGenerationException
     */
    public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
        Alunno A1=new Alunno("leonardo", "pacini", new GregorianCalendar(2004,10,19));
        Alunno A2=new Alunno("gianni", "pippi", new GregorianCalendar(2005,11,30));
        Alunno A3=new Alunno("beppe", "sacchi", new GregorianCalendar(2004,6,23));
        Alunno A4=new Alunno("simone", "fausto", new GregorianCalendar(2004,9,10));
        ArrayList<Alunno> lista = new ArrayList<Alunno>();
        lista.add(A1);
        lista.add(A2);
        lista.add(A3);
        lista.add(A4);

        Classe C1 = new Classe(5,"CIA", "04-TC", lista);
        
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.writeValue(new File("serializzazione.xml"), C1);
    }
}
