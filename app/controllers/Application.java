package controllers;

import play.*;
import play.mvc.*;
import models.Post;


import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.mongodb.Mongo;

public class Application extends Controller {
  
  public static Result index() throws Exception {
    Morphia morphia = new Morphia();
    Mongo mongo = new Mongo("127.0.0.1",27017);
    Datastore ds = morphia.createDatastore(mongo,"gopal");
    ds.ensureIndexes();
    ds.ensureCaps();			
    Post me = new Post();
    me.postType = "OFFER";
    me.postItem = "Brush";
    me.postLocation = "miyapur";
    ds.save(me);
    me.postType = "WANTED";
    me.postItem = "Cricketbat";
    me.postLocation = "miyapur";
    ds.save(me);
    String result = "";
    for(Post me2 : ds.find(Post.class)){        
        result = me2.postType;
    }
    return ok(result);
  }
  
}
