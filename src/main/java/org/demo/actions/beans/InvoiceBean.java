package org.demo.actions.beans;

import java.util.Date;

public class InvoiceBean {

    private String subject;
    private Date dateFrom;
    private Date dateTo;
    private String amount;
    private String importemasiva;

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAmount() { return amount; }
    public void setAmount(String amount) { this.amount = amount; }

    public String getImportemasiva() { return importemasiva; }
    public void setImportemasiva(String importemasiva) { this.importemasiva = importemasiva; }
}
