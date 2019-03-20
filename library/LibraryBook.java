package library;

abstract class LibraryBook extends Book implements Comparable<LibraryBook>
{
  private String callNum;
    
  public LibraryBook()
  {
    this("null","null","0","0");
  }
  
  public LibraryBook(String authorIn, String titleIn, String isbnIn, String callNumIn)
  {
    super(authorIn, titleIn, isbnIn);
    callNum = callNumIn;
  }
  
  public String getCallNum()
  {
    return callNum;
  }
  
  public void setCallNum(String callNumIn)
  {
    callNum = callNumIn;
  }
  
  public abstract void checkout(String name, String date); 
  public abstract String circulationStatus() ;
  public abstract void returned();
  
  public int compareTo(LibraryBook other)
  {
    if(callNum.compareTo(other.getCallNum()) == 0)
      return 0;
    else if(callNum.compareTo(other.getCallNum()) < 0)
      return -1;
      return 1;
  }
  
  public String toString()
  {
    return super.toString() + ", " + getCallNum();
  }
}
  
  