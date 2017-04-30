/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.admin.test;

/**
 *
 * @author gsp
 */
import java.io.*;
import java.util.*;

public class SearchStream {
    public static List<String> findLines(String keyword, InputStream inStream) throws Exception {
        throw new UnsupportedOperationException("Waiting to be implemented.");
    }
    
    public static void main(String[] args) throws Exception {
        String inMessage = "Hello, there!\nHow are you today?\nYes, you over there.";
        List<String> lines;

        try(InputStream inStream = new ByteArrayInputStream(inMessage.getBytes())) {
            lines = SearchStream.findLines("there", inStream);
        }
        
        for (int i = 0; i < lines.size(); i++) {
            System.out.println(lines.get(i));
        }
    }
}