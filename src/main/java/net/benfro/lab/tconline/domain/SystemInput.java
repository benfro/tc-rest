package net.benfro.lab.tconline.domain;

import lombok.Data;

import java.util.ArrayList;

@Data
public class SystemInput {

   private String database;
   private String mobDatabase;
   private ArrayList<String> elements;

   public SystemInput(String database, ArrayList<String> elements) {
      this.database = database;
      this.elements = elements;
   }
}
