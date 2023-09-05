package com.wanted.preonboarding.theater.service.handler;

public class TicketSeller {
    private final TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice){
        this.ticketOffice = ticketOffice;
    }

    public long sellTo(Audience audience) {
        Ticket ticket = ticketOffice.pulishTicket();
        return audience.buyTicket(ticket);
    }

    public void receiveTicketFee(long ticketFee) {
        ticketOffice.increaseSalesAmount(ticketFee);
    }
}
