package Interface.model.services;

import Interface.model.vehicle.CarRental;
import Interface.model.vehicle.Invoice;

public class RentalService {

    private Double pricePerDay;
    private Double pricePerHour;

    private TaxService taxServices;

    public RentalService(Double pricePerDay, Double pricePerHour, TaxService taxServices) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxServices = taxServices;
    }

    public void processInvoice (CarRental carRental){
        // gera a nota do pagamento
        long t1 = carRental.getStart().getTime();
        long t2 = carRental.getFinish().getTime();
        double hours = (double)(t2 - t1) / 1000 / 60 / 60; //ms / seg/ min/ h

        double basicPayment;
        if (hours <= 12.0){
            basicPayment = Math.ceil(hours) * pricePerHour;
        }
        else {
            basicPayment = Math.ceil(hours / 24) * pricePerDay;
        }

        double tax = taxServices.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment,tax));
    }
}
