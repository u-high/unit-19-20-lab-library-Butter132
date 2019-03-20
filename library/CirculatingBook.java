package library;

class CirculatingBook extends LibraryBook
{
  private String currentHolder;
  private String dueDate;
  
  public CirculatingBook()
  {
    this("null","null","0","0");
  }
  
  public CirculatingBook(String authorIn, String titleIn, String isbnIn, String callNumIn)
  {
    super(authorIn, titleIn, isbnIn, callNumIn);
  }
  
  public String getCurrentHolder()
  {
    return currentHolder;
  }
  
  public void setCurrentHolder(String currentHolderIn)
  {
    currentHolder = currentHolderIn;
  }
  public String getDueDate()
  {
    return dueDate;
  }
  
  public void setDueDate(String dueDateIn)
  {
    dueDate = dueDateIn;
  }
  
  public void checkout(String name, String date)
  {
    currentHolder = name;
    dueDate = date;
  }
  
  public void returned()
  {
    currentHolder = "null";
    dueDate = "null";
  }
  
  public String circulationStatus()
  {
    if( currentHolder == "null" && dueDate == "null")
      return "book available on shelves";
    return currentHolder + " :: " + dueDate;
  }
  
  public String toString()
  {
    return super.toString() + ", " + getCurrentHolder() + ", " + getDueDate();
  }
}
  