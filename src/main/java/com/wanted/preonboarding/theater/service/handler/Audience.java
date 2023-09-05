package com.wanted.preonboarding.theater.service.handler;

public class Audience {
    private final Bag bag;

    public Audience(Bag bag){
        this.bag = bag;
    }

    public long buyTicket(Ticket ticket) {
        return bag.hold(ticket);
    }
}