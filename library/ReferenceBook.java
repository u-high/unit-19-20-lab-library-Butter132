package library;

class ReferenceBook extends LibraryBook
{
  private String collection;
  
  public ReferenceBook()
  {
    this("null","null","0","0","null");
  }
  
  public ReferenceBook(String authorIn, String titleIn, String isbnIn, String callNumIn, String collectionIn)
  {
    super(authorIn, titleIn, isbnIn, callNumIn);
    collection = collectionIn;
  }
  
  public String getCollection()
  {
    return collection;
  }
  
  public void setCollection(String collectionIn)
  {
    collection = collectionIn;
  }
  
  public void checkout(String name, String date)
  {
    System.out.println("cannot check out a reference book");
  }
  
  public void returned()
  {
    System.out.println("reference book could not have been checked out -- return impossible");
  }
  
  public String circulationStatus()
  {
    return "non-circulating reference book";
  }
  
  public String toString()
  {
    return super.toString() + ", " + getCollection();
  }
}