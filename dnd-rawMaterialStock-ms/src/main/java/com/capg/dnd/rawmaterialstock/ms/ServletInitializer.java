
  package com.capg.dnd.rawmaterialstock.ms;
  
  import org.springframework.boot.builder.SpringApplicationBuilder; import
  org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
  
  import com.capg.dnd.rawmaterialstock.ms.DndRamMaterialStockMsApplication;
  
  public class ServletInitializer extends SpringBootServletInitializer{
  
  @Override protected SpringApplicationBuilder
  configure(SpringApplicationBuilder application) { return
  application.sources(DndRamMaterialStockMsApplication.class); }
  
  }
 