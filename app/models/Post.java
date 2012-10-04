package models;

import org.bson.types.ObjectId;
import com.google.code.morphia.annotations.*;

@Entity
public class Post {

  @Id
  public ObjectId id;
  public String postType;
  public String postItem;
  public String postLocation;
}