package org.Phone.Package;

public abstract class Phone implements PhoneOS {
    private final int baterryCapacity, baterrylife, maxcapacityContacts;
    private Contact[] contactList; // interesting choice if its better to use Collection or a Set

    public Phone(int baterryCapacity, int baterrylife, int maxcapacityContacts) {
        this.baterryCapacity = baterryCapacity;
        this.baterrylife = baterrylife;
        this.maxcapacityContacts = maxcapacityContacts;
        contactList = new Contact[maxcapacityContacts];
    }

    @Override
    public void callContact() { //would be interesting to add a time factor to calling method
                                //also would be interesting to add an answering method
                                // e.g. a phone starts calling another phone

    }

    @Override
    public void createContact() {
        // conditions that contactCapacity isnt full
        // if contactcapacity is not full proceed to add contact using the setter of the Contact Class
        // check if the contact already exists
        // nice opportunity to use method overloading
    }

    @Override
    public void viewContacts() {
        //just displaying all the elements of the ContactSet
    }

    @Override
    public void sendMessage() {

    }

    @Override
    public void viewHistory() {

    }
}

