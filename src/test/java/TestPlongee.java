/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import FFSSM.Club;
import FFSSM.Licence;
import FFSSM.Moniteur;
import FFSSM.Site;
import FFSSM.Plongee;
import FFSSM.Plongeur;
import java.util.Calendar;
import java.util.LocaleDate;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Julie LEROY
 */
public class TestPlongee {
    
    Moniteur MrUntel;
    Plongeur MrDupon,MrMaurice;
    Club PyreneePlongee;
    Licence licence1,licence2;
    Site Canet;
    
@Before 
    public void setUp() {
    
        LocalDate d = LocalDate.getInstance()
        d.add(LocalDate.YEAR);
        
        MrUntel = new Moniteur ("001","Untel","Bruno","a","045687",null,7964);
        MrDupon = new Plongeur ("0001","Dupon","Bernard","b","021357",null,4563);
        MrMaurice = new Plongeur ("0002","Maurice","François","c","123478",null,5641);
        PyreneePLongee = new Club (MrUntel,"PyrennePlongee","2048650");
        licence1 = new Licence (MrDupon,"189625",c,3,PyrenneePlongee);
        licence2 = new Licence (MrMaurice,"489655",d,3,PyrenneePlongee);
        site = new Site ("Canet",null);
        
       
@Test
public void testplongeesConformes(){
        LocalDate d = LocalDate.getInstance();
        Plongee plongee = new Plongee(site,MrUntel,a,200,400);
        MrMaurice.ajouterLicence(licence2);
        plongee.ajouteParticipant(MrMaurice);
        assertTrue(plongee.estConforme());
        MrDupon.ajouterLicence(licence1);
        plongee.ajouteParticipant (MrDupon);
        assertFalse(plongee.estConforme());
        
        
@Test
        public void testValide(){
          LocalDate delivrance = LocalDate.getInstance();
		licence = new Licence(null, null, delivrance, 0, null);
                assertTrue( licence.estValide(delivrance) );
                
                LocalDalte moisPlusUn = (LocalDate) delivrance();
		moisPLusUn.add(LocalDate.MONTH);             
		assertTrue( licence.estValide(MoisPlusUn) );
                
               
@Test
        public void testInvalide(){
            
            LocalDate delivrance = LocalDate.getInstance();
             licence2 = new Licence(null, null, delivrance, 0, null);
             
		LocalDate d = (LocalDate) delivrance();
		d.add(LocalDate.YEAR);
		d.add(LocalDate.DAY_OF_YEAR);
		assertFalse( licence2.estValide(d) );
                
                LocalDate d2 = (LocalDate) delivrance.clone();
		d2.add(LocalDate.DAY_OF_YEAR, -1);
		assertTrue(licence2.estValide(d2));
    }
}
