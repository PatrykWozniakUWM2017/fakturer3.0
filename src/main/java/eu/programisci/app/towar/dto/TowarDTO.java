package eu.programisci.app.towar.dto;

import eu.programisci.app.towar.enums.EJednostkaMiary;

import java.util.Date;

public class TowarDTO {

    private Long id;
    private String nazwa;
    private String pkwiu;
    private EJednostkaMiary jednostkaMiary;
    private Integer vat;
    private Double cenaNetto;

    public TowarDTO() {
    }

    public TowarDTO(String aNazwa, String aPkwiu, EJednostkaMiary aJednostkaMiary, Integer aVat, Double aCenaNetto) {
        nazwa = aNazwa;
        pkwiu = aPkwiu;
        jednostkaMiary = aJednostkaMiary;
        vat = aVat;
        cenaNetto = aCenaNetto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getPkwiu() {
        return pkwiu;
    }

    public void setPkwiu(String pkwiu) {
        this.pkwiu = pkwiu;
    }

    public EJednostkaMiary getJednostkaMiary() {
        return jednostkaMiary;
    }

    public void setJednostkaMiary(EJednostkaMiary jednostkaMiary) {
        this.jednostkaMiary = jednostkaMiary;
    }

    public Integer getVat() {
        return vat;
    }

    public void setVat(Integer vat) {
        this.vat = vat;
    }

    public Double getCenaNetto() {
        return cenaNetto;
    }

    public void setCenaNetto(Double cenaNetto) {
        this.cenaNetto = cenaNetto;
    }
}
