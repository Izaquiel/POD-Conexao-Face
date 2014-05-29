package app;


import br.edu.ifpb.pod.FacadeService;
import br.edu.ifpb.pod.Message;
import br.edu.ifpb.pod.Session;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joew
 */

public class FacadeServiceImp extends UnicastRemoteObject implements FacadeService{
    
    
    public FacadeServiceImp() throws RemoteException{
        super();
    }
    
    

    public Session login(String login, String password) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void logout(Session sesion) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Message sendMessage(Session session, Message message) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<Message> publish(ArrayList<Message> messages) throws RemoteException {
        
        ArrayList<Message> mensagens = new ArrayList<Message>();
        ComunicacaoFace cf = new ComunicacaoFace();
        
        System.out.println("qts: " + messages.size());
        for(Message m: messages){
           
            try {
                mensagens.add(cf.publicaMenssagem(m));
            } catch (IOException ex) {
                Logger.getLogger(FacadeServiceImp.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
           
       }
        
        return mensagens;
    }
    
    
}
