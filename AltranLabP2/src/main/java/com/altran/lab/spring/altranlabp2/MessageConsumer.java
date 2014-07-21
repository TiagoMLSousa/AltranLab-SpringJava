/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altran.lab.spring.altranlabp2;

/**
 *
 * @author Altran
 */

public class MessageConsumer implements IConsumer {
    
    private IMessageService service;

    public MessageConsumer() { }
    
    public MessageConsumer(IMessageService service) {
        this.service = service;
    }
    
    public IMessageService getMessageService() {
        return service;
    }

    public void setMessageService(IMessageService service) {
        this.service = service;
    }

    @Override
    public void processMessages(String msg, String rec){
        //do some msg validation, manipulation logic etc
        this.service.sendMessage(msg, rec);
    }
}
