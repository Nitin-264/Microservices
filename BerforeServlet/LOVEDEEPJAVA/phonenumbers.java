// Online Java Compiler
// Use this editor to write, compile and run your Java code online
package com.twilio.calltracking.lib.services;
import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.calltracking.lib.Config;
import com.twilio.rest.api.v2010.account.Application;
import com.twilio.rest.api.v2010.account.availablephonenumbercountry.Local;
import com.twilio.rest.api.v2010.account.availablephonenumbercountry.LocalReader;
import com.twilio.rest.api.v2010.account.incomingphonenumber.LocalCreator;
import com.twilio.type.PhoneNumber;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
class phonensumbers {
    public static void main(String[] args) {
@SuppressWarnings("unused")
public class TwilioServices {

    private static final String DEFAULT_APP_NAME = "Call Tracking App";

    public TwilioServices() {
        Twilio.init(Config.getAccountSid(), Config.getAuthToken());
    }

    public List<Local> searchPhoneNumbers(String areaCode) {

        LocalReader localReader = Local.reader("US");
        if (areaCode != null) {
            localReader.setAreaCode(Integer.parseInt(areaCode));
        }

        Iterator<Local> phoneNumbers = localReader.read().iterator();

        List<Local> phoneNumbersAsList = new ArrayList<>();
        phoneNumbers.forEachRemaining(phoneNumbersAsList::add);

        return phoneNumbersAsList;
    }

    public com.twilio.rest.api.v2010.account.incomingphonenumber.Local purchasePhoneNumber(
            String phoneNumber, String applicationSid) {

        return new LocalCreator(new PhoneNumber(phoneNumber))
                .setVoiceApplicationSid(applicationSid)
                .create();
    }

    public String getApplicationSid() {
        ResourceSet<Application> apps = getApplications();

        Application app = apps.iterator().hasNext()
                ? apps.iterator().next()
                : Application.creator(DEFAULT_APP_NAME).create();

        return app.getSid();
    }

    private ResourceSet<Application> getApplications() {
        return Application
                .reader()
                .setFriendlyName(DEFAULT_APP_NAME)
                .read();
    }
}


    }
}