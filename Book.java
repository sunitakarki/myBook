public class Book{

   private String title;
   private String isbn;
   private String[] authors;

   public Book(String title, String isbn, String[] authors){
      setTitle(title); 
      setIsbn(isbn); 
      setAuthors(authors); 
   }

   public String getTitle(){
      return title;
   }
   public String getIsbn(){
      return isbn;
   }
   public String[] getAuthors(){
      return authors;
   }
   public void setTitle(String title){
      if(title.length()>50){
         title = title.substring(0,50);
      }
      this.title = title;
   }
   public void setIsbn(String isbn){
      if(isbn.length() != 13){
         isbn="0000000000000";
      }
      this.isbn = isbn;
   }
   public void setAuthors(String[] authors){
      this.authors = authors;
   }

   public String toString(){
      String tmp="Title: "+ title+ "\n"+
         "ISBN: " + isbn +"\nAuthors: ";
         
      for(int i=0; i<authors.length; i++){
          tmp += authors[i];
          if(i != authors.length-1)
              tmp += " & ";
          
          
          
       }
       
       return tmp;
   }
   public static void main(String[] args){
	      
	      String[] a={"Steve Davis", "John Kanet"};
	      Book b=new Book("JAVA","1234561234543", a);
	      
	      System.out.println(b.toString());
	   }

	}
 



