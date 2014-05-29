package app;


import br.edu.ifpb.pod.Message;
import br.edu.ifpb.pos.facebook.Configuration;
import br.edu.ifpb.pos.facebook.FacebookService;
import br.edu.ifpb.pos.facebook.FacebookServiceImpl;
import java.io.IOException;
import java.nio.charset.Charset;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joew
 */
public class ComunicacaoFace {
    public Message publicaMenssagem(Message msg) throws IOException{
        
        String token = "CAAHLTnYdDYYBAJO2Fyah0XVfEbVyUDFeGVdLs96evZAnVXhI60htBxyIL7YUInJEg41IngqSmu98fAx3cMPcO89pqZAgo6ynTijyrPvU7M84AJ6SQRCSXVp6He3UDgnqmbtJwxmEoEkt191ZBon3j4yXGNC3qZB4ja2ySWnvjR5UGE4BMZCVT1d9FrQ0ZB7w8ZD";
        Configuration config = new Configuration();
        config.setCharset(Charset.forName("UTF-8"));
        System.out.println("Entrando em service");
        System.out.println(FacebookService.class);
        FacebookService service = new FacebookServiceImpl(config);
        
        String response = service.createFeed(token, msg.getMessageContent());
        System.out.println(response);
        msg.setfId(this.trataID(response));
        return msg;
        
        
    }
    
    public String trataID(String inputID){
        String[] temp = inputID.split(":\"");
        String outputString = temp[1];
        outputString=outputString.replace("\"}", "");
        
        return outputString;
        
    }
    
}
