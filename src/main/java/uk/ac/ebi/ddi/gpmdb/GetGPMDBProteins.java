package uk.ac.ebi.ddi.gpmdb;

import uk.ac.ebi.ddi.gpmdb.extws.gpmdb.client.GPMDBClient;
import uk.ac.ebi.ddi.gpmdb.extws.gpmdb.client.ModelGPMDBClient;
import uk.ac.ebi.ddi.gpmdb.extws.gpmdb.config.GPMDBWsConfigProd;
import uk.ac.ebi.ddi.gpmdb.extws.gpmdb.model.ProteinList;

import java.util.Collections;
import java.util.List;


/**
 * This project takes
 *
 * @author Yasset Perez-Riverol
 */

public class GetGPMDBProteins {

    private static GetGPMDBProteins instance;

    private ModelGPMDBClient gpmdbClient;

    private GetGPMDBProteins(){
        gpmdbClient = new ModelGPMDBClient(new GPMDBWsConfigProd());
    }

    public GetGPMDBProteins getInstance(){
        if(instance == null)
            instance = new GetGPMDBProteins();
        return instance;
    }


    public List<String> getListProteinIds(String modelID){
        if(modelID != null && !modelID.isEmpty()){
            String[] proteinIds = gpmdbClient.getAllProteins(modelID);
            if(proteinIds != null){
                //return proteinIds.any();
            }
        }
        return Collections.EMPTY_LIST;
    }



}
