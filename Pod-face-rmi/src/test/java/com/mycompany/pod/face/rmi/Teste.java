/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pod.face.rmi;

import br.edu.ifpb.pos.facebook.Configuration;
import br.edu.ifpb.pos.facebook.FacebookService;
import br.edu.ifpb.pos.facebook.FacebookServiceImpl;
import java.io.IOException;
import java.nio.charset.Charset;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Izaquiel Cruz
 */
public class Teste {

    @Test
    public void Teste() throws IOException {
<<<<<<< HEAD
        String token = "CAAHLTnYdDYYBABZAKtiUBWZAmB0AxYjUZCmpWdlsiZCPQmLhizmsc0vy460ZCBbePBCa44C4UnIBIvgoYTlm7iPGg1ckizCNtnFGvRL55hVYRtJlsRONBlUDkKVQt21CQBxG2YQ0M2kV2o9T4p4KhWKcHEbRY00JCJZBgtQZBWkeesDPh0TLQUFrV667vQoZAnSszcxmgSBZCCQZDZD";
=======
        String token = "CAAHLTnYdDYYBACs7m0HtIuJD45q4ZA9KnbC05GqBzK2ldZC1QqmhFIiE0KEYLps1VDcWcgAZBTu3mZCkCDenGNgEQcosZAhGZCCwG7ZAREyMy3EkXyiQVehOTooeptBFCNcgpexqaLshRZCK3A5a8zlOnSBIWzgRu4F5MvqcyHSvsqrozIgn3tZBdsY2LRBHxZBFQZD";
>>>>>>> origin/master
        
        Configuration config = new Configuration();
        config.setCharset(Charset.forName("UTF-8"));
        FacebookService service = new FacebookServiceImpl(config);
        
        String response = service.createFeed(token, "#3 Testando integração com face usando UTF-8!");
        System.out.println(response);
        assertNotNull(response);

    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
}
