package uk.ac.ebi.ddi.gpmdb.extws.gpmdb.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uk.ac.ebi.ddi.gpmdb.extws.gpmdb.config.AbstractGPMDBWsConfig;
import uk.ac.ebi.ddi.gpmdb.extws.gpmdb.model.ProteinList;


/**
 * @author Yasset Perez-Riverol ypriverol
 */
public class ModelGPMDBClient extends GPMDBClient{

    private static final Logger logger = LoggerFactory.getLogger(ModelGPMDBClient.class);

    /**
     * Default constructor for Ws clients
     *
     * @param config
     */
    public ModelGPMDBClient(AbstractGPMDBWsConfig config) {
        super(config);

    }

    /**
     * Returns the Datasets from MtabolomeWorbench
     * @return A list of entries and the facets included
     */
    public String[] getAllProteins(String model){

        String url = String.format("%s://%s/model/proteins/gpm=%s",
                config.getProtocol(), config.getHostName(), model);
        //Todo: Needs to be removed in the future, this is for debugging
        logger.debug(url);

        return this.restTemplate.getForObject(url, String[].class);
    }

}
