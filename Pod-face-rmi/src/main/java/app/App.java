package app;


import br.edu.ifpb.pos.facebook.FacebookService;
import java.rmi.AccessException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joew
 */
public class App {
    
	public static void main(String[] args) throws AccessException, RemoteException, AlreadyBoundException, ClassNotFoundException {
		Registry registry = LocateRegistry.createRegistry(10888);
		registry.bind("FacadeService", new FacadeServiceImp());
		System.out.println("serviço criado");
//                Class.forName("br.edu.ifpb.pos.facebook.FacebookService");
	}
}
