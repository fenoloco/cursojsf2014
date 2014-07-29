package org.curso.jsfproject.language;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Named;

@Named("language")
@SessionScoped
public class LanguageBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String localeCode;

    private Map<String, Object> countries;

    private Date now;

    @PostConstruct
    public void init() {
        countries = new LinkedHashMap<String, Object>();
        countries.put("English", Locale.ENGLISH); //label, value
        countries.put("Spanish", new Locale("es", "ES"));
        countries.put("Turkish", new Locale("tr", "TR"));
        now = new Date();
    }

    public Map<String, Object> getCountriesInMap() {
        return countries;
    }

    public String getLocaleCode() {
        return localeCode;
    }

    public void setLocaleCode(String localeCode) {
        this.localeCode = localeCode;
    }

    public Date getNow() {
        return now;
    }

    public void setNow(Date now) {
        this.now = now;
    }

    public void countryLocaleCodeChanged(ValueChangeEvent e) {
        String newLocaleValue = e.getNewValue().toString();
        //loop a map to compare the locale code
        for (Map.Entry<String, Object> entry : countries.entrySet()) {
            if (entry.getValue().toString().equals(newLocaleValue)) {
                FacesContext.getCurrentInstance()
                        .getViewRoot().setLocale((Locale) entry.getValue());
            }
        }
    }

    public String findMessage(String key) {
        FacesContext context = FacesContext.getCurrentInstance();
        //IMPORTANT THE NAME IS THE NAME DEFINED ON THE faces-config.xml
        ResourceBundle bundle = context.getApplication().getResourceBundle(context, "appbundle");
        return bundle.getString(key);
    }

}
