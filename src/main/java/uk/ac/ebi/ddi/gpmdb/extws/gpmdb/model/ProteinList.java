package uk.ac.ebi.ddi.gpmdb.extws.gpmdb.model;


import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yasset Perez-Riverol (ypriverol@gmail.com)
 * @date 02/12/2015
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProteinList {

    private List<String> proteins = new ArrayList<String>();

//    @JsonAnyGetter
    public List<String> any() {
        return proteins;
    }

    @JsonAnySetter
    public void set(String name) {
        proteins.add(name);
    }

    public boolean hasUnknowProperties() {
        return !proteins.isEmpty();
    }
}
