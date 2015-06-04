package com.mkyong;

public class Certificate {
	private int id;
	   private String name; 

	   public Certificate() {}
	   public Certificate(String name) {
	      this.name = name;
	   }
	   public int getId() {
	      return id;
	   }
	   public void setId( int id ) {
	      this.id = id;
	   }
	   public String getName() {
	      return name;
	   }
	   public void setName( String name ) {
	      this.name = name;
	   }
	   public boolean equals(Object obj) {
			if(obj==null)return false;
			if(!(obj instanceof Certificate)){
				return false;
			}
			Certificate obj2=(Certificate)obj;
			if(this.id==obj2.getId()){
				return true;
			}
			return false;
		}
	   public int hashCode() {
		   int code=0;
		   code=(id+name).hashCode();
		   return code;
	    
	   }
}
