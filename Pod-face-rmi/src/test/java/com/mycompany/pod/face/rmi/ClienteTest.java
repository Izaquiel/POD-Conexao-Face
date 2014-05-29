/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pod.face.rmi;

import br.edu.ifpb.pod.FacadeService;
import br.edu.ifpb.pod.Message;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Izaquiel Cruz
 */
public class ClienteTest {
    
    public ClienteTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testConnection() throws RemoteException, NotBoundException{
        Registry registry = LocateRegistry.getRegistry("localhost", 10888);
        FacadeService service = (FacadeService) registry.lookup("FacadeService");
        ArrayList<Message> aux = new ArrayList<Message>();
        
        Message msg = new Message();
        
        msg.setFrom("teste");
        msg.setId("1");
        msg.setMessageContent("enviando teste!");
        msg.setTo("public");
        
        service.publish(aux);
        
        
        
        
        
    }
}