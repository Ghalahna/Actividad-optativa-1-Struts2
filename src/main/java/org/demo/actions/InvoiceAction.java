package org.demo.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.demo.actions.beans.InvoiceBean;

public class InvoiceAction extends ActionSupport  {

    InvoiceBean invoiceBean;
    private final int IVA = 21;
    @Override
    public String execute() throws Exception {
        float importemasiva = Integer.parseInt(invoiceBean.getAmount()) + ((float) (Integer.parseInt(invoiceBean.getAmount()) * IVA) / 100);
        invoiceBean.setImportemasiva(String.valueOf(importemasiva));
        return SUCCESS;
    }

    public int getIVA() { return IVA; }

    public InvoiceBean getInvoiceBean() {
        return invoiceBean;
    }

    public void setInvoiceBean(InvoiceBean invoiceBean) {
        this.invoiceBean = invoiceBean;
    }

    @Override
    public void validate() {
        if (invoiceBean.getSubject().isEmpty()) {
            addFieldError("invoiceBean.subject", "El concepto es obligatorio.");
        }
        if (invoiceBean.getAmount().isEmpty()) {
            addFieldError("invoiceBean.amount", "El importe es obligatorio.");
        }
    }
}
