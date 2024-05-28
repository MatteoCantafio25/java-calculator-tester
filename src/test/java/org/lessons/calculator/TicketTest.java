package org.lessons.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

    @Test
    void ticketCost() {
        Ticket ticket = new Ticket(100, 33);
        assertEquals(100, ticket.km);
        assertEquals(33, ticket.age);
        assertEquals(21, ticket.ticketCost());
    }

    @Test
    void createInvalidTicket() {
        assertThrows(IllegalArgumentException.class, () -> new Ticket(50, 0));
        assertThrows(IllegalArgumentException.class, () -> new Ticket(-25, 60));
    }

    @Test
    void discountedTicket(){
        Ticket ticket1 = new Ticket(100, 45);
        Ticket ticket2 = new Ticket(100, 67);
        Ticket ticket3 = new Ticket(100, 15);
        assertEquals(21, ticket1.ticketCost());
        assertEquals(8.4, ticket2.ticketCost());
        assertEquals(4.2, ticket3.ticketCost());
    }
}