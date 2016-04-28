/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.domain;

/**
 *
 * @author Daniel Viktor Isaac
 */
public class Inproceedings extends Reference {

    public final static String[] FORCE_FIELDS = {"author", "title", "booktitle", "year"};
    public final static String[] OPTIONAL_FIELDS = {"editor", "volume", "series", "pages", "address", "month", "organization", "publisher", "note", "key"};

    public Inproceedings(String ck) {
        super(ck);
        super.addRequirements(FORCE_FIELDS, OPTIONAL_FIELDS);
    }

    @Override
    public String toBibtex() {
        return "@inproceedings " + super.toBibtex();
    }
    
    @Override
    public String getType() {
        return "inproceedings";
    }

}
