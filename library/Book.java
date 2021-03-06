package library;

class Book
{
  private String author, title;
  private String isbn;
  
  public Book()
  {
    this("null", "null", "0");
  }
  
  public Book(String authorIn, String titleIn, String isbnIn)
  {
    author = authorIn;
    title = titleIn;
    isbn = isbnIn;
  }
  
  public String getAuthor()
  {
    return author;
  }
  
  public void setAuthor(String authorIn)
  {
    author = authorIn;
  }
  
  public String getTitle()
  {
    return title;
  }
  
  public void setTitle(String titleIn)
  {
    title = titleIn;
  }
  
    public String getISBN()
  {
    return isbn;
  }
  
  public void setISBN(String isbnIn)
  {
    isbn = isbnIn;
  }
  
  public String toString()
  {
    return "" + getAuthor() + ", " + getTitle() + ", " + getISBN();
  }
}
  
    