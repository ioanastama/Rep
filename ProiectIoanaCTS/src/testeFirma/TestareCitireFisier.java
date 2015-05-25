package testeFirma;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.junit.Test;

import clase.Angajat;
import clase.Firma;

public class TestareCitireFisier {

	@Test
	public void test() {
		Firma f=Firma.getInstance();
		Angajat a1= new Angajat("Mircea","Elena","2890908778866",8000,"FullTime","IT");
		try{
			FileReader reader=new FileReader("angajatTest.txt");
			BufferedReader bf=new BufferedReader(reader);
			String linie=null;
			while((linie=bf.readLine())!=null && (linie.length())!=0){
				linie=bf.readLine();
				 String[] elemente = linie.split(",");
	                if(elemente.length!=6){
	                    throw new Exception("Linie invalida!");
	                }
	                Angajat a = new Angajat();
	                a.setNume(elemente[0]);
	                a.setPrenume(elemente[1]);
	                a.setCNP(elemente[2]);
	                a.setSalariul(Integer.parseInt(elemente[3].trim()));
	                a.setStatus(elemente[4]);
	                a.setDepartament(elemente[5]);;
	                
	                linie = bf.readLine();
	                f.getListaAngajati().add(a);           
	                
			}
			
			bf.close();
			reader.close();
			assertEquals(a1,f.getAngajat(a1));
			
		}
		catch(FileNotFoundException ex){}
		catch(Exception ex){}
		}

	
	}


