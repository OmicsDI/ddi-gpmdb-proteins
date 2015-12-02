package uk.ac.ebi.ddi.gpmdb.extws.gpmdb.client;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import uk.ac.ebi.ddi.gpmdb.extws.gpmdb.config.GPMDBWsConfigProd;
import uk.ac.ebi.ddi.gpmdb.extws.gpmdb.model.ProteinList;

import static org.junit.Assert.*;

/**
 * @author Yasset Perez-Riverol (ypriverol@gmail.com)
 * @date 02/12/2015
 */
public class ModelGPMDBClientTest {

    ModelGPMDBClient client;

    @Before
    public void setUp() throws Exception {
       client = new ModelGPMDBClient(new GPMDBWsConfigProd());
    }

    @Test
    public void testGetAllProteins() throws Exception {
        String[] proteins = client.getAllProteins("GPM10100159682");
        System.out.println(proteins);

    }
}