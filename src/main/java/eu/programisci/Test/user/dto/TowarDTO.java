package eu.programisci.Test.user.dto;

import java.util.Date;
enum EJednostkaMiary{
    LITR, KILOGRAM, SZTUKA
}
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

    public void setId(Long aId) {
        id = aId;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String aNazwa) {
        nazwa = aNazwa;
    }

    public String getPkwiu() {
        return pkwiu;
    }

    public void setPkwiu(String aPkwiu) {
        pkwiu = aPkwiu;
    }

    public EJednostkaMiary getJednostkaMiary() {
        return jednostkaMiary;
    }

    public EJednostkaMiary setJednostkaMiary(EJednostkaMiary aJednostkaMiary) {
        jednostkaMiary = aJednostkaMiary;
    }

    public Integer getVat() {
        return vat;
    }

    public Integer setVat(Integer aVat) {
        vat = aVat;
    }

    public Double getCenaNetto() {
        return cenaNetto;
    }

    public Double setCenaNetto(Double aCenaNetto) {
       return cenaNetto = aCenaNetto;
    }

}
