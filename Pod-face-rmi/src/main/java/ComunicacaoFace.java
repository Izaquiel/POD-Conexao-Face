
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
        
        String token = "CAAHLTnYdDYYBABZAKtiUBWZAmB0AxYjUZCmpWdlsiZCPQmLhizmsc0vy460ZCBbePBCa44C4UnIBIvgoYTlm7iPGg1ckizCNtnFGvRL55hVYRtJlsRONBlUDkKVQt21CQBxG2YQ0M2kV2o9T4p4KhWKcHEbRY00JCJZBgtQZBWkeesDPh0TLQUFrV667vQoZAnSszcxmgSBZCCQZDZD";
        Configuration config = new Configuration();
        config.setCharset(Charset.forName("UTF-8"));
        FacebookService service = new FacebookServiceImpl(config);
        
        String response = service.createFeed(token, msg.getMessageContent());
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
