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

        String token = "CAAHLTnYdDYYBAEpxIpZCOg5uAGK2gDD4QqTJD2O10WVN9CMknlFtZAXbZB5bm3NyKg1Nx615lQwjtszMWO7z1RtbKGEz3nld6B9ZC2ZBZBDoKCqlyrF1OXa6OfMiyWvX4Lb8kZCwSIl4lyIR7fZAZADQWEBSdmy15L0AoseNjDwrjVikxj4wt6naJktKiCZA0QJowZD";

       
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
