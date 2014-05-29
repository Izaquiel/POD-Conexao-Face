/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pod.face.rmi;

import br.edu.ifpb.pos.facebook.FacebookService;
import br.edu.ifpb.pos.facebook.FacebookServiceImpl;
import java.io.IOException;
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
        String token = "CAAHLTnYdDYYBACs7m0HtIuJD45q4ZA9KnbC05GqBzK2ldZC1QqmhFIiE0KEYLps1VDcWcgAZBTu3mZCkCDenGNgEQcosZAhGZCCwG7ZAREyMy3EkXyiQVehOTooeptBFCNcgpexqaLshRZCK3A5a8zlOnSBIWzgRu4F5MvqcyHSvsqrozIgn3tZBdsY2LRBHxZBFQZD";
        FacebookService service = new FacebookServiceImpl();
        String response = service.createFeed(token, "#2 testando a integracao com o face, usando java RMI!");
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