package personal.qcl.test.entities;

public class Catalog {
    private int catalogId;
    private String catalogName;
    private String getCatalogDisc;

    public Catalog() {
    }

    public Catalog(int catalogId, String catalogName, String getCatalogDisc) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.getCatalogDisc = getCatalogDisc;
    }

    public Catalog(int catalogId, String catalogName) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public String getGetCatalogDisc() {
        return getCatalogDisc;
    }

    public void setGetCatalogDisc(String getCatalogDisc) {
        this.getCatalogDisc = getCatalogDisc;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "catalogId=" + catalogId +
                ", catalogName='" + catalogName + '\'' +
                ", getCatalogDisc='" + getCatalogDisc + '\'' +
                '}';
    }
}

