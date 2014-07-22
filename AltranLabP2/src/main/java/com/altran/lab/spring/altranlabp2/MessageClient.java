/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altran.lab.spring.altranlabp2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 * @author Altran
 */

public class MessageClient {
    
    private MessageService service;

    public MessageClient() { }
    
    public MessageClient(MessageService service) {
        this.service = service;
    }
    
    public MessageService getMessageService() {
        return service;
    }

    public void setMessageService(MessageService service) {
        this.service = service;
    }

    public void processMessages(String msg, String rec){
        //do some msg validation, manipulation logic etc
        this.service.sendMessage(msg, rec);
    }
}
